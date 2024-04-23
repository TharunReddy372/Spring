package com.ciq.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ciq.demo.HelloWorldBean;
import com.ciq.demo.WelcomeBean;

public class Test {
	
	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
		
		HelloWorldBean helloWorldBean=(HelloWorldBean) applicationContext.getBean("HelloWorldBean");
		helloWorldBean.sayHello("bhargav");
		
		WelcomeBean welcomeBean = (WelcomeBean) applicationContext.getBean("WelcomeBean");
		welcomeBean.sayWelcome("Tharun");
	}
	
}
