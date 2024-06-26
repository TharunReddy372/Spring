package com.ciq.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.ciq.dao.CreditCardDAO;
import com.ciq.dao.CreditCardDAOImpl;
import com.ciq.dao.DebitCardDAO;
import com.ciq.dao.DebitCardDAOImpl;
import com.ciq.service.CardService;
import com.ciq.service.CardServiceImpl;

@Configuration
@ComponentScan(basePackages = "com.ciq")
public class SpringConfiguration {
//	@Bean
//	public CreditCardDAO creditCardDAO() {
//		return new CreditCardDAOImpl();
//		
//	}
//	@Bean
//	public DebitCardDAO deditCardDAO() {
//		return new DebitCardDAOImpl();
//		
//	}
//	@Bean
//	public CardService cardService() {
//		return new CardServiceImpl();
//	}


}
