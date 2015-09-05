package com.rao.ws;

import javax.jws.WebService;

@WebService(endpointInterface="com.rao.ws.HelloWorld")
public class HelloWorldImpl implements HelloWorld{

	@Override
	public String sayHello(String name) {
		// TODO Auto-generated method stub
		return "Saying Hello: "+name;
	}

}
