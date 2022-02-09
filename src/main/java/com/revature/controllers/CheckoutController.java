package com.revature.controllers;

import java.util.List;

import com.google.gson.Gson;
import com.revature.models.Checkouts;
import com.revature.services.CheckoutService;

import io.javalin.http.Handler;


// adapted from jose 220123
//public class TransactionsController {
public class CheckoutController {

	CheckoutService chs = new CheckoutService();
	
	public Handler getAllCheckoutsHandler = (ctx) -> {
		if(ctx.req.getSession(true) !=null) {
			List<Checkouts> allcheckouts = chs.getCheckouts();
		
			Gson gson = new Gson();
			
			String JSONallcheckouts = gson.toJson(allcheckouts);
			
			ctx.result(JSONallcheckouts);
			ctx.status(200);
			
		} else {
			ctx.result("Oh no you failed to get all checkouts!!!");
			ctx.status(404);
		}
	};
	
	public Handler insertCheckoutHandler = (ctx) ->{
		if(ctx.req.getSession(true) !=null) {
			
			String body = ctx.body();
			
			Gson gson = new Gson();
			
			Checkouts newtran = gson.fromJson(body, Checkouts.class);
			
			chs.addCheckout(newtran);
			
			ctx.result("Transaction was successfully added!");
			ctx.status(201);
			
		} else {
			ctx.result("Oh no you failed to add the transaction!!!");
			ctx.status(404);
		}
	};
	
	public Handler updateCheckoutHandler = (ctx) -> {
		if(ctx.req.getSession(true) !=null) {
			
			
			int trans_id = Integer.parseInt(ctx.pathParam("trans_id"));
			
			Gson gson = new Gson();
			
			String body = ctx.body();
			
		    Checkouts tochange = gson.fromJson(body, Checkouts.class);
			
			Checkouts updatedtran = chs.updateCheckout(tochange);
			
			String JSONupdated = gson.toJson(updatedtran);
			
			
			ctx.result(JSONupdated);
			ctx.status(200);
			
		} else {
			ctx.result("Oh no you failed to update the checkout!!!");
			ctx.status(404);
		}
	};
	
	public Handler getCheckoutByIdHandler = (ctx) -> {
		if(ctx.req.getSession(true) !=null) {
			
			int transid = Integer.parseInt(ctx.pathParam("checkout_id"));
			
			Checkouts checkoutbyid = chs.getCheckoutById(transid); 			
			Gson gson = new Gson();
			
			
			String JSONresult = gson.toJson(checkoutbyid);
			
			
			ctx.result(JSONresult);
			ctx.status(200);
			
		} else {
			ctx.result("Oh no you failed to get your transaction by its ID!!!");
			ctx.status(404);
		}
	};

}
//
