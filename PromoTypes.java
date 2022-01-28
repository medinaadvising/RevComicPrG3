package com.revature.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="promo_types")
public class PromoTypes {
	

	@Id //This will make the field a primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) //this makes our PK serial
	@Column(name = "promo_type_id") //usually I'll just call a field what I want it to be called instead of doing this...
	private int id;
	
	@Column(unique = true, nullable = false)
	private String promo_type;

	//boilerplate code below.....................
	
	//Classes come with a no args constructor by default
	//BUT if you add a single constructor, that default constructor goes away
	//So we would need to add a no args (just in case)
		
	public PromoTypes() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	//left out ID field, so that we can insert values
	public PromoTypes(String promo_type) {
		super();
		this.promo_type = promo_type;
	}



	public PromoTypes(int id, String promo_type) {
		super();
		this.id = id;
		this.promo_type = promo_type;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getPromo_type() {
		return promo_type;
	}



	public void setPromo_type(String promo_type) {
		this.promo_type = promo_type;
	}



	@Override
	public String toString() {
		return "PromoTypes [id=" + id + ", promo_type=" + promo_type + "]";
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((promo_type == null) ? 0 : promo_type.hashCode());
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
		PromoTypes other = (PromoTypes) obj;
		if (id != other.id)
			return false;
		if (promo_type == null) {
			if (other.promo_type != null)
				return false;
		} else if (!promo_type.equals(other.promo_type))
			return false;
		return true;
	}
	
	
	
	
	
	
	
}

