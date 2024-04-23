package com.ciq.bean;

public class HelloWorldBean {
	
	public HelloWorldBean() {
		System.out.println("Hello World Object Created");
	}
	
	private String name;
	
	public void setName(String name) {
		System.out.println("Hello World DI happen");
		this.name = name;
	}
	
	public void displayName() {
		System.out.println("HelloWorld : "+name);
	}
	
	public void init() {
		System.out.println("Hello World Init method called");
	}
	
	public void destroy() {
		System.out.println("Hello World destroy method invoked ");
	}

}
