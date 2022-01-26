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
	private int creator_id;
	private String f_name;
	private String l_name;
	
	
	
	@Override
	public String toString() {
		return "Creators [creator_id=" + creator_id + ", f_name=" + f_name + ", l_name=" + l_name + "]";
	}



	public Creators() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Creators(int creator_id, String f_name, String l_name) {
		super();
		this.creator_id = creator_id;
		this.f_name = f_name;
		this.l_name = l_name;
	}



	public int getCreator_id() {
		return creator_id;
	}



	public void setCreator_id(int creator_id) {
		this.creator_id = creator_id;
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



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + creator_id;
		result = prime * result + ((f_name == null) ? 0 : f_name.hashCode());
		result = prime * result + ((l_name == null) ? 0 : l_name.hashCode());
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
		if (creator_id != other.creator_id)
			return false;
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
		return true;
	}


	
}
