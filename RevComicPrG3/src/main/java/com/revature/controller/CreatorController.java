package com.revature.controller;

import java.util.List;

import com.google.gson.Gson;
import com.revature.models.Creators;
import com.revature.services.CreatorService;
import io.javalin.http.Handler;

public class CreatorController {
	

	CreatorService cs = new CreatorService();
	

	public Handler getCreatorsHandler = (ctx) -> {
		if(ctx.req.getSession(true) !=null) {
			List<Creators> allCreators = cs.getCreators();
			
			Gson gson = new Gson();
			
			String JSONCreators = gson.toJson(allCreators);
			
			ctx.result(JSONCreators);
			ctx.status(200);
			
		} else {
			ctx.result("Oh no you failed to get the Creators!!!");
			ctx.status(404);
		}
	};
	
	public Handler insertCreatorHandler = (ctx) ->{
		if(ctx.req.getSession(true) !=null) {
			
			String body = ctx.body();
			
			Gson gson = new Gson();
			
			Creators creator = gson.fromJson(body, Creators.class);
			
			cs.addCreator(creator);
			
			ctx.result("Creator was successfully added!");
			ctx.status(201);
			
		} else {
			ctx.result("Oh no you failed to add the creator!!!");
			ctx.status(404);
		}
	};
	
	public Handler getCreatorsByIdHandler = (ctx) -> {
		if(ctx.req.getSession(true) !=null) {
			
			int creator_id = Integer.parseInt(ctx.pathParam("creator_id"));
			
			Creators CreatorById = cs.getCreatorById(creator_id);
			
			Gson gson = new Gson();
			
			
			String JSONCreators = gson.toJson(CreatorById);
			
			
			ctx.result(JSONCreators);
			ctx.status(200);
			
		} else {
			ctx.result("Oh no you failed to get the Creator!!!");
			ctx.status(404);
		}
	};

	
	
	public Handler updateCreatorsHandler = (ctx) -> {
		if(ctx.req.getSession(true) !=null) {
			
			
			int creator_id = Integer.parseInt(ctx.pathParam("creator_id"));
			
			Gson gson = new Gson();
			
			String body = ctx.body();
			
			Creators creator = gson.fromJson(body, Creators.class);
			
			Creators UpdateCreator = cs.updateCreator(creator);
			
			String JSONCreators = gson.toJson(UpdateCreator);
			
			
			ctx.result(JSONCreators);
			ctx.status(200);
			
		} else {
			ctx.result("Oh no you failed to update the Creator!!!");
			ctx.status(404);
		}
	};

}
