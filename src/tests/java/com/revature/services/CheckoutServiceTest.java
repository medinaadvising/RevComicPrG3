package com.revature.services;

import static org.junit.Assert.*;
import static org.junit.Assert.assertThrows;
import static org.mockito.Matchers.anyObject;


import com.revature.models.Checkouts;
import com.revature.models.Users;
import org.junit.Test;

import com.revature.exceptions.CheckoutUnsuccessfulException;
import com.revature.exceptions.RegistrationUnsuccessfulException;
import com.revature.models.Users;
import com.revature.repositories.CheckoutDAO;

public class CheckoutServiceTest {
	
	
	private static CheckoutService checkoutService;
	private static UserService UserService;
	private static CheckoutDAO CheckoutDAO;
	
	
	private Checkouts USER_TO_Checkout;
	private Users GENERIC_User_1;

	@Test
	public void testFailsWhenCheckoutIsUnsuccessful() {
		when(CheckoutDAO.create(anyObject())).thenThrow(new CheckoutUnsuccessfulException());

		assertThrows(CheckoutUnsuccessfulException.class
				
		);
	}

	private void assertThrows(Class<CheckoutUnsuccessfulException> class1) {
		// TODO Auto-generated method stub
		
	}

}
