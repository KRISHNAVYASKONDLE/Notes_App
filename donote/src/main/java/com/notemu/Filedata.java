package com.notemu;

import java.io.IOException;
import java.util.List;

import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Servlet implementation class Filedata
 */
public class Filedata extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Filedata() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		StudentData dao=new StudentData();		
	    SessionFactory factory=new Configuration().configure("hibernate.conf.xml").buildSessionFactory();
	    Session session=factory.openSession();
		CriteriaBuilder cb = session.getCriteriaBuilder();
	    CriteriaQuery<Person> cq = cb.createQuery(Person.class);
	    Root<Person> rootEntry = cq.from(Person.class);
	    CriteriaQuery<Person> all = cq.select(rootEntry);
	    TypedQuery<Person> allQuery = session.createQuery(all);
		List<Person> li = dao.getingdat();
		HttpSession sess=request.getSession();
		
		sess.setAttribute("list", li);

	}

	

}
