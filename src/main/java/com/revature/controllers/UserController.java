package com.revature.controllers;
//

//
//}



import java.util.List;

import com.google.gson.Gson;
import com.revature.models.Users;
import com.revature.services.UserService;

import io.javalin.http.Handler;

// adapted from Jose UsersController 220223


public class UserController {
	
	UserService us = new UserService();
	

	public Handler getUsersHandler = (ctx) -> {
		if(ctx.req.getSession(true) !=null) {
			List<Users> allUsers = us.getUsers();
			
			Gson gson = new Gson();
			
			String JSONUsers = gson.toJson(allUsers);
			
			ctx.result(JSONUsers);
			ctx.status(200);
			
		} else {
			ctx.result("Oh no you failed to get the users!!!");
			ctx.status(404);
		}
	};
	
	public Handler insertUserHandler = (ctx) ->{
		if(ctx.req.getSession(true) !=null) {
			
			String body = ctx.body();
			
			Gson gson = new Gson();
			
			Users user = gson.fromJson(body, Users.class);
			
			us.addUser(user);
			
			ctx.result("User was successfully added!");
			ctx.status(201);
			
		} else {
			ctx.result("Oh no you failed to add the user!!!");
			ctx.status(404);
		}
	};
	
	public Handler getUsersByIdHandler = (ctx) -> {
		if(ctx.req.getSession(true) !=null) {
			
			int users_id = Integer.parseInt(ctx.pathParam("users_id"));
			
			Users UsersById = us.getUserById(users_id);
			
			Gson gson = new Gson();
			
			
			String JSONuser = gson.toJson(UsersById);
			
			
			ctx.result(JSONuser);
			ctx.status(200);
			
		} else {
			ctx.result("Oh no you failed to get the user!!!");
			ctx.status(404);
		}
	};

	
	
	public Handler updateUsersHandler = (ctx) -> {
		if(ctx.req.getSession(true) !=null) {
			
			
			int users_id = Integer.parseInt(ctx.pathParam("users_id"));
			
			Gson gson = new Gson();
			
			String body = ctx.body();
			
			Users user = gson.fromJson(body, Users.class);
			
			Users UpdateUser = us.updateUser(user);
			
			String JSONuser = gson.toJson(UpdateUser);
			
			
			ctx.result(JSONuser);
			ctx.status(200);
			
	
	} else {
			ctx.result("Oh no you failed to update the user!!!");
			ctx.status(404);
		}
	};

}

