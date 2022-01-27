package com.revature.controllers;

import java.util.List;

import com.google.gson.Gson;
import com.revature.models.Creators;
import com.revature.services.CreatorService;

import io.javalin.http.Handler;


////adapted from jose 220123
////public class TransactionsController {


public class CreatorController {

	CreatorService crs = new CreatorService();

	
	public Handler getAllCreatorsHandler = (ctx) -> {
		if(ctx.req.getSession(true) !=null) {
			List<Creators> allcreators = crs.getCreators();
		
			Gson gson = new Gson();
			
			String JSONallcreators = gson.toJson(allcreators);
			
			ctx.result(JSONallcreators);
			ctx.status(200);
			
		} else {
			ctx.result("Oh no you failed to get all creators!!!");
			ctx.status(404);
		}
	};
	
	public Handler insertCreatorHandler = (ctx) ->{
		if(ctx.req.getSession(true) !=null) {
			
			String body = ctx.body();
			
			Gson gson = new Gson();
			
			Creators newtran = gson.fromJson(body, Creators.class);
			
			crs.addCreator(newtran);
			
			ctx.result("Creator was successfully added!");
			ctx.status(201);
			
		} else {
			ctx.result("Oh no you failed to add the creator!!!");
			ctx.status(404);
		}
	};
	
	public Handler updateCreatorHandler = (ctx) -> {
		if(ctx.req.getSession(true) !=null) {
		
			
			int trans_id = Integer.parseInt(ctx.pathParam("creator_id"));
			
			Gson gson = new Gson();
			
			String body = ctx.body();
		
		    Creators tochange = gson.fromJson(body, Creators.class);
			
			Creators updatedtran = crs.updateCreator(tochange);
			
			String JSONupdated = gson.toJson(updatedtran);
			
			
			ctx.result(JSONupdated);
			ctx.status(200);
			
		} else {
			ctx.result("Oh no you failed to update the creator!!!");
			ctx.status(404);
		}
	};
	
	public Handler getCreatorByIdHandler = (ctx) -> {
		if(ctx.req.getSession(true) !=null) {
			
			int transid = Integer.parseInt(ctx.pathParam("creator_id"));
			
			Creators creatorbyid = crs.getCreatorById(transid); 			
			Gson gson = new Gson();
			
			
			String JSONresult = gson.toJson(creatorbyid);
			
			
			ctx.result(JSONresult);
			ctx.status(200);
			
		} else {
			ctx.result("Oh no you failed to get your creator by its ID!!!");
			ctx.status(404);
		}
	};
}

