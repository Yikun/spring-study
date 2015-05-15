package com.kero.SpringHello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	private static ApplicationContext context;

	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("com/kero/SpringHello/beans.xml");
		
		HelloSpring obj = (HelloSpring) context.getBean("helloWorld");
		
		System.out.println(obj.getMessage());
	}
}
