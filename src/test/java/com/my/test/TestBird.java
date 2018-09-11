package com.my.test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.my.entity.Bird;

public class TestBird {
	public static void main(String[] args) {
	
		AbstractApplicationContext  context = new ClassPathXmlApplicationContext("config/spring.xml");
		Bird bird = (Bird) context.getBean("bird");
		System.out.println(bird);
		context.close();
		
		
		
	}

}
