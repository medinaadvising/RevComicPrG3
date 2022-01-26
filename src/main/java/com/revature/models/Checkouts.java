package com.revature.models;

import java.sql.Blob;
import java.sql.Timestamp;

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
@Table(name="checkouts")
public class Checkouts {
	
	@Id //This will make the field a primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) //this makes our PK serial
	@Column(name = "checkout_id") //usually I'll just call a field what I want it to be called instead of doing this...
	private int id;

	@Column(unique = true, nullable = false)
	private String receipt_num;
	
	private String desc_checkout;
	
	private Timestamp time_checkout; // java.sql
	
	private Blob receipt_checkout;
	
	private int qty_checkout;
	
	//One to Many (technically many to one) relationship with Director - one Director can have many movies 
	//We need to make this a foreign key to the Director table
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "users_id") //This is how you establish relationships and foreign keys - 
												  //the name attribute must equal the name of the id of Director in the DB
	//@Column(name = "director_id_fk") //gonna see if this works...
	public Users myuser;  
	//original DB table name: users. See Java class Users
	
	//One to Many (technically many to one) relationship with Director - one Director can have many movies 
	//We need to make this a foreign key to the Director table
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "item_id") //This is how you establish relationships and foreign keys - 
												  //the name attribute must equal the name of the id of Director in the DB
	//@Column(name = "director_id_fk") //gonna see if this works...
	public Items myitem;  
	//original DB table name: items. See Java class Items
	
	//One to Many (technically many to one) relationship with Director - one Director can have many movies 
	//We need to make this a foreign key to the Director table
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "status_id") //This is how you establish relationships and foreign keys - 
												  //the name attribute must equal the name of the id of Director in the DB
	//@Column(name = "director_id_fk") //gonna see if this works...
	public Statuses mystatus;  
	//original DB table name: creators. See Java class Creators
		
	//One to Many (technically many to one) relationship with Director - one Director can have many movies 
	//We need to make this a foreign key to the Director table
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "pmt_type_id") //This is how you establish relationships and foreign keys - 
												  //the name attribute must equal the name of the id of Director in the DB
	//@Column(name = "director_id_fk") //gonna see if this works...
	public PmtTypes mypmttype;  
	//original DB table name: creators. See Java class Creators

			
		
	//boilerplate code below.....................
	
		//Classes come with a no args constructor by default
		//BUT if you add a single constructor, that default constructor goes away
		//So we would need to add a no args (just in case)
	public Checkouts() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	//left out ID field, so that we can insert values
	public Checkouts(String receipt_num, String desc_checkout, Timestamp time_checkout, Blob receipt_checkout,
			int qty_checkout, Users myuser, Items myitem, Statuses mystatus, PmtTypes mypmttype) {
		super();
		this.receipt_num = receipt_num;
		this.desc_checkout = desc_checkout;
		this.time_checkout = time_checkout;
		this.receipt_checkout = receipt_checkout;
		this.qty_checkout = qty_checkout;
		this.myuser = myuser;
		this.myitem = myitem;
		this.mystatus = mystatus;
		this.mypmttype = mypmttype;
	}



	public Checkouts(int id, String receipt_num, String desc_checkout, Timestamp time_checkout, Blob receipt_checkout,
			int qty_checkout, Users myuser, Items myitem, Statuses mystatus, PmtTypes mypmttype) {
		super();
		this.id = id;
		this.receipt_num = receipt_num;
		this.desc_checkout = desc_checkout;
		this.time_checkout = time_checkout;
		this.receipt_checkout = receipt_checkout;
		this.qty_checkout = qty_checkout;
		this.myuser = myuser;
		this.myitem = myitem;
		this.mystatus = mystatus;
		this.mypmttype = mypmttype;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getReceipt_num() {
		return receipt_num;
	}



	public void setReceipt_num(String receipt_num) {
		this.receipt_num = receipt_num;
	}



	public String getDesc_checkout() {
		return desc_checkout;
	}



	public void setDesc_checkout(String desc_checkout) {
		this.desc_checkout = desc_checkout;
	}



	public Timestamp getTime_checkout() {
		return time_checkout;
	}



	public void setTime_checkout(Timestamp time_checkout) {
		this.time_checkout = time_checkout;
	}



	public Blob getReceipt_checkout() {
		return receipt_checkout;
	}



	public void setReceipt_checkout(Blob receipt_checkout) {
		this.receipt_checkout = receipt_checkout;
	}



	public int getQty_checkout() {
		return qty_checkout;
	}



	public void setQty_checkout(int qty_checkout) {
		this.qty_checkout = qty_checkout;
	}



	public Users getMyuser() {
		return myuser;
	}



	public void setMyuser(Users myuser) {
		this.myuser = myuser;
	}



	public Items getMyitem() {
		return myitem;
	}



	public void setMyitem(Items myitem) {
		this.myitem = myitem;
	}



	public Statuses getMystatus() {
		return mystatus;
	}



	public void setMystatus(Statuses mystatus) {
		this.mystatus = mystatus;
	}



	public PmtTypes getMypmttype() {
		return mypmttype;
	}



	public void setMypmttype(PmtTypes mypmttype) {
		this.mypmttype = mypmttype;
	}



	@Override
	public String toString() {
		return "Checkouts [id=" + id + ", receipt_num=" + receipt_num + ", desc_checkout=" + desc_checkout
				+ ", time_checkout=" + time_checkout + ", receipt_checkout=" + receipt_checkout + ", qty_checkout="
				+ qty_checkout + ", myuser=" + myuser + ", myitem=" + myitem + ", mystatus=" + mystatus + ", mypmttype="
				+ mypmttype + "]";
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((desc_checkout == null) ? 0 : desc_checkout.hashCode());
		result = prime * result + id;
		result = prime * result + ((myitem == null) ? 0 : myitem.hashCode());
		result = prime * result + ((mypmttype == null) ? 0 : mypmttype.hashCode());
		result = prime * result + ((mystatus == null) ? 0 : mystatus.hashCode());
		result = prime * result + ((myuser == null) ? 0 : myuser.hashCode());
		result = prime * result + qty_checkout;
		result = prime * result + ((receipt_num == null) ? 0 : receipt_num.hashCode());
		result = prime * result + ((time_checkout == null) ? 0 : time_checkout.hashCode());
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
		Checkouts other = (Checkouts) obj;
		if (desc_checkout == null) {
			if (other.desc_checkout != null)
				return false;
		} else if (!desc_checkout.equals(other.desc_checkout))
			return false;
		if (id != other.id)
			return false;
		if (myitem == null) {
			if (other.myitem != null)
				return false;
		} else if (!myitem.equals(other.myitem))
			return false;
		if (mypmttype == null) {
			if (other.mypmttype != null)
				return false;
		} else if (!mypmttype.equals(other.mypmttype))
			return false;
		if (mystatus == null) {
			if (other.mystatus != null)
				return false;
		} else if (!mystatus.equals(other.mystatus))
			return false;
		if (myuser == null) {
			if (other.myuser != null)
				return false;
		} else if (!myuser.equals(other.myuser))
			return false;
		if (qty_checkout != other.qty_checkout)
			return false;
		if (receipt_num == null) {
			if (other.receipt_num != null)
				return false;
		} else if (!receipt_num.equals(other.receipt_num))
			return false;
		if (time_checkout == null) {
			if (other.time_checkout != null)
				return false;
		} else if (!time_checkout.equals(other.time_checkout))
			return false;
		return true;
	}



	
	
	
	
	
	

	

}
