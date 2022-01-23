package com.revature.repositories;

import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.revature.models.Inventory;
import com.revature.utils.EcommerceUtil;

public class InventoryDAO {

	public void insertInventory(Inventory inventory) {
		
		Session ses = EcommerceUtil.getSession();
		
		ses.save(inventory);
		
		EcommerceUtil.closeSession();
		
	}
	
	public List<Inventory> getAllInventories(){
		
		Session ses = EcommerceUtil.getSession();
		
		List<Inventory> inventoryList = ses.createQuery("FROM Inventory").list();
		
		EcommerceUtil.closeSession();
		
		return inventoryList; 
		
	}
	
	
	public Inventory getInventoryById(int id){
		
		Session ses = EcommerceUtil.getSession();
		
		Inventory inventory = ses.get(Inventory.class, id);
		
		EcommerceUtil.closeSession();
		
		return inventory; 
	}
	
	
	public List<Inventory> getInventoriesByCustomerId(int id){
		
		Session ses = EcommerceUtil.getSession();
		
		Query q = ses.createQuery("FROM Inventory i WHERE i.customer.id = ?0");
		
		q.setParameter(0, id);
		
		List<Inventory> inventoryList = q.getResultList();
		
		EcommerceUtil.closeSession();
		
		return inventoryList;
		
	}
	
	
	public void UpdateInventoryWithSessionMethod(Inventory inventory) {
		
		Session ses = EcommerceUtil.getSession();
		
		Transaction tran = ses.beginTransaction();
		
		ses.merge(inventory);
		
		tran.commit(); 
		EcommerceUtil.closeSession();
		
	}
	
	
	public void updateInventoryWithHQL(Inventory inventory) {
		
		Session ses = EcommerceUtil.getSession();
		
		Transaction tran = ses.beginTransaction();
		
		Query q = ses.createQuery("UPDATE Inventory SET title = '" + inventory.getTitle() + "' WHERE id = " + inventory.getId());
		
		q.executeUpdate();
		
		tran.commit(); 
		EcommerceUtil.closeSession();
		
	}
	

}


