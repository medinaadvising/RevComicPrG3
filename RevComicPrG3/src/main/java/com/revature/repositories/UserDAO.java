package com.revature.repositories;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.revature.models.User;
import com.revature.utils.HibernateUtil;

public class UserDAO {
	
	public List<User> getAllUsers(){
		
		//open a Session object
		Session ses = HibernateUtil.getSession();
		
		//SELECT all movies, with HQL instead of session methods, and put the values into a List (this will be one line)
		List<User> userList = ses.createQuery("FROM User").list();
		
		//close the session
		HibernateUtil.closeSession();
		
		//return the List of Movies
		
		return userList; 
		
	}
	
	public void insertUser(User user) {
		
		Session ses = HibernateUtil.getSession();
		
		ses.save(user);
		
		HibernateUtil.closeSession();
	}
	
	public User updateUser(User user) {
		
		Session ses = HibernateUtil.getSession();
	
		Transaction tran = ses.beginTransaction();
		
		ses.merge(user);
	
		tran.commit();
		
		HibernateUtil.closeSession();
	
		return user;
	
		
	}

	public User getUserById(int id) {
	
		Session ses = HibernateUtil.getSession();
	
		User userbyid = ses.get(User.class, id);
	
		HibernateUtil.closeSession();
	
		return userbyid;
	
}

}
