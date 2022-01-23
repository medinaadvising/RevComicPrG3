package com.revature.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="creators")
public class Creators {
	
	@Id //This will make the field a primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) //this makes our PK serial
	@Column(name = "creator_id") //usually I'll just call a field what I want it to be called instead of doing this...
	private int id;
	
	@Column(unique = true, nullable = false)
	private String creator_nickname;
	
	private String creator_f_name;
	
	private String creator_l_name;
	
	private String creator_writer_name;

	
	//boilerplate code below.....................
	
	//Classes come with a no args constructor by default
	//BUT if you add a single constructor, that default constructor goes away
	//So we would need to add a no args (just in case)
	public Creators() {
		super();
		// TODO Auto-generated constructor stub
	}


	
	//left out ID field, so that we can insert values
	public Creators(String creator_nickname, String creator_f_name, String creator_l_name, String creator_writer_name) {
		super();
		this.creator_nickname = creator_nickname;
		this.creator_f_name = creator_f_name;
		this.creator_l_name = creator_l_name;
		this.creator_writer_name = creator_writer_name;
	}



	public Creators(int id, String creator_nickname, String creator_f_name, String creator_l_name,
			String creator_writer_name) {
		super();
		this.id = id;
		this.creator_nickname = creator_nickname;
		this.creator_f_name = creator_f_name;
		this.creator_l_name = creator_l_name;
		this.creator_writer_name = creator_writer_name;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getCreator_nickname() {
		return creator_nickname;
	}



	public void setCreator_nickname(String creator_nickname) {
		this.creator_nickname = creator_nickname;
	}



	public String getCreator_f_name() {
		return creator_f_name;
	}



	public void setCreator_f_name(String creator_f_name) {
		this.creator_f_name = creator_f_name;
	}



	public String getCreator_l_name() {
		return creator_l_name;
	}



	public void setCreator_l_name(String creator_l_name) {
		this.creator_l_name = creator_l_name;
	}



	public String getCreator_writer_name() {
		return creator_writer_name;
	}



	public void setCreator_writer_name(String creator_writer_name) {
		this.creator_writer_name = creator_writer_name;
	}



	@Override
	public String toString() {
		return "Creators [id=" + id + ", creator_nickname=" + creator_nickname + ", creator_f_name=" + creator_f_name
				+ ", creator_l_name=" + creator_l_name + ", creator_writer_name=" + creator_writer_name + "]";
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((creator_f_name == null) ? 0 : creator_f_name.hashCode());
		result = prime * result + ((creator_l_name == null) ? 0 : creator_l_name.hashCode());
		result = prime * result + ((creator_nickname == null) ? 0 : creator_nickname.hashCode());
		result = prime * result + ((creator_writer_name == null) ? 0 : creator_writer_name.hashCode());
		result = prime * result + id;
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
		Creators other = (Creators) obj;
		if (creator_f_name == null) {
			if (other.creator_f_name != null)
				return false;
		} else if (!creator_f_name.equals(other.creator_f_name))
			return false;
		if (creator_l_name == null) {
			if (other.creator_l_name != null)
				return false;
		} else if (!creator_l_name.equals(other.creator_l_name))
			return false;
		if (creator_nickname == null) {
			if (other.creator_nickname != null)
				return false;
		} else if (!creator_nickname.equals(other.creator_nickname))
			return false;
		if (creator_writer_name == null) {
			if (other.creator_writer_name != null)
				return false;
		} else if (!creator_writer_name.equals(other.creator_writer_name))
			return false;
		if (id != other.id)
			return false;
		return true;
	}
	
	
	
	
	
	
	
	

}
