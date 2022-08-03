package com.optum.grpcserver.client;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import com.optum.grpcserver.Book;
import com.optum.grpcserver.BookAuthorServiceGrpc;
import com.optum.grpcserver.BookAuthorServiceGrpc.BookAuthorServiceStub;
import com.optum.grpcserver.Cart;
import com.optum.grpcserver.TempDB;

import io.grpc.Channel;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

public class BookAuthorClientStreamingClient {

	private final BookAuthorServiceStub stub;
	private StreamObserver<Book> streamClientSender = null;

	public BookAuthorClientStreamingClient(Channel channel) {
		stub = BookAuthorServiceGrpc.newStub(channel);
	}

	public StreamObserver<Cart> getServerResponseObserver() {
		StreamObserver<Cart> observer = new StreamObserver<Cart>() {
			@Override
			public void onNext(Cart cart) {
				System.out.println("Order summary:" + "\nTotal number of Books:" + cart.getBooks()
						+ "\nTotal Order Value:" + cart.getPrice());
			}

			@Override
			public void onCompleted() {
				System.out.println("Server: Done ordering cart");
			}

			@Override
			public void onError(Throwable t) {
				System.err.println("Error in client: " + t);

			}
		};
		return observer;
	}

	public void addBook(Book book) {
//		Book request = Book.newBuilder().setTitle(book).build();
		Random random = new Random();
		if (streamClientSender == null) {
			streamClientSender = stub.getExpensiveBook(getServerResponseObserver());
		}
		try {
			System.out.println("Adding book with title starting with: " + book);
			streamClientSender.onNext(book);
			Thread.sleep(random.nextInt(1000) + 500);
		} catch (Exception e) {
			System.err.println("RPC failed: " + e.getMessage());
		}
	}

	public void completeOrder() {
		if (streamClientSender != null) {
			System.out.println("Done, waiting for server to create order summary...");
			streamClientSender.onCompleted();
		}
	}

	public static void main(String[] args) throws Exception {
		String serverAddress = "localhost:50051";
		ManagedChannel channel = ManagedChannelBuilder.forTarget(serverAddress).usePlaintext().build();
		try {
			BookAuthorClientStreamingClient client = new BookAuthorClientStreamingClient(channel);

			List<Book> books = TempDB.getBooksFromTempDb();
			for (Book book : books) {
				client.addBook(book);
			}
			client.completeOrder();
		} finally {
			channel.shutdownNow().awaitTermination(5, TimeUnit.SECONDS);
		}
	}

}
