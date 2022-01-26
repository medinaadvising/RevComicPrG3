package com.revature.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pmt_types")
public class PmtTypes {
	
	@Id //This will make the field a primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) //this makes our PK serial
	@Column(name = "pmt_type_id") //usually I'll just call a field what I want it to be called instead of doing this...
	private int id;
	
	@Column(unique = true, nullable = false)
	private String pmt_type;

	
	//boilerplate code below.....................
	
	//Classes come with a no args constructor by default
	//BUT if you add a single constructor, that default constructor goes away
	//So we would need to add a no args (just in case)
		
	public PmtTypes() {
		super();
		// TODO Auto-generated constructor stub
	}


	
	
	//left out ID field, so that we can insert values
	public PmtTypes(String pmt_type) {
		super();
		this.pmt_type = pmt_type;
	}




	public PmtTypes(int id, String pmt_type) {
		super();
		this.id = id;
		this.pmt_type = pmt_type;
	}




	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public String getPmt_type() {
		return pmt_type;
	}




	public void setPmt_type(String pmt_type) {
		this.pmt_type = pmt_type;
	}




	@Override
	public String toString() {
		return "PmtTypes [id=" + id + ", pmt_type=" + pmt_type + "]";
	}




	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((pmt_type == null) ? 0 : pmt_type.hashCode());
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
		PmtTypes other = (PmtTypes) obj;
		if (id != other.id)
			return false;
		if (pmt_type == null) {
			if (other.pmt_type != null)
				return false;
		} else if (!pmt_type.equals(other.pmt_type))
			return false;
		return true;
	}
	
	
	
	
	

}
