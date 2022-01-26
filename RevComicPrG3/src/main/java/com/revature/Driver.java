package com.revature;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import com.revature.utils.HibernateUtil;

import com.revature.controller.AuthController;
import com.revature.controller.CreatorController;
import com.revature.controller.ItemController;
import com.revature.controller.TransactionsController;
import com.revature.controller.UsersController;
import io.javalin.Javalin;

public class Driver {

	public static void main(String[] args) {
		
		
	
		    	UsersController usc = new UsersController();
		    	TransactionsController tc = new TransactionsController();
		    	AuthController ac = new AuthController();
		    	ItemController ic = new ItemController();
		    	CreatorController cc = new CreatorController();
		    	
				
				/*
				 * try(Session ses = HibernateUtil.getSession()) {
				 * System.out.println("Connection Successful"); } catch (HibernateException e) {
				 * System.out.println("Connection Failed!"); e.printStackTrace(); }
				 */
				 
		    	
		   
		    	
		    	Javalin app = Javalin.create(
						config -> {
							config.enableCorsForAllOrigins();
						}
					).start(3000);
		    	
		    	app.post("/login", ac.loginHandler);
		    	app.get("/user",  usc.getUsersHandler);
				app.post("/user", usc.insertUserHandler);
				app.get("/user/{users_id}", usc.getUsersByIdHandler);
				app.put("/user/{users_id}", usc.updateUsersHandler);
				
				
				app.get("/transaction",  tc.getTransactionsHandler);
				app.post("/transaction", tc.insertTransactionsHandler);
				app.get("/transaction/{users_id}", tc.getTransactionsByIdHandler);
				app.put("/transaction/{trans_id}", tc.updateTransactionsHandler);
				
				app.get("/items",  ic.getItemsHandler);
				app.post("/items", ic.insertItemHandler);
				app.get("/items/{item_id}", ic.getItemsByIdHandler);
				app.get("/items/creator/{creator_id}", ic.getItemsByCreatorIdHandler);
				app.get("/items/creator/{creatorName}", ic.getItemsByCreatorHandler);
				app.put("/items/{item_id}", ic.updateItemsHandler);
				
				app.get("/creators",  cc.getCreatorsHandler);
				app.post("/creators", cc.insertCreatorHandler);
				app.get("/creators/{creator_id}", cc.getCreatorsByIdHandler);
				app.put("/creators/{creator_id}", cc.updateCreatorsHandler);
				
			}

	}


