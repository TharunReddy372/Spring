package com.ciq.dao;

import org.springframework.stereotype.Repository;

@Repository
public class CreditCardDAOImpl implements CreditCardDAO {

	@Override
	public void getCreditCardDetails() {
		System.out.println("Card type is VISA CREDIT CARD :: Card Number is :: 6834 6766 8540");
	}

}
