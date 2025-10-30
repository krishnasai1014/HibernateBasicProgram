package com.tap.hibernateManager;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.tap.entity.Employee;

public class HibernateManager {
	
	Session session;
	
	public HibernateManager()
	{
	session= 	new Configuration().configure().addAnnotatedClass(Employee.class).buildSessionFactory().openSession();
	}
	
	public void add(Employee e)
	{
		Transaction t = session.beginTransaction();
		session.persist(e);
		System.out.println("data added");
		session.getTransaction().commit();
	
	}

	public Employee getUserId(int id) {
		
		return session.get(Employee.class,id);
	}
	public void delete(int id)
	{
	 Transaction	t=session.beginTransaction();
	Employee e = session.get(Employee.class, id);
	if(e!=null)
	{
		 session.delete(e);
		 session.getTransaction().commit();
		 System.out.println("data deleted");

	}
	else
	{
		System.out.println("No employee found");
	}
	
	}
		
	public void updateEmployee(int id ,String name)
	{
		session.beginTransaction();
		
		Employee e = session.get(Employee.class,id);
		
		if(e!=null)
		{
		e.setName(name);	
			session.update(e);
			session.getTransaction().commit();
			System.out.println("upadted");
		}
		else
			
		{
			System.out.println("not updated");
		}
		}
		
		
	}
	
	


