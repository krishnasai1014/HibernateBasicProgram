package com.tap.main;

import com.tap.entity.Employee;
import com.tap.hibernateManager.HibernateManager;

public class Launch {

	
	public static void main(String[] args) {
		
		HibernateManager hm = new HibernateManager();
		
		//Employee e = new Employee(1,"sai","IT",150000);
		
	//	hm.add(e);
	//	Employee e =hm.getUserId(2);
	//	System.out.println(e);
	//	int id=2;
	//	hm.delete(id);
		
		int id=1;
		String name="sasi";
		hm.updateEmployee( id,name);
		
	}
}
