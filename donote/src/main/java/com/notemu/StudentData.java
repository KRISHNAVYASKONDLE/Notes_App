package com.notemu;

import java.util.List;

import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class StudentData {

    SessionFactory factory=new Configuration().configure("hibernate.conf.xml").buildSessionFactory();
    Session ses=factory.openSession();
    
    public void sendData(String para) {
		// TODO Auto-generated method stub
		Person p = new Person(para);
		ses.beginTransaction();
		ses.save(p);
		ses.getTransaction().commit();
		ses.beginTransaction();
		
	}
	
	public  List<Person> getingdat()
	{
		CriteriaBuilder cb = ses.getCriteriaBuilder();
	    CriteriaQuery<Person> cq = cb.createQuery(Person.class);
	    Root<Person> rootEntry = cq.from(Person.class);
	    CriteriaQuery<Person> all = cq.select(rootEntry);

	    TypedQuery<Person> allQuery = ses.createQuery(all);
		
//	    for(Person p: allQuery.getResultList())
//	    {
//	    	System.out.println(p.getId()+"   "+p.getUserdata());
//	    }
	    
		return allQuery.getResultList();
		
	}
	

	
	
}
