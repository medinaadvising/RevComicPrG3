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
	

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name = "promo_type_id") 
	private int promo_id;
	
	@Column(unique = true, nullable = false)
	private String promo_type;

	@Override
	public String toString() {
		return "PromoTypes [promo_id=" + promo_id + ", promo_type=" + promo_type + "]";
	}

	public PromoTypes() {
		super();
		
	}

	public PromoTypes(int promo_id, String promo_type) {
		super();
		this.promo_id = promo_id;
		this.promo_type = promo_type;
	}

	public int getPromo_id() {
		return promo_id;
	}

	public void setPromo_id(int promo_id) {
		this.promo_id = promo_id;
	}

	public String getPromo_type() {
		return promo_type;
	}

	public void setPromo_type(String promo_type) {
		this.promo_type = promo_type;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + promo_id;
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
		if (promo_id != other.promo_id)
			return false;
		if (promo_type == null) {
			if (other.promo_type != null)
				return false;
		} else if (!promo_type.equals(other.promo_type))
			return false;
		return true;
	}
	
	

}
