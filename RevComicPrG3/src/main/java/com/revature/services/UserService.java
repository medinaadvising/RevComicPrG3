package com.revature.services;

import java.util.List;

import com.revature.models.User;
import com.revature.repositories.UserDAO;

public class UserService {
	
	UserDAO eDAO = new UserDAO(); 
	
	public List<User> getUsers() {
		
	List<User> users = eDAO.getAllUsers();
	
	return users;
	}

	public void addUser(User newUser) {
		
		//take in the Employee object sent from the menu and send it to the EmployeeDAO to be inserted into the database
		
		//call the DAO method that inserts the new Employee
		eDAO.insertUser(newUser);
	}
	public User getUserById(int id) {
		
		User user= eDAO.getUserById(id);
		
		return user;
	}
	
	public User updateUser(User user) {
		return eDAO.updateUser(user);
		
	}

}
