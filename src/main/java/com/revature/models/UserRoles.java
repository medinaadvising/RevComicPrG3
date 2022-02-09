package com.revature.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_roles")
public class UserRoles {
	
	
	@Id //This will make the field a primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) //this makes our PK serial
	@Column(name = "role_id") //usually I'll just call a field what I want it to be called instead of doing this...
	private int id;
	
	@Column(unique = true, nullable = false)
	private String role;

	
	
	//boilerplate code below.....................
	
	//Classes come with a no args constructor by default
	//BUT if you add a single constructor, that default constructor goes away
	//So we would need to add a no args (just in case)
	
	public UserRoles() {
		super();
		// TODO Auto-generated constructor stub
	}


	
	//left out ID field, so that we can insert values
	public UserRoles(String role) {
		super();
		this.role = role;
	}



	public UserRoles(int id, String role) {
		super();
		this.id = id;
		this.role = role;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getRole() {
		return role;
	}



	public void setRole(String role) {
		this.role = role;
	}



	@Override
	public String toString() {
		return "UserRole [id=" + id + ", role=" + role + "]";
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((role == null) ? 0 : role.hashCode());
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
		UserRoles other = (UserRoles) obj;
		if (id != other.id)
			return false;
		if (role == null) {
			if (other.role != null)
				return false;
		} else if (!role.equals(other.role))
			return false;
		return true;
	}
	
	
	
	
	
	
	
	
	
	
	

}
