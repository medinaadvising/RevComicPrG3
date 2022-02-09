package com.revature.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "transactions")
public class Transactions {
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int trans_id;
		private int quantity;
		private double total;
		private String f_name;
		private String l_name;
		private String credit_card;
		private String expiration;
		private int cvv;
		private double zipcode;
		
	
		
		
		@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
		@JoinColumn(name = "users_id") //This is how you establish relationships and foreign keys - 
		public User myuser;  
		//original DB table name: users. See Java class Users
		

		@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
		@JoinColumn(name = "item_id") //This is how you establish relationships and foreign keys - 
		public Items item;  
		//original DB table name: items. See Java class Items
		
		@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
		@JoinColumn(name = "status_id") //This is how you establish relationships and foreign keys - 
		public Status status;  
		//original DB table name: creators. See Java class Creators

		@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
		@JoinColumn(name = "pmt_type_id") //This is how you establish relationships and foreign keys - 
		public PaymentType pmttype;  
		//original DB table name: creators. See Java class Creators
		
		
		

		public Transactions() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Transactions(int trans_id, int quantity, double total, String f_name, String l_name, String credit_card,
				String expiration, int cvv, double zipcode, User myuser, Items item, Status status,
				PaymentType pmttype) {
			super();
			this.trans_id = trans_id;
			this.quantity = quantity;
			this.total = total;
			this.f_name = f_name;
			this.l_name = l_name;
			this.credit_card = credit_card;
			this.expiration = expiration;
			this.cvv = cvv;
			this.zipcode = zipcode;
			this.myuser = myuser;
			this.item = item;
			this.status = status;
			this.pmttype = pmttype;
		}
		public Transactions(int quantity, double total, String f_name, String l_name, String credit_card,
				String expiration, int cvv, double zipcode, User myuser, Items item, Status status,
				PaymentType pmttype) {
			super();
			this.quantity = quantity;
			this.total = total;
			this.f_name = f_name;
			this.l_name = l_name;
			this.credit_card = credit_card;
			this.expiration = expiration;
			this.cvv = cvv;
			this.zipcode = zipcode;
			this.myuser = myuser;
			this.item = item;
			this.status = status;
			this.pmttype = pmttype;
		}
		@Override
		public String toString() {
			return "Transactions [trans_id=" + trans_id + ", quantity=" + quantity + ", total=" + total + ", f_name="
					+ f_name + ", l_name=" + l_name + ", credit_card=" + credit_card + ", expiration=" + expiration
					+ ", cvv=" + cvv + ", zipcode=" + zipcode + ", myuser=" + myuser + ", item=" + item + ", status="
					+ status + ", pmttype=" + pmttype + "]";
		}
		public int getTrans_id() {
			return trans_id;
		}
		public void setTrans_id(int trans_id) {
			this.trans_id = trans_id;
		}
		public int getQuantity() {
			return quantity;
		}
		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}
		public double getTotal() {
			return total;
		}
		public void setTotal(double total) {
			this.total = total;
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
		public String getCredit_card() {
			return credit_card;
		}
		public void setCredit_card(String credit_card) {
			this.credit_card = credit_card;
		}
		public String getExpiration() {
			return expiration;
		}
		public void setExpiration(String expiration) {
			this.expiration = expiration;
		}
		public int getCvv() {
			return cvv;
		}
		public void setCvv(int cvv) {
			this.cvv = cvv;
		}
		public double getZipcode() {
			return zipcode;
		}
		public void setZipcode(double zipcode) {
			this.zipcode = zipcode;
		}
		public User getMyuser() {
			return myuser;
		}
		public void setMyuser(User myuser) {
			this.myuser = myuser;
		}
		public Items getItem() {
			return item;
		}
		public void setItem(Items item) {
			this.item = item;
		}
		public Status getStatus() {
			return status;
		}
		public void setStatus(Status status) {
			this.status = status;
		}
		public PaymentType getPmttype() {
			return pmttype;
		}
		public void setPmttype(PaymentType pmttype) {
			this.pmttype = pmttype;
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((credit_card == null) ? 0 : credit_card.hashCode());
			result = prime * result + cvv;
			result = prime * result + ((expiration == null) ? 0 : expiration.hashCode());
			result = prime * result + ((f_name == null) ? 0 : f_name.hashCode());
			result = prime * result + ((item == null) ? 0 : item.hashCode());
			result = prime * result + ((l_name == null) ? 0 : l_name.hashCode());
			result = prime * result + ((myuser == null) ? 0 : myuser.hashCode());
			result = prime * result + ((pmttype == null) ? 0 : pmttype.hashCode());
			result = prime * result + quantity;
			result = prime * result + ((status == null) ? 0 : status.hashCode());
			long temp;
			temp = Double.doubleToLongBits(total);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			result = prime * result + trans_id;
			temp = Double.doubleToLongBits(zipcode);
			result = prime * result + (int) (temp ^ (temp >>> 32));
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
			Transactions other = (Transactions) obj;
			if (credit_card == null) {
				if (other.credit_card != null)
					return false;
			} else if (!credit_card.equals(other.credit_card))
				return false;
			if (cvv != other.cvv)
				return false;
			if (expiration == null) {
				if (other.expiration != null)
					return false;
			} else if (!expiration.equals(other.expiration))
				return false;
			if (f_name == null) {
				if (other.f_name != null)
					return false;
			} else if (!f_name.equals(other.f_name))
				return false;
			if (item == null) {
				if (other.item != null)
					return false;
			} else if (!item.equals(other.item))
				return false;
			if (l_name == null) {
				if (other.l_name != null)
					return false;
			} else if (!l_name.equals(other.l_name))
				return false;
			if (myuser == null) {
				if (other.myuser != null)
					return false;
			} else if (!myuser.equals(other.myuser))
				return false;
			if (pmttype == null) {
				if (other.pmttype != null)
					return false;
			} else if (!pmttype.equals(other.pmttype))
				return false;
			if (quantity != other.quantity)
				return false;
			if (status == null) {
				if (other.status != null)
					return false;
			} else if (!status.equals(other.status))
				return false;
			if (Double.doubleToLongBits(total) != Double.doubleToLongBits(other.total))
				return false;
			if (trans_id != other.trans_id)
				return false;
			if (Double.doubleToLongBits(zipcode) != Double.doubleToLongBits(other.zipcode))
				return false;
			return true;
		}
		
		

		
		


}