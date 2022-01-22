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
		@JoinColumn(name = "users_id")
		public User user;
		




		@Override
		public String toString() {
			return "Transaction [trans_id=" + trans_id + ", quantity=" + quantity + ", purchase_date=" + purchase_date
					+ ", description=" + description + ", receipt=" + receipt + ", user=" + user.getUsers_id() + "]";
		}





		public Transactions() {
			super();
			// TODO Auto-generated constructor stub
		}





		public Transactions(int trans_id, int quantity, String purchase_date, String description, String receipt,
				String l_name, String user_email, User user) {
			super();
			this.trans_id = trans_id;
			this.quantity = quantity;
			this.purchase_date = purchase_date;
			this.description = description;
			this.receipt = receipt;
			this.user = user;
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




		public User getUser() {
			return user;
		}





		public void setUser(User user) {
			this.user = user;
		}





		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((description == null) ? 0 : description.hashCode());
			result = prime * result + ((purchase_date == null) ? 0 : purchase_date.hashCode());
			result = prime * result + quantity;
			result = prime * result + ((receipt == null) ? 0 : receipt.hashCode());
			result = prime * result + trans_id;
			result = prime * result + ((user == null) ? 0 : user.hashCode());
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
			if (trans_id != other.trans_id)
				return false;
			if (user == null) {
				if (other.user != null)
					return false;
			} else if (!user.equals(other.user))
				return false;
			return true;
		}


		


	

		
		
		
}

