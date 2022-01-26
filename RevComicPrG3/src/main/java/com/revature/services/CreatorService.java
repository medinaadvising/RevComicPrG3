package com.revature.services;

import java.util.List;

import com.revature.models.Creators;
import com.revature.repositories.CreatorDAO;

	public class CreatorService {
	
		CreatorDAO cDAO = new CreatorDAO(); 
	
		public List<Creators> getCreators() {
		
			List<Creators> creators = cDAO.getAllCreators();
	
			return creators;
	}

		public void addCreator(Creators newCreator) {
		
			cDAO.insertCreator(newCreator);
	}
		public Creators getCreatorById(int id) {
		
			Creators creator = cDAO.getCreatorById(id);
		
			return creator;
	}
	
		public Creators updateCreator(Creators creator) {
			return cDAO.updateCreator(creator);
		
	}
	
	

}
