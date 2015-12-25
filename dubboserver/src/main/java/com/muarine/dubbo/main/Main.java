package com.muarine.dubbo.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String("applicationContext.xml"));
		context.start();
		Thread.currentThread().join();
	}
}
