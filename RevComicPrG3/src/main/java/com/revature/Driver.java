package com.revature;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import com.revature.utils.HibernateUtil;

import com.revature.controller.AuthController;
import com.revature.controller.UsersController;


import io.javalin.Javalin;

public class Driver {

	public static void main(String[] args) {
		
		
		    	
		    	UsersController usc = new UsersController();
		    	
		    	AuthController ac = new AuthController();
		    	
		    	try(Session ses = HibernateUtil.getSession()) {
					System.out.println("Connection Successful");
				} catch (HibernateException e) {
					System.out.println("Connection Failed!");
					e.printStackTrace();
				}
		    	
		    	
		    	//Menu menu = new Menu();
		    	
		    	//menu.displayMenu();
		    	
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
				
				//this can be where we add the marvel api functionality
				
				
			}

	}


