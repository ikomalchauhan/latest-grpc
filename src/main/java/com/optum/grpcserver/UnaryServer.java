package com.optum.grpcserver;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import io.grpc.Server;
import io.grpc.ServerBuilder;

public class UnaryServer {

	private Server server;

	private void start() throws IOException {
		int port = 50051;
		server = ServerBuilder.forPort(port).addService(new BookAuthorServiceImpl()).build().start();
		System.out.println("gRPC server starting...");

		Runtime.getRuntime().addShutdownHook(new Thread() {
			@Override
			public void run() {
				System.err.println("Shutting down gRPC server...");
				try {
					server.shutdown().awaitTermination(30, TimeUnit.SECONDS);
				} catch (Exception e) {
					e.printStackTrace(System.err);
				}
			}
		});

	}

	public static void main(String[] args) throws InterruptedException, IOException {
		UnaryServer unaryServer = new UnaryServer();
		unaryServer.start();
		unaryServer.server.awaitTermination();
	}

}
