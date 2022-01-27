package com.revature.repositories;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.revature.models.Creators;
import com.revature.utils.HibernateUtil;


////adapted from jose transactionsDAO  220123



public class CreatorDAO {

	public void insertCreator(Creators creator) {
		
		
	Session ses = HibernateUtil.getSession(); 

	ses.save(creator);
		
	HibernateUtil.closeSession();
	
		
	}
	
	
	public List<Creators> getAllCreators(){
	
		
		Session ses = HibernateUtil.getSession();
		
		List<Creators> creatorList = ses.createQuery("FROM creators").list();
		
		HibernateUtil.closeSession();
		
		return creatorList; 
		
	}
	
	
	public Creators getCreatorById(int id){
		
		
		Session ses = HibernateUtil.getSession();
		
		Creators creatorbyid = ses.get(Creators.class, id);
		
		HibernateUtil.closeSession();
		
		return creatorbyid; 
	}
	
	public int UpdateCreator(Creators beingupdated) {
		
		int creatorid = beingupdated.getId();
		
		Session ses = HibernateUtil.getSession();
				
		Transaction tran = ses.beginTransaction(); 
		
		ses.merge(beingupdated);
		
		tran.commit(); 
		HibernateUtil.closeSession();
		
		return creatorid;
		
	}

}

