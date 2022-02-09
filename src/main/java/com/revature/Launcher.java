package com.revature;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import com.revature.utils.HibernateUtil;

public class Launcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try(Session ses = HibernateUtil.getSession()) {
		System.out.println("Connection Successful");
	} catch (HibernateException e) {
		System.out.println("Connection Failed!");
		e.printStackTrace();
	}


		
		
		
		
		
		
		
		
		
		
		
	}

}


// from jose 220123

//
//package com.revature;
//
//import org.hibernate.HibernateException;
//import org.hibernate.Session;
//
//import com.revature.utils.HibernateUtil;
//
//import com.revature.controller.AuthController;
//import com.revature.controller.TransactionsController;
//import com.revature.controller.UsersController;
//import com.revature.repositories.UserDAO;
//
//import io.javalin.Javalin;
//
//public class Driver {
//
//	public static void main(String[] args) {
//		
//		
//	
//		    	UsersController usc = new UsersController();
//		    	TransactionsController tc = new TransactionsController();
//		    	AuthController ac = new AuthController();
//		    	
//				
//				/*
//				 * try(Session ses = HibernateUtil.getSession()) {
//				 * System.out.println("Connection Successful"); } catch (HibernateException e) {
//				 * System.out.println("Connection Failed!"); e.printStackTrace(); }
//				 */
//				 
//		    	
//		   
//		    	
//		    	Javalin app = Javalin.create(
//						config -> {
//							config.enableCorsForAllOrigins();
//						}
//					).start(3000);
//		    	
//		    	app.post("/login", ac.loginHandler);
//		    	app.get("/user",  usc.getUsersHandler);
//				app.post("/user", usc.insertUserHandler);
//				app.get("/user/{users_id}", usc.getUsersByIdHandler);
//				app.put("/user/{users_id}", usc.updateUsersHandler);
//				
//				//this can be where we add the marvel api functionality
//				app.get("/transaction",  tc.getTransactionsHandler);
//				app.post("/transaction", tc.insertTransactionsHandler);
//				app.get("/transaction/{trans_user}", tc.getTransactionsByIdHandler);
//				app.put("/transaction/{trans_id}", tc.updateTransactionsHandler);
//				
//			}
//
//	}
//
//

