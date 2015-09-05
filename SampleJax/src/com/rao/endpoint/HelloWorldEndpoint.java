package com.rao.endpoint;

import javax.xml.ws.Endpoint;

import com.rao.ws.HelloWorldImpl;

public class HelloWorldEndpoint {

	public static void main(String[] args) {
		System.out.println("Starting endpoint");
		Endpoint.publish("http://localhost:9999/ws/hello", new HelloWorldImpl());
	}
}
