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
		private String purchase_date;
		private String description;
		private String receipt;
	
		
		
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
		
		

		@Override
		public String toString() {
			return "Transactions [trans_id=" + trans_id + ", quantity=" + quantity + ", purchase_date=" + purchase_date
					+ ", description=" + description + ", receipt=" + receipt + ", myuser=" + myuser.getUsers_id() + ", item=" + item.getItem_id()
					+ ", status=" + status.getStatus_id() + ", pmttype=" + pmttype.getPmt_id() + "]";
		}



		public Transactions() {
			super();
			// TODO Auto-generated constructor stub
		}



		public Transactions(int trans_id, int quantity, String purchase_date, String description, String receipt,
				User myuser, Items item, Status status, PaymentType pmttype) {
			super();
			this.trans_id = trans_id;
			this.quantity = quantity;
			this.purchase_date = purchase_date;
			this.description = description;
			this.receipt = receipt;
			this.myuser = myuser;
			this.item = item;
			this.status = status;
			this.pmttype = pmttype;
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



		public String getPurchase_date() {
			return purchase_date;
		}



		public void setPurchase_date(String purchase_date) {
			this.purchase_date = purchase_date;
		}



		public String getDescription() {
			return description;
		}



		public void setDescription(String description) {
			this.description = description;
		}



		public String getReceipt() {
			return receipt;
		}



		public void setReceipt(String receipt) {
			this.receipt = receipt;
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
			result = prime * result + ((description == null) ? 0 : description.hashCode());
			result = prime * result + ((item == null) ? 0 : item.hashCode());
			result = prime * result + ((myuser == null) ? 0 : myuser.hashCode());
			result = prime * result + ((pmttype == null) ? 0 : pmttype.hashCode());
			result = prime * result + ((purchase_date == null) ? 0 : purchase_date.hashCode());
			result = prime * result + quantity;
			result = prime * result + ((receipt == null) ? 0 : receipt.hashCode());
			result = prime * result + ((status == null) ? 0 : status.hashCode());
			result = prime * result + trans_id;
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
			if (description == null) {
				if (other.description != null)
					return false;
			} else if (!description.equals(other.description))
				return false;
			if (item == null) {
				if (other.item != null)
					return false;
			} else if (!item.equals(other.item))
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
			if (purchase_date == null) {
				if (other.purchase_date != null)
					return false;
			} else if (!purchase_date.equals(other.purchase_date))
				return false;
			if (quantity != other.quantity)
				return false;
			if (receipt == null) {
				if (other.receipt != null)
					return false;
			} else if (!receipt.equals(other.receipt))
				return false;
			if (status == null) {
				if (other.status != null)
					return false;
			} else if (!status.equals(other.status))
				return false;
			if (trans_id != other.trans_id)
				return false;
			return true;
		}
		
		


}