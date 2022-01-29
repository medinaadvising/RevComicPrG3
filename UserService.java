package com.revature.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.revature.models.Users;
import com.revature.repositories.UserDAO;



// adapted from Jose 220223
@Service
public class UserService {
	
	UserDAO uDAO = new UserDAO(); 
	
	
	public List<Users> getUsers() {
		
	List<Users> allusers = uDAO.getAllUsers();
	
	
	return allusers;
	}

	public void addUser(Users newUser) {
		
		//take in the Employee object sent from the menu and send it to the EmployeeDAO to be inserted into the database
		
		//call the DAO method that inserts the new Employee
		uDAO.insertUser(newUser);
	}
	public Users getUserById(int id) {
		
		if(id==0) {
			return null;
		}
		
		Users user= uDAO.getUserById(id);
		
		return user;
	}
	
	public Users updateUser(Users user) {

		if (user==null) {
			return null;
		}
		
		//return eDAO.updateUser(user);
		
//		public Avenger update(Avenger a) {
//			if(a.getAveId()>team.length||a.getAveId()<1){
//				return null;
//			} else {
//				team[a.getAveId()-1] = a;
//				System.out.println(Arrays.toString(team));
//				return getById(a.getAveId());
		return uDAO.updateUser(user);
//			}
//			
		
	}

}


