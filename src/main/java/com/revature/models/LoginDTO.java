package com.revature.models;

// from jose  220123

public class LoginDTO {
	
	private String username;
	private String password;

	
	//Then I just want two constructors so we can instantiate this class and transfer data with it
	public LoginDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	//and then getters/setters to access our fields

	public LoginDTO(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}
	

	//toString just incase we want to print out the object (could be helpful for debug)
	@Override
	public String toString() {
		return "LoginDTO [username=" + username + ", password=" + password + "]";
	}

}


