package com.ciq.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ciq.config.SpringConfiguration;
import com.ciq.service.CardService;

public class TestDemoJavaConfig {
	public static void main(String[] args) {
		
		ApplicationContext applicationContext =  new AnnotationConfigApplicationContext(SpringConfiguration.class);
		
		CardService cardService = (CardService) applicationContext.getBean("cardService");
		
		cardService.getCardDetails();
	}

}
