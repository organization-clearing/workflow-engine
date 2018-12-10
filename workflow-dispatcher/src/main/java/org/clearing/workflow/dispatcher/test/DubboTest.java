package org.clearing.workflow.dispatcher.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DubboTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//		System.out.println(context.getBean("dataSource"));		
	}
}
