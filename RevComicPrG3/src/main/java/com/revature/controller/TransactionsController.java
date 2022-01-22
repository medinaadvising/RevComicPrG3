package com.revature.controller;

import java.util.List;

import com.google.gson.Gson;
import com.revature.models.Transactions;
import com.revature.services.TransactionsService;

import io.javalin.http.Handler;

public class TransactionsController {
	
TransactionsService ts = new TransactionsService();
	
	public Handler getTransactionsHandler = (ctx) -> {
		if(ctx.req.getSession(true) !=null) {
			List<Transactions> allTransactions = ts.getTransactions();
			
			Gson gson = new Gson();
			
			String JSONTransactions = gson.toJson(allTransactions);
			
			ctx.result(JSONTransactions);
			ctx.status(200);
			
		} else {
			ctx.result("Oh no you failed to get the transactions!!!");
			ctx.status(404);
		}
	};
	
	public Handler insertTransactionsHandler = (ctx) ->{
		if(ctx.req.getSession(true) !=null) {
			
			String body = ctx.body();
			
			Gson gson = new Gson();
			
			Transactions tran = gson.fromJson(body, Transactions.class);
			
			ts.addTransactions(tran);
			
			ctx.result("Transaction was successfully added!");
			ctx.status(201);
			
		} else {
			ctx.result("Oh no you failed to add the transaction!!!");
			ctx.status(404);
		}
	};
	
	public Handler updateTransactionsHandler = (ctx) -> {
		if(ctx.req.getSession(true) !=null) {
			
			
			int trans_id = Integer.parseInt(ctx.pathParam("trans_id"));
			
			Gson gson = new Gson();
			
			String body = ctx.body();
			
			Transactions trans_status = gson.fromJson(body, Transactions.class);
			
			Transactions UpdateStatus = ts.updateTransactions(trans_status);
			
			String JSONStatus = gson.toJson(UpdateStatus);
			
			
			ctx.result(JSONStatus);
			ctx.status(200);
			
		} else {
			ctx.result("Oh no you failed to update the status!!!");
			ctx.status(404);
		}
	};
	
	public Handler getTransactionsByIdHandler = (ctx) -> {
		if(ctx.req.getSession(true) !=null) {
			
			int trans_user = Integer.parseInt(ctx.pathParam("trans_user"));
			
			List<Transactions> TransById = ts.getTransactionsById(trans_user);
			
			Gson gson = new Gson();
			
			
			String JSONTransactions = gson.toJson(TransById);
			
			
			ctx.result(JSONTransactions);
			ctx.status(200);
			
		} else {
			ctx.result("Oh no you failed to get your transactions!!!");
			ctx.status(404);
		}
	};

}
