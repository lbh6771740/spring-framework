package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("org.example");
		UserService userService = context.getBean(UserService.class);
		userService.printA();
	}
}

