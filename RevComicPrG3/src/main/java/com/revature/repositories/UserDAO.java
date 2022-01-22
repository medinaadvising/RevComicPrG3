package com.revature.repositories;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.revature.models.User;
import com.revature.utils.HibernateUtil;

public class UserDAO {
	
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
