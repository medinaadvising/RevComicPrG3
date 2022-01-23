package com.revature.repositories;

import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.revature.models.Item;
import com.revature.utils.EcommerceUtil;

public class ItemDAO {

	public void insertItem(Item item) {
		
		Session ses = EcommerceUtil.getSession();
		
		ses.save(item);
		
		EcommerceUtil.closeSession();
		
	}
	
	public List<Item> getAllItems(){
		
		Session ses = EcommerceUtil.getSession();
		
		List<Item> itemList = ses.createQuery("FROM Item").list();
		
		EcommerceUtil.closeSession();
		
		return itemList; 
		
	}
	
	
	public Item getItemById(int id){
		
		Session ses = EcommerceUtil.getSession();
		
		Item item = ses.get(Item.class, id);
		
		EcommerceUtil.closeSession();
		
		return item; 
	}
	
	
	public List<Item> getItemsByCreatorId(int id){
		
		Session ses = EcommerceUtil.getSession();
		
		Query q = ses.createQuery("FROM Item i WHERE i.creator_id = ?0");
		
		q.setParameter(0, id);
		
		List<Item> itemList = q.getResultList();
		
		EcommerceUtil.closeSession();
		
		return itemList;
		
	}
	
    
	public List<Item> getItemsByGenreId(int id){
		
		Session ses = EcommerceUtil.getSession();
		
		Query q = ses.createQuery("FROM Item i WHERE i.genre_id = ?0");
		
		q.setParameter(0, id);
		
		List<Item> itemList = q.getResultList();
		
		EcommerceUtil.closeSession();
		
		return itemList;
		
	}

    public List<Item> getItemsByCharacterId(int id){
	
	   Session ses = EcommerceUtil.getSession();
	
	   Query q = ses.createQuery("FROM Item i WHERE i.character_id = ?0");
	
	   q.setParameter(0, id);
	
	   List<Item> itemList = q.getResultList();
	
	   EcommerceUtil.closeSession();
	
	   return itemList;
	
    }


    public List<Item> getItemsByPromo_TypeId(int id){
	
	   Session ses = EcommerceUtil.getSession();
	
	   Query q = ses.createQuery("FROM Item i WHERE i.promo_type_id = ?0");
	
	   q.setParameter(0, id);
	
	   List<Item> itemList = q.getResultList();
	
	   EcommerceUtil.closeSession();
	
	   return itemList;
	
    }
	
	
	public void UpdateItemWithSessionMethod(Item item) {
		
		Session ses = EcommerceUtil.getSession();
		
		Transaction tran = ses.beginTransaction();
		
		ses.merge(item);
		
		tran.commit(); 
		EcommerceUtil.closeSession();
		
	}
	
	
	public void updateItemWithHQL(Item item) {
		
		Session ses = EcommerceUtil.getSession();
		
		Transaction tran = ses.beginTransaction();
		
		Query q = ses.createQuery("UPDATE Item SET title = '" + item.getTitle() + "' WHERE id = " + item.getId());
		
		q.executeUpdate();
		
		tran.commit(); 
		EcommerceUtil.closeSession();
		
	}
	

}


