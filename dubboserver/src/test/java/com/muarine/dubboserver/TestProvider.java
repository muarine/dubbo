package com.muarine.dubboserver;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestProvider {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
//        com.alibaba.dubbo.container.Main.main(args);
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] { "applicationContext.xml" });
		context.start();	
		System.out.println("按任意键退出");
		System.in.read();
	}

}