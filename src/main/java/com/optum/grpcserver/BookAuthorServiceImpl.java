package com.optum.grpcserver;

import java.util.Iterator;
import java.util.List;

import com.optum.grpcserver.BookAuthorServiceGrpc.BookAuthorServiceImplBase;

import io.grpc.stub.StreamObserver;

public class BookAuthorServiceImpl extends BookAuthorServiceImplBase {

	@Override
	public void getAuthor(Author request, StreamObserver<Author> responseObserver) {
		List<Author> author = TempDB.getAuthorsFromTempDb().stream()
				.filter(authr -> authr.getAuthorId() == request.getAuthorId()).toList();
		responseObserver.onNext(author.get(0));
		responseObserver.onCompleted();
	}

	@Override
	public void getBooksByAuthor(Author request, StreamObserver<Book> responseObserver) {
		List<Book> books = TempDB.getBooksFromTempDb().stream()
				.filter(book -> book.getAuthorId() == request.getAuthorId()).toList();
		Iterator iterator = books.iterator();
		while (iterator.hasNext()) {
			responseObserver.onNext((Book) iterator.next());
		}
		responseObserver.onCompleted();
	}

	@Override
	public StreamObserver<Book> getExpensiveBook(StreamObserver<Cart> responseObserver) {
		return new StreamObserver<Book>() {
			float price;
			int totalPages;

			@Override
			public void onNext(Book book) {
				System.out.println("Book with title: " + book.getTitle());
				price += book.getPrice();
				totalPages += book.getPages();
			}

			@Override
			public void onError(Throwable t) {
				System.err.println("Error while reading book streaming: " + t);
			}

			@Override
			public void onCompleted() {
				System.err.println("Cart Value: " + price + "; Book Pages: " + totalPages);
				responseObserver.onNext(Cart.newBuilder().setPrice((int) price).setBooks(totalPages).build());
				responseObserver.onCompleted();
			}
		};
	}

	@Override
	public StreamObserver<Book> getBooksByGender(StreamObserver<Cart> responseObserver) {
		return new StreamObserver<Book>() {

			@Override
			public void onNext(Book book) {
				System.out.println("Book with title: " + book.getTitle());
				System.err.println("Cart Value: " + book.getPrice() + "; Book Pages: " + book.getPages());
				responseObserver
						.onNext(Cart.newBuilder().setPrice((int) book.getPrice()).setBooks(book.getPages()).build());
			}

			@Override
			public void onError(Throwable t) {
				System.err.println("Error while reading book streaming: " + t);
			}

			@Override
			public void onCompleted() {
				responseObserver.onCompleted();
			}
		};
	}

}
