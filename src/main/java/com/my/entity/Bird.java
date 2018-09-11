package com.my.entity;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Required;

public class Bird  {
	String bridName;
	
	String color;
	
	
	public Bird() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Bird(String bridName, String color) {
		super();
		this.bridName = bridName;
		this.color = color;
	}

	public String getBridName() {
		return bridName;
	}
	public void setBridName(String bridName) {
		this.bridName = bridName;
	}
	public String getColor() {
		return color;
	}
	
	@Required
	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public String toString() {
		return "Bird [bridName=" + bridName + ", color=" + color + "]";
	}
	
	public void initBean() {
		// TODO Auto-generated method stub
		System.out.println("init");
		
	}
	
	@PostConstruct
	public void  guessbeforeInit(){
		System.out.println("before init!");
		
	}
	
	@PreDestroy
	public void  guessbeforeDestory(){
		System.out.println("before destory!");
		
	}
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("destory");		
	}
}
