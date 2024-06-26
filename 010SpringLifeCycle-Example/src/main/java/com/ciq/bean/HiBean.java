package com.ciq.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class HiBean {
	
	public HiBean() {
		System.out.println("Hi Object Created");
	}
	
	private String name;
	
	public void setName(String name) {
		System.out.println("Hi DI happen");
		this.name = name;
	}
	
	public void displayName() {
		System.out.println("Hi : "+name);
	}
	@PostConstruct
	public void init() {
		System.out.println("Hi Init method called");
	}
	@PreDestroy
	public void destroy() {
		System.out.println("Hi destroy method invoked ");
	}

}
