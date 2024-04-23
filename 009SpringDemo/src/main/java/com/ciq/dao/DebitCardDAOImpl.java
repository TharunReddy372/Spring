package com.ciq.dao;

import org.springframework.stereotype.Repository;

@Repository
public class DebitCardDAOImpl implements DebitCardDAO {

	@Override
	public void getDebitCardDetails() {
		System.out.println("Card Type is VISA DEBIT CARD :: Card Number is : 3256 8754 5834");
	}

}
