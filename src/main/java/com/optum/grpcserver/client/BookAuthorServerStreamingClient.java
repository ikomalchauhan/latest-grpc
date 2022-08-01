package com.optum.grpcserver.client;

import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import com.optum.grpcserver.Author;
import com.optum.grpcserver.Book;
import com.optum.grpcserver.BookAuthorServiceGrpc;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class BookAuthorServerStreamingClient {

	public static void main(String[] args) throws Exception {
		String serverAddress = "localhost:50051";
		ManagedChannel channel = ManagedChannelBuilder.forTarget(serverAddress).usePlaintext().build();
		BookAuthorServiceGrpc.BookAuthorServiceBlockingStub stub = BookAuthorServiceGrpc.newBlockingStub(channel);
		try {
			Iterator<Book> response = stub.getBooksByAuthor(Author.newBuilder().setAuthorId(1).build());
			while(response.hasNext()) {
				System.out.println(response.next().toString());				
			}
			
		} finally {
			channel.shutdownNow().awaitTermination(5, TimeUnit.SECONDS);
		}
	}

}
