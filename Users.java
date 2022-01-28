package com.revature.models;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class Users {
	
	@Id //This will make the field a primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) //this makes our PK serial
	@Column(name = "users_id") //usually I'll just call a field what I want it to be called instead of doing this...
	//public int id; 220126 with Ben 
	/*
	 * "message": "org.hibernate.property.access.spi.PropertyAccessException: Error accessing field [public int com.revature.models.Users.id] by reflection for persistent property [com.revature.models.Users#id] : Users [id=1, username=u1name, password=pwd1, f_name=F10125, l_name=L1, user_email=u1@mail.com, userrole=UserRole [id=2, role=shopper]]",
    "path": "/p2g3/user"
	 * 
	 * 
	 */
	
	
	private int id;
	
	@Column(unique = true, nullable = false)
	private String username;
	
	private String password;
	
	private String f_name;
	
	private String l_name;
	
	@Column(unique = true, nullable = false)
	private String user_email;
	
	
	//One to Many (technically many to one) relationship with Director - one Director can have many movies 
	//We need to make this a foreign key to the Director table
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "role_id") //This is how you establish relationships and foreign keys - 
										  //the name attribute must equal the name of the id of Director in the DB
	//@Column(name = "director_id_fk") //gonna see if this works...
	public UserRoles userrole;  
	//public UserRoles userrole;  220126 after talking to Ben
	/*
	 * "message": "org.hibernate.property.access.spi.PropertyAccessException: Error accessing field [public int com.revature.models.Users.id] by reflection for persistent property [com.revature.models.Users#id] : Users [id=1, username=u1name, password=pwd1, f_name=F10125, l_name=L1, user_email=u1@mail.com, userrole=UserRole [id=2, role=shopper]]",
    "path": "/p2g3/user"
	*
	* 220126 java.lang.IllegalArgumentException: Can not set int field com.revature.models.Users.id to com.revature.models.Users
	 * 
	 * 
	 */
	//original DB table name: user_roles. See Java class UserRoles


	
	//boilerplate code below.....................
	
	//Classes come with a no args constructor by default
	//BUT if you add a single constructor, that default constructor goes away
	//So we would need to add a no args (just in case)
	
	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	//left out ID field, so that we can insert values
	public Users(String username, String password, String f_name, String l_name, String user_email, UserRoles userrole) {
		super();
		this.username = username;
		this.password = password;
		this.f_name = f_name;
		this.l_name = l_name;
		this.user_email = user_email;
		this.userrole = userrole;
	}


	public Users(int id, String username, String password, String f_name, String l_name, String user_email,
			UserRoles userrole) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.f_name = f_name;
		this.l_name = l_name;
		this.user_email = user_email;
		this.userrole = userrole;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
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


	public UserRoles getUserrole() {
		return userrole;
	}


	public void setUserrole(UserRoles userrole) {
		this.userrole = userrole;
	}


	@Override
	public String toString() {
		return "Users [id=" + id + ", username=" + username + ", password=" + password + ", f_name=" + f_name
				+ ", l_name=" + l_name + ", user_email=" + user_email + ", userrole=" + userrole + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((f_name == null) ? 0 : f_name.hashCode());
		result = prime * result + id;
		result = prime * result + ((l_name == null) ? 0 : l_name.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((user_email == null) ? 0 : user_email.hashCode());
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		result = prime * result + ((userrole == null) ? 0 : userrole.hashCode());
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
		Users other = (Users) obj;
		if (f_name == null) {
			if (other.f_name != null)
				return false;
		} else if (!f_name.equals(other.f_name))
			return false;
		if (id != other.id)
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
		if (userrole == null) {
			if (other.userrole != null)
				return false;
		} else if (!userrole.equals(other.userrole))
			return false;
		return true;
	}
	
	
	
	
	
	
	

}
