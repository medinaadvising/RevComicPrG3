package com.revature.repositories;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.revature.models.Creators;
import com.revature.models.Items;
import com.revature.utils.HibernateUtil;

public class CreatorDAO {
	
	public List<Creators> getAllCreators(){
		
		//open a Session object
		Session ses = HibernateUtil.getSession();
		
		//SELECT all movies, with HQL instead of session methods, and put the values into a List (this will be one line)
		List<Creators> creatorList = ses.createQuery("FROM Creators").list();
		
		//close the session
		HibernateUtil.closeSession();
		
		//return the List of Movies
		
		return creatorList; 
		
	}
	
	public void insertCreator(Creators creator) {
		
		Session ses = HibernateUtil.getSession();
		
		ses.save(creator);
		
		HibernateUtil.closeSession();
	}
	
	public Creators updateCreator(Creators creator) {
		
		Session ses = HibernateUtil.getSession();
	
		Transaction tran = ses.beginTransaction();
		
		ses.merge(creator);
	
		tran.commit();
		
		HibernateUtil.closeSession();
	
		return creator;
	
		
	}

	public Creators getCreatorById(int id) {
	
		Session ses = HibernateUtil.getSession();
	
		Creators creatorbyid = ses.get(Creators.class, id);
	
		HibernateUtil.closeSession();
	
		return creatorbyid;
	
}

}
