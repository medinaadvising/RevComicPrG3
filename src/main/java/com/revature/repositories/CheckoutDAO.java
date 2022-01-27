package com.revature.repositories;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.revature.models.Checkouts;

import com.revature.utils.HibernateUtil;


// adapted from jose transactionsDAO  220123
//
//
//
public class CheckoutDAO {
	
	
	public void insertCheckout(Checkouts checkout) {
		
		
	Session ses = HibernateUtil.getSession(); 

	ses.save(checkout);
		
	HibernateUtil.closeSession();
		
		
		
	}
	
	
	public List<Checkouts> getAllCheckouts(){
		
		
		Session ses = HibernateUtil.getSession();
		
		List<Checkouts> checkoutList = ses.createQuery("FROM checkouts").list();
		
		HibernateUtil.closeSession();
		
		return checkoutList; 
		
	}
	
	
	public Checkouts getCheckoutById(int id){
		
		
		Session ses = HibernateUtil.getSession();
		
		Checkouts checkoutbyid = ses.get(Checkouts.class, id);
		
		HibernateUtil.closeSession();
		
		return checkoutbyid; 
	}
	
	public int UpdateCheckout(Checkouts beingupdated) {
		
		int coid = beingupdated.getId();
		
		Session ses = HibernateUtil.getSession();
				
		Transaction tran = ses.beginTransaction(); 
		
		ses.merge(beingupdated);
		
		tran.commit(); 
		HibernateUtil.closeSession();
		
		return coid;
		
	}

}

