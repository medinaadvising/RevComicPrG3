package com.revature.services;

import java.util.List;

import com.revature.models.Creators;
import com.revature.repositories.CreatorDAO;


////adapt from jose 220123
////public class TransactionsService {



public class CreatorService {

	CreatorDAO crDAO = new CreatorDAO(); 
	
	
	public List<Creators> getCreators() {
	
		List<Creators> allcreators = crDAO.getAllCreators();
		return allcreators;
	}
	

	public void addCreator(Creators newCreator) {
		crDAO.insertCreator(newCreator);
	}

	
	public Creators updateCreator(Creators tochange) {
		
		int creatorid = crDAO.UpdateCreator(tochange);
		Creators updatedcreator = crDAO.getCreatorById(creatorid);
		
		return updatedcreator;	
	}

	public Creators getCreatorById(int id) {
		
		Creators creatorbyid = crDAO.getCreatorById(id);

		return creatorbyid;
	}

}

