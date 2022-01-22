package com.revature.repositories;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.revature.models.Transactions;
import com.revature.utils.HibernateUtil;

public class TransactionsDAO {
	
	public void insertTransactions(Transactions transactions) {
		
		
		Session ses = HibernateUtil.getSession(); 

		ses.save(transactions);
		
		HibernateUtil.closeSession();
		
		
		
	}
	
	
	public List<Transactions> getAllTransactions(){
		
		
		Session ses = HibernateUtil.getSession();
		
		List<Transactions> transList = ses.createQuery("FROM transactions").list();
		
		HibernateUtil.closeSession();
		
		return transList; 
		
	}
	
	
	public Transactions getTransactionsById(int id){
		
		
		Session ses = HibernateUtil.getSession();
		
		Transactions trans = ses.get(Transactions.class, id);
		
		HibernateUtil.closeSession();
		
		return trans; 
	}
	
	public void UpdateTransactions(Transactions transactions) {
		
		Session ses = HibernateUtil.getSession();
		
		Transaction tran = ses.beginTransaction(); 
		
		ses.merge(transactions);
		
		tran.commit(); 
		HibernateUtil.closeSession();
		
	}

}
