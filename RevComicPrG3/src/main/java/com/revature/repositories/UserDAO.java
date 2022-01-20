package com.revature.repositories;

import org.hibernate.Session;
import com.revature.models.User;
import com.revature.utils.HibernateUtil;

public class UserDAO {
	
public void insertUser(User user) {
		
	Session ses = HibernateUtil.getSession();
		
	ses.save(user);
		
	HibernateUtil.closeSession();
	}
	
public void updateUser(User user) {
		
	Session ses = HibernateUtil.getSession();
		
	ses.merge(user);
		
	HibernateUtil.closeSession();
		
	}

public void getUserById(int id) {
	
	Session ses = HibernateUtil.getSession();
	
	ses.save(id);
	
	HibernateUtil.closeSession();
	
}

}
