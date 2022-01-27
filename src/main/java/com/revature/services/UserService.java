package com.revature.services;

import java.util.List;

import com.revature.models.Users;
import com.revature.repositories.UserDAO;


// adapted from Jose 220223

public class UserService {
	
	UserDAO eDAO = new UserDAO(); 
	
	
	public List<Users> getUsers() {
		
	List<Users> allusers = eDAO.getAllUsers();
	
	
	return allusers;
	}

	public void addUser(Users newUser) {
		
		//take in the Employee object sent from the menu and send it to the EmployeeDAO to be inserted into the database
		
		//call the DAO method that inserts the new Employee
		eDAO.insertUser(newUser);
	}
	public Users getUserById(int id) {
		
		Users user= eDAO.getUserById(id);
		
		return user;
	}
	
	public Users updateUser(Users user) {
		return eDAO.updateUser(user);
		
	}

}


