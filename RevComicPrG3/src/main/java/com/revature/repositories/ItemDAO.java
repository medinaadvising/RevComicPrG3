package com.revature.repositories;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.revature.models.Items;
import com.revature.utils.HibernateUtil;

public class ItemDAO {
	
public List<Items> getAllItems(){
		
		//open a Session object
		Session ses = HibernateUtil.getSession();
		
		//SELECT all movies, with HQL instead of session methods, and put the values into a List (this will be one line)
		List<Items> itemList = ses.createQuery("FROM Items").list();
		
		//close the session
		HibernateUtil.closeSession();
		
		//return the List of Movies
		
		return itemList; 
		
	}
	
	public void insertItem(Items item) {
		
		Session ses = HibernateUtil.getSession();
		
		ses.save(item);
		
		HibernateUtil.closeSession();
	}
	
	public Items updateItem(Items item) {
		
		Session ses = HibernateUtil.getSession();
	
		Transaction tran = ses.beginTransaction();
		
		ses.merge(item);
	
		tran.commit();
		
		HibernateUtil.closeSession();
	
		return item;
	
		
	}

	public Items getItemById(int id) {
	
		Session ses = HibernateUtil.getSession();
	
		Items itembyid = ses.get(Items.class, id);
	
		HibernateUtil.closeSession();
	
		return itembyid;
	
}
	
	public List<Items> getItemsByTitle(String title){
		
		Session ses = HibernateUtil.getSession();
		
		//Create a query with a parameter that takes in the director id (the id given in the method's parameters)
		Query q = ses.createQuery("FROM Items i WHERE i.title = :title");
		
		//set the ? to the id sent in to the method call
		q.setParameter("title", title);
		
		//create a List to hold the results of the query
		List<Items> itemsList = q.getResultList();
		
		HibernateUtil.closeSession();
		
		return itemsList;
		
	}
	
	public List<Items> getItemsByCreator(String creatorName){
		
		Session ses = HibernateUtil.getSession();
		
		//Create a query with a parameter that takes in the director id (the id given in the method's parameters)
		Query q = ses.createQuery("FROM Items i WHERE i.creatorName = :creatorName");
		
		//set the ? to the id sent in to the method call
		q.setParameter("creatorName", creatorName);
		
		//create a List to hold the results of the query
		List<Items> itemList = q.getResultList();
		
		HibernateUtil.closeSession();
		
		return itemList;
		
	}

	public List<Items> getItemsByCharacter(String characterName){
		
		Session ses = HibernateUtil.getSession();
		
		//Create a query with a parameter that takes in the director id (the id given in the method's parameters)
		Query q = ses.createQuery("FROM Items i WHERE i.characterName = :characterName");
		
		//set the ? to the id sent in to the method call
		q.setParameter("characterName", characterName);
		
		//create a List to hold the results of the query
		List<Items> itemList = q.getResultList();
		
		HibernateUtil.closeSession();
		
		return itemList;
		
	}

}
