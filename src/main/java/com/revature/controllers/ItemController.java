package com.revature.controllers;

import java.util.List;

import com.google.gson.Gson;
import com.revature.models.Items;
import com.revature.services.ItemService;

import io.javalin.http.Handler;


////adapted from jose 220123
////public class TransactionsController {


public class ItemController {


	ItemService is = new ItemService();
	
	public Handler getAllItemsHandler = (ctx) -> {
		if(ctx.req.getSession(true) !=null) {
			List<Items> allitems = is.getItems();
		
			Gson gson = new Gson();
			
			String JSONallitems = gson.toJson(allitems);
			
			ctx.result(JSONallitems);
			ctx.status(200);
			
		} else {
			ctx.result("Oh no you failed to get all items!!!");
			ctx.status(404);
		}
	};
	
	public Handler insertItemHandler = (ctx) ->{
		if(ctx.req.getSession(true) !=null) {
			
			String body = ctx.body();
			
			Gson gson = new Gson();
			
			Items newtran = gson.fromJson(body, Items.class);
			
			is.addItem(newtran);
			
			ctx.result("Item was successfully added!");
			ctx.status(201);
			
		} else {
			ctx.result("Oh no you failed to add the item!!!");
			ctx.status(404);
		}
	};
	
	public Handler updateItemHandler = (ctx) -> {
		if(ctx.req.getSession(true) !=null) {
		
			
			int trans_id = Integer.parseInt(ctx.pathParam("item_id"));
			
			Gson gson = new Gson();
			
			String body = ctx.body();
		
		    Items tochange = gson.fromJson(body, Items.class);
			
			Items updatedtran = is.updateItem(tochange);
			
			String JSONupdated = gson.toJson(updatedtran);
			
			
			ctx.result(JSONupdated);
			ctx.status(200);
			
		} else {
			ctx.result("Oh no you failed to update the item!!!");
			ctx.status(404);
		}
	};
	
	public Handler getItemByIdHandler = (ctx) -> {
		if(ctx.req.getSession(true) !=null) {
			
			int transid = Integer.parseInt(ctx.pathParam("item_id"));
			
			Items itembyid = is.getItemById(transid); 			
			Gson gson = new Gson();
			
			
			String JSONresult = gson.toJson(itembyid);
			
			
			ctx.result(JSONresult);
			ctx.status(200);
			
		} else {
			ctx.result("Oh no you failed to get your item by its ID!!!");
			ctx.status(404);
		}
	};
}

