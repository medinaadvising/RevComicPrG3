package com.revature.repositories;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.revature.models.Items;
import com.revature.utils.HibernateUtil;


//adapted from jose transactionsDAO  220123


public class ItemDAO {


	public void insertItem(Items item) {
		
		
	Session ses = HibernateUtil.getSession(); 

	ses.save(item);
		
	HibernateUtil.closeSession();
	
		
	}
	
	
	public List<Items> getAllItems(){
	
		
		Session ses = HibernateUtil.getSession();
		
		List<Items> itemList = ses.createQuery("FROM items").list();
		
		HibernateUtil.closeSession();
		
		return itemList; 
		
	}
	
	
	public Items getItemById(int id){
		
		
		Session ses = HibernateUtil.getSession();
		
		Items itembyid = ses.get(Items.class, id);
		
		HibernateUtil.closeSession();
		
		return itembyid; 
	}
	
	public int UpdateItem(Items beingupdated) {
		
		int itemid = beingupdated.getId();
		
		Session ses = HibernateUtil.getSession();
				
		Transaction tran = ses.beginTransaction(); 
		
		ses.merge(beingupdated);
		
		tran.commit(); 
		HibernateUtil.closeSession();
		
		return itemid;
		
	}

}

