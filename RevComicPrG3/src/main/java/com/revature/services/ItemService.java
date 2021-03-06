package com.revature.services;

import java.util.List;

import com.revature.models.Items;
import com.revature.models.Transactions;
import com.revature.repositories.ItemDAO;

public class ItemService {
	
	ItemDAO iDAO = new ItemDAO(); 
	
	public List<Items> getItems() {
		
	List<Items> items = iDAO.getAllItems();
	
	return items;
	}

	public void addItem(Items newItem) {
		
		iDAO.insertItem(newItem);
	}
	public Items getItemById(int id) {
		
		Items item = iDAO.getItemById(id);
		
		return item;
	}
	
	public Items updateItem(Items item) {
		return iDAO.updateItem(item);
		
	}
	
	public List<Items> getItemByTitle(String title) {
		
		List<Items> items = iDAO.getItemsByTitle(title);
		
		return items;
	}
	
	public List<Items> getItemsByCreator(String creatorName) {
		
		List<Items> itemsByCreator= iDAO.getItemsByCreator(creatorName);
		
		return itemsByCreator;
	}
	
	public List<Items> getItemsByCharacter(String characterName) {
		
		List<Items> itemsByCharacter= iDAO.getItemsByCharacter(characterName);
		
		return itemsByCharacter;
	}

}
