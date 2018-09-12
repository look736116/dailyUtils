package com.my.test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.my.server.impl.RoleServerImpl;

public class TestBird {
	public static void main(String[] args) {
	
		AbstractApplicationContext  context = new ClassPathXmlApplicationContext("config/spring-mybatis.xml");
		RoleServerImpl rm = (RoleServerImpl)context.getBean("roleServerImpl");
		System.out.println(rm.getRoleById("1").getRoleName());
				}

}
