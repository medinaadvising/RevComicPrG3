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
@Table(name = "inventories")
public class Inventory {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "inventory_id")
	private int id;
	
	@Column(unique = true, nullable = false)
	private String title;
	private String author;
	private String order_date;
	private float order_total;
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "customer_id") 
	
	//@Column(name = "customer_id_fk")
	public Customer customer;

	
	public Inventory() {
		super();
	}


	public Inventory(String title, String author, String order_date, float order_total, Customer customer) {
		super();
		this.title = title;
		this.author = author;
		this.order_date = order_date;
		this.order_total = order_total;
		this.customer = customer;
	}


	public Inventory(int id, String title, String author, String order_date, float order_total, Customer customer) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.order_date = order_date;
		this.order_total = order_total;
		this.customer = customer;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public String getOrder_date() {
		return order_date;
	}


	public void setOrder_date(String order_date) {
		this.order_date = order_date;
	}


	public float getOrder_total() {
		return order_total;
	}


	public void setOrder_total(float order_total) {
		this.order_total = order_total;
	}


	public Customer getCustomer() {
		return customer;
	}


	public void setCustomer(Customer customer) {
		this.customer = customer;
	}


	@Override
	public String toString() {
		return "Inventory [id=" + id + ", title=" + title + ", author=" + author + ", order_date=" + order_date
				+ ", order_total=" + order_total + ", customer=" + customer + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + ((customer == null) ? 0 : customer.hashCode());
		result = prime * result + id;
		result = prime * result + ((order_date == null) ? 0 : order_date.hashCode());
		result = prime * result + Float.floatToIntBits(order_total);
		result = prime * result + ((title == null) ? 0 : title.hashCode());
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
		Inventory other = (Inventory) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (customer == null) {
			if (other.customer != null)
				return false;
		} else if (!customer.equals(other.customer))
			return false;
		if (id != other.id)
			return false;
		if (order_date == null) {
			if (other.order_date != null)
				return false;
		} else if (!order_date.equals(other.order_date))
			return false;
		if (Float.floatToIntBits(order_total) != Float.floatToIntBits(other.order_total))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}


	
}


	
	

	