package com.revature.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Status")
public class Status {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int status_id;
	private String in_cart;
	private String purchased;
	
	
	@Override
	public String toString() {
		return "Status [status_id=" + status_id + ", in_cart=" + in_cart + ", purchased=" + purchased + "]";
	}


	public Status() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Status(int status_id, String in_cart, String purchased) {
		super();
		this.status_id = status_id;
		this.in_cart = in_cart;
		this.purchased = purchased;
	}


	public int getStatus_id() {
		return status_id;
	}


	public void setStatus_id(int status_id) {
		this.status_id = status_id;
	}


	public String getIn_cart() {
		return in_cart;
	}


	public void setIn_cart(String in_cart) {
		this.in_cart = in_cart;
	}


	public String getPurchased() {
		return purchased;
	}


	public void setPurchased(String purchased) {
		this.purchased = purchased;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((in_cart == null) ? 0 : in_cart.hashCode());
		result = prime * result + ((purchased == null) ? 0 : purchased.hashCode());
		result = prime * result + status_id;
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
		Status other = (Status) obj;
		if (in_cart == null) {
			if (other.in_cart != null)
				return false;
		} else if (!in_cart.equals(other.in_cart))
			return false;
		if (purchased == null) {
			if (other.purchased != null)
				return false;
		} else if (!purchased.equals(other.purchased))
			return false;
		if (status_id != other.status_id)
			return false;
		return true;
	}
	
	

}
