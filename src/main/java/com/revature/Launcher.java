package com.revature;

import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import com.revature.models.Customer;
import com.revature.models.Inventory;
import com.revature.repositories.InventoryDAO;
import com.revature.utils.EcommerceUtil;


public class Launcher {

	public static void main(String[] args) {
		
		InventoryDAO iDAO = new InventoryDAO();
		
		//This try with resources is good for checking that your DB is connected
		//But we should comment it out once we know we're connected, because it will close the Session
		//For EVERYTHING that the main method calls afterwards.
		
	//	try(Session ses = EcommerceUtil.getSession()) {
	//		System.out.println("Connection Successful");
	//	} catch (HibernateException e) {
	//	    System.out.println("Connection Failed!");
	//		e.printStackTrace();
	//	}
		
		
		Customer c1 = new Customer("Alice", "Miller", "Rochester", "NY");
		Customer c2 = new Customer("Shirley", "Smith", "Richmond", "VA");
		Customer c3 = new Customer("James", "Brown", "Nashville", "TN"); 
				
	//	Inventory i1 = new Inventory("Monkey Meat", "Juni Ba", "01-15-2022", 25, c1);
	//	Inventory i2 = new Inventory("Arkham City", "Dan Watters", "01-18-2022", 28, c2);
	//	Inventory i3 = new Inventory("Inferno", "Jonathan Hickman", "01-20-2022", 26, c3);
		
		Item i1 = new Item("Devil’S Reign: Villains for Hire", "NEW YORK CITY is on a razor's edge, and there's only one force fighting for the rule of law in the chaos: Wilson Fisk's THUNDERBOLTS!", 1001, 1, c1);
		Item i2 = new Item("Arkham City", "Dan Watters", "01-18-2022", 28, c2);
		Item i3 = new Item("Inferno", "Jonathan Hickman", "01-20-2022", 26, c3);
		
		iDAO.insertInventory(i1);
		iDAO.insertInventory(i2);
		iDAO.insertInventory(i3);
		
		List<Inventory> allInventories = iDAO.getAllInventories();
		
		for(Inventory i : allInventories) {
			System.out.println(i);
		}
		
		System.out.println(iDAO.getInventoryById(2));
		
		System.out.println(iDAO.getInventoriesByCustomerId(1));

		i1.setTitle("SOMETHING ELSE");
		
		iDAO.UpdateInventoryWithSessionMethod(i1);
		
		System.out.println(iDAO.getInventoryById(1));
		
	}

}