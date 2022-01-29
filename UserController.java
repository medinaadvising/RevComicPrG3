package com.revature.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.models.Users;
//import com.revature.models.Avenger;
//import com.revature.repositories.UserDAO;
import com.revature.services.UserService;

//import com.revature.repositories.AvengerDAO;
//
import java.util.Arrays;
import java.util.List;
//
//@RequestMapping(value="/avenger")  // mvc/avenger
//@Controller
//@ResponseBody
@RestController // 220127 Erliing
@RequestMapping(value="/user")  // p2g3/user
@CrossOrigin // take requests from everywhere -across origin
public class UserController {
//public class AvengerController { // 220125 Ben
	//	
//	// skipping service layer for this demo
//	
	//@Autowired
	private UserService us;
//	private AvengerDAO aDAO;
//	bean connection
	@Autowired
	public UserController(UserService us) {
		this.us=us;
	}
	
//	@Autowired
//	public AvengerController(AvengerDAO dao) {
//		this.aDAO = dao;
//	}
//	
	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public List<Users> allusers(){ 
		return us.getUsers();
	}
//	@RequestMapping(method = RequestMethod.GET)
//	public List<Avenger> assemble() {
//		return Arrays.asList(aDAO.getAll());
//	}
//	
	@RequestMapping(value ="/{id}", produces = "application/json", method = {RequestMethod.GET, RequestMethod.POST})
	//@GetMapping("/{id}")
	public ResponseEntity<Users> getUserById(@PathVariable("id") int id) {
		Users u = us.getUserById(id);
		if(u == null) {
			// body status 204 (no content) to send
			return ResponseEntity.status(HttpStatus.NO_CONTENT).body(u);
		}
		System.out.println("get by id " + u);
		return ResponseEntity.ok(u);
	}
//	@GetMapping("/{id}")
//	public ResponseEntity<Avenger> getAvengerById(@PathVariable("id") int id){
//		
//		Avenger a = aDAO.getById(id);
//		
//		if(a==null) {
//			// body status 204 (no content) to send
//			
//			return ResponseEntity.status(HttpStatus.NO_CONTENT).body(a);
//			
//		}
//		
//		return ResponseEntity.ok(a);
//	}
//	
//	

	//@PutMapping  
	//220126
	//@RequestMapping(method = RequestMethod.PUT)
	@RequestMapping(value="/update",produces = "application/json",method = {RequestMethod.GET, RequestMethod.PUT})
	public ResponseEntity<Users> updateUser(@RequestBody Users u) {
		if (u == null) {
			
			return ResponseEntity.status(HttpStatus.NO_CONTENT).body(u);
		}
		
		Users uc = us.updateUser(u);
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(uc);
		
	}
	
	
	
	//	// update method  HTTP request PUT, ending in /avenger. Convert JSON to Java object specified
//	@PutMapping
//	public ResponseEntity<Avenger> updateAvenger(@RequestBody Avenger a){
//		
//		if(a==null) {
//			// body status 204 (no content) to send
//			
//			return ResponseEntity.status(HttpStatus.NO_CONTENT).body(a);
//			
//		}
//		
//		
//		a =aDAO.update(a);
//		
//		return ResponseEntity.status(HttpStatus.ACCEPTED).body(a);
//		
//	}
//	
	//@PostMapping
	// 220126
	//@RequestMapping(method = RequestMethod.POST)
	@RequestMapping(value="/add",produces = "application/json")
	public ResponseEntity<Users> addUser(@RequestBody Users u) {
		if (u == null) {
			
			return ResponseEntity.status(HttpStatus.NO_CONTENT).body(u);
		}
		
		us.addUser(u);
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(u);
		
	}
	
	
	
	
	
	
//	
}
