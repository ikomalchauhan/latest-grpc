package com.optum.grpcserver.client;

import java.util.concurrent.TimeUnit;

import com.optum.grpcserver.Author;
import com.optum.grpcserver.BookAuthorServiceGrpc;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class BookAuthorUnaryClient {

	public static void main(String[] args) throws Exception {
		String serverAddress = "localhost:50051";
		ManagedChannel channel = ManagedChannelBuilder.forTarget(serverAddress).usePlaintext().build();
		BookAuthorServiceGrpc.BookAuthorServiceBlockingStub stub = BookAuthorServiceGrpc.newBlockingStub(channel);
		try {
			Author response = stub.getAuthor(Author.newBuilder().setAuthorId(1).build());
			System.out.println(response.toString());
		} finally {
			channel.shutdownNow().awaitTermination(5, TimeUnit.SECONDS);
		}
	}

}
