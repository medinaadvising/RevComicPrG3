package com.revature.repositories;

// adapted from jose 220123	
	


import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.revature.models.Users;
import com.revature.utils.HibernateUtil;

public class UserDAO {
	
	public List<Users> getAllUsers(){
		
		
		//open a Session object
		Session ses = HibernateUtil.getSession();
		
		//SELECT all movies, with HQL instead of session methods, and put the values into a List (this will be one line)
		List<Users> userList = ses.createQuery("FROM Users").list();
		
		//close the session
		HibernateUtil.closeSession();
		
		//return the List of Movies
		
		return userList; 
		
	}
	
	public void insertUser(Users user) {
		
		Session ses = HibernateUtil.getSession();
		
		ses.save(user);
		
		HibernateUtil.closeSession();
	}
	
	public Users updateUser(Users user) {
		
		Session ses = HibernateUtil.getSession();
	
		Transaction tran = ses.beginTransaction();
		
		ses.merge(user);
	
		tran.commit();
		
		HibernateUtil.closeSession();
	
		return user;
	
		
	}

	public Users getUserById(int id) {
	
		Session ses = HibernateUtil.getSession();
	
		Users userbyid = ses.get(Users.class, id);
	
		HibernateUtil.closeSession();
	
		return userbyid;
	
}

}

