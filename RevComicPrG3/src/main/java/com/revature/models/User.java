package com.revature.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int users_id;
	private String username;
	private String password;
	private String f_name;
	private String l_name;
	private String user_email;
	
	
	
	
	
	public User(String username, String password, String f_name, String l_name, String user_email) {
		super();
		this.username = username;
		this.password = password;
		this.f_name = f_name;
		this.l_name = l_name;
		this.user_email = user_email;
		
	}





	public User(int users_id, String username, String password, String f_name, String l_name, String user_email) {
		super();
		this.users_id = users_id;
		this.username = username;
		this.password = password;
		this.f_name = f_name;
		this.l_name = l_name;
		this.user_email = user_email;
	}


	


	@Override
	public String toString() {
		return "User [users_id=" + users_id + ", username=" + username + ", password=" + password + ", f_name=" + f_name
				+ ", l_name=" + l_name + ", user_email=" + user_email + "]";
	}





	public int getUsers_id() {
		return users_id;
	}





	public void setUsers_id(int users_id) {
		this.users_id = users_id;
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





	public String getF_name() {
		return f_name;
	}





	public void setF_name(String f_name) {
		this.f_name = f_name;
	}





	public String getL_name() {
		return l_name;
	}





	public void setL_name(String l_name) {
		this.l_name = l_name;
	}





	public String getUser_email() {
		return user_email;
	}





	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}





	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((f_name == null) ? 0 : f_name.hashCode());
		result = prime * result + ((l_name == null) ? 0 : l_name.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((user_email == null) ? 0 : user_email.hashCode());
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		result = prime * result + users_id;
		return result;
	}





	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (f_name == null) {
			if (other.f_name != null)
				return false;
		} else if (!f_name.equals(other.f_name))
			return false;
		if (l_name == null) {
			if (other.l_name != null)
				return false;
		} else if (!l_name.equals(other.l_name))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (user_email == null) {
			if (other.user_email != null)
				return false;
		} else if (!user_email.equals(other.user_email))
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		if (users_id != other.users_id)
			return false;
		return true;
	}
	
}
	
	
	
	