package com.revature.controller;

import java.util.List;

import com.google.gson.Gson;
import com.revature.models.Items;
import com.revature.services.ItemService;
import io.javalin.http.Handler;

public class ItemController {
	
	ItemService is = new ItemService();
	

	public Handler getItemsHandler = (ctx) -> {
		if(ctx.req.getSession(true) !=null) {
			List<Items> allItems = is.getItems();
			
			Gson gson = new Gson();
			
			String JSONItems = gson.toJson(allItems);
			
			ctx.result(JSONItems);
			ctx.status(200);
			
		} else {
			ctx.result("Oh no you failed to get the items!!!");
			ctx.status(404);
		}
	};
	
	public Handler insertItemHandler = (ctx) ->{
		if(ctx.req.getSession(true) !=null) {
			
			String body = ctx.body();
			
			Gson gson = new Gson();
			
			Items item = gson.fromJson(body, Items.class);
			
			is.addItem(item);
			
			ctx.result("Item was successfully added!");
			ctx.status(201);
			
		} else {
			ctx.result("Oh no you failed to add the item!!!");
			ctx.status(404);
		}
	};
	
	public Handler getItemsByIdHandler = (ctx) -> {
		if(ctx.req.getSession(true) !=null) {
			
			int item_id = Integer.parseInt(ctx.pathParam("item_id"));
			
			Items ItemsById = is.getItemById(item_id);
			
			Gson gson = new Gson();
			
			
			String JSONItems = gson.toJson(ItemsById);
			
			
			ctx.result(JSONItems);
			ctx.status(200);
			
		} else {
			ctx.result("Oh no you failed to get the items!!!");
			ctx.status(404);
		}
	};

	
	
	public Handler updateItemsHandler = (ctx) -> {
		if(ctx.req.getSession(true) !=null) {
			
			
			int item_id = Integer.parseInt(ctx.pathParam("item_id"));
			
			Gson gson = new Gson();
			
			String body = ctx.body();
			
			Items item = gson.fromJson(body, Items.class);
			
			Items UpdateItem = is.updateItem(item);
			
			String JSONItems = gson.toJson(UpdateItem);
			
			
			ctx.result(JSONItems);
			ctx.status(200);
			
		} else {
			ctx.result("Oh no you failed to update the item!!!");
			ctx.status(404);
		}
	};
	
	public Handler getItemsByCreatorHandler = (ctx) -> {
		if(ctx.req.getSession(true) !=null) {
			
			
			List<Items> ItemsByCreator = is.getItemByCreator(null);
			
			Gson gson = new Gson();
			
			
			String JSONItems = gson.toJson(ItemsByCreator);
			
			
			ctx.result(JSONItems);
			ctx.status(200);
			
		} else {
			ctx.result("Oh no you failed to get the items!!!");
			ctx.status(404);
		}
	};
	
	public Handler getItemsByCreatorIdHandler = (ctx) -> {
		if(ctx.req.getSession(true) !=null) {
			
			int creator_id = Integer.parseInt(ctx.pathParam("creator_id"));
			
			List<Items> ItemsByCreatorId = is.getItemsByCreatorId(creator_id);
			
			Gson gson = new Gson();
			
			
			String JSONItems = gson.toJson(ItemsByCreatorId);
			
			
			ctx.result(JSONItems);
			ctx.status(200);
			
		} else {
			ctx.result("Oh no you failed to get the items!!!");
			ctx.status(404);
		}
	};

}
