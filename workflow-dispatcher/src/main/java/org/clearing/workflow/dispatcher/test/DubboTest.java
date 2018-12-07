package org.clearing.workflow.dispatcher.test;

import java.util.HashMap;

import org.clearing.frame.rpc.server.RPCServer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DubboTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		RPCServer rpcServer = (RPCServer) context.getBean("rpcServer");
		System.out.println(rpcServer.doServer(null ));
		System.out.println(rpcServer.doServer(new HashMap<>()).getResult());
	}
}
