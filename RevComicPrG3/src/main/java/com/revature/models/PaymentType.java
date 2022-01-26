package com.revature.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pmt_types")
public class PaymentType {
	
	@Id //This will make the field a primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) //this makes our PK serial
	@Column(name = "pmt_type_id") 
	private int pmt_id;
	
	@Column(unique = true, nullable = false)
	private String pmt_type;

	@Override
	public String toString() {
		return "PaymentType [pmt_id=" + pmt_id + ", pmt_type=" + pmt_type + "]";
	}

	public PaymentType() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PaymentType(int pmt_id, String pmt_type) {
		super();
		this.pmt_id = pmt_id;
		this.pmt_type = pmt_type;
	}

	public int getPmt_id() {
		return pmt_id;
	}

	public void setPmt_id(int pmt_id) {
		this.pmt_id = pmt_id;
	}

	public String getPmt_type() {
		return pmt_type;
	}

	public void setPmt_type(String pmt_type) {
		this.pmt_type = pmt_type;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + pmt_id;
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
		PaymentType other = (PaymentType) obj;
		if (pmt_id != other.pmt_id)
			return false;
		if (pmt_type == null) {
			if (other.pmt_type != null)
				return false;
		} else if (!pmt_type.equals(other.pmt_type))
			return false;
		return true;
	}

	

}
