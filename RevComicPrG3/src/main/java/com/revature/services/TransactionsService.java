package com.revature.services;

import java.util.List;

import com.revature.models.Transactions;
import com.revature.repositories.TransactionsDAO;

public class TransactionsService {
	
	TransactionsDAO tDAO = new TransactionsDAO(); 

	public List<Transactions> getTransactions() {
	
	
	List<Transactions> transactions = tDAO.getAllTransactions();
	
	
	return transactions;
}
	
	public void addTransactions(Transactions newTransactions) {
		
		
		tDAO.insertTransactions(newTransactions);
	}
	public Transactions updateTransactions(Transactions trans_status) {
		
		tDAO.UpdateTransactions(trans_status);
		
		return trans_status;
		
	}

	public Transactions getTransactionsById(int id) {
		
		Transactions transById= tDAO.getTransactionsById(id);
		
		return transById;
	}
	
	public List<Transactions> getTransactionsByUserId(int id) {
		
		List<Transactions> transById= tDAO.getTransactionsByUserId(id);
		
		return transById;
	}

}
