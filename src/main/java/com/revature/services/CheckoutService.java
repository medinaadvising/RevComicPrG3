package com.revature.services;

import java.util.List;

import com.revature.models.Checkouts;
import com.revature.repositories.CheckoutDAO;



// adapt from jose 220123
//public class TransactionsService {

public class CheckoutService {

	
	CheckoutDAO chDAO = new CheckoutDAO(); 

	
	public List<Checkouts> getCheckouts() {
	
		List<Checkouts> allcheckouts = chDAO.getAllCheckouts();
		return allcheckouts;
	}
	
	public void addCheckout(Checkouts newCheckout) {
		chDAO.insertCheckout(newCheckout);
	}

	
	public Checkouts updateCheckout(Checkouts tochange) {
		
		int coid = chDAO.UpdateCheckout(tochange);
		Checkouts updatedcho = chDAO.getCheckoutById(coid);
		
		return updatedcho;	
	}

	public Checkouts getCheckoutById(int id) {
		
		Checkouts checkoutbyid = chDAO.getCheckoutById(id);

		return checkoutbyid;
	}

}

