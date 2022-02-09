package com.revature.services;

import java.util.List;

import com.revature.models.Items;
import com.revature.repositories.ItemDAO;


//adapt from jose 220123
//public class TransactionsService {

public class ItemService {

	ItemDAO iDAO = new ItemDAO(); 
	
	
	public List<Items> getItems() {
	
		List<Items> allitems = iDAO.getAllItems();
		return allitems;
	}
	
	public void addItem(Items newItem) {
		iDAO.insertItem(newItem);
	}

	
	public Items updateItem(Items tochange) {
		
		int itemid = iDAO.UpdateItem(tochange);
		Items updateditem = iDAO.getItemById(itemid);
		
		return updateditem;	
	}

	public Items getItemById(int id) {
		
		Items itembyid = iDAO.getItemById(id);

		return itembyid;
	}

}

