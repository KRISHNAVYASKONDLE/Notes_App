package com.notemu;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Storedata
 */
public class Storedata extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Storedata() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		StudentData dao=new StudentData();
		
		
		li=dao.getingdat();
		HttpSession sess=request.getSession();
		
		sess.setAttribute("list", li);
		response.sendRedirect("index.jsp");	
		
		
		 for(Person p: li)
		    {
		    	System.out.println(p.getId()+"   "+p.getUserdata());
		    }
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
	List<Person> li;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
		String para=request.getParameter("userdata");
		StudentData dao=new StudentData();
		dao.sendData(para);
//		response.getWriter().append("Data Posted "+para);

		li=dao.getingdat();
		HttpSession sess=request.getSession();
		
		sess.setAttribute("list", li);
		response.sendRedirect("index.jsp");	
		
		
		 for(Person p: li)
		    {
		    	System.out.println(p.getId()+"   "+p.getUserdata());
		    }
		
		
		
	}

}


