package com.revature.services;

import java.util.List;

import com.revature.models.User;
import com.revature.repositories.UserDAO;

public class UserService {
	
	UserDAO eDAO = new UserDAO(); //so that I can use the methods from the EmployeeDAO
	public List<User> getUsers() {
	
	//get the List of Employees by calling the DAO method that selects them from the database
	List<User> users = eDAO.getUsers();
	
	//return the list of employees
	return users;
}
	public void addUser(User newUser) {
		
		//take in the Employee object sent from the menu and send it to the EmployeeDAO to be inserted into the database
		
		//call the DAO method that inserts the new Employee
		eDAO.insertUser(newUser);
	}
	public List<User> getUserById(int id) {
		
		List<User> user= eDAO.getUserById(id);
		
		return user;
	}
	
	public User updateUser(User user) {
		return eDAO.updateUser(user);
		
	}

}
