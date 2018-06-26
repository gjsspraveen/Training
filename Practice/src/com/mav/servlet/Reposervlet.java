package com.mav.servlet; 

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mav.db.Dbconnection;
import com.mav.logic.Logic;
import com.mav.repo.Repo;

/**
 * Servlet implementation class Reposervlet
 */
//@WebServlet("/Reposervlet")
public class Reposervlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()	
     */
    public Reposervlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String Empid = request.getParameter("empid");
		String Password = request.getParameter("psw");
		Dbconnection dbcon = new Dbconnection();
						
		int userlog = dbcon.getuserinfo(Empid,Password);
		if (userlog>0) {
			request.getRequestDispatcher("Addpage.jsp").forward(request, response);
		}
		else {
			request.getRequestDispatcher("Login.jsp").forward(request, response);
		}		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String Empid = request.getParameter("empid");
		String Empname = request.getParameter("empname");
		String DeptCode = request.getParameter("deptcode");
		String Dateofjoin = request.getParameter("doj");
		String Password = request.getParameter("psw");
		String PasswordRepeat = request.getParameter("psw_repeat");		
		
		System.out.println("Done");
		
		Logic dept = new Logic(); // object creation for logic
		Repo modelobj = new Repo(); // object creation of Model class
		
		modelobj.setEmpid(Empid); // setting the values from the get string above
		modelobj.setEmpname(Empname);
		modelobj.setDeptcode(DeptCode);
		modelobj.setDoj(Dateofjoin);
		modelobj.setPsw(Password);
		modelobj.setPsw_repeat(PasswordRepeat);
		
		boolean result =dept.details(modelobj);		
		
		if(result) {
			Dbconnection Dobj = new Dbconnection(); // obj creation for DB class
			int added = Dobj.adddb(modelobj);
			if (added>0) {
				request.getRequestDispatcher("Regpass.jsp").forward(request, response);
			}
			else {
				request.getRequestDispatcher("Register.jsp").forward(request, response);
			}
		}		
		else {
			request.getRequestDispatcher("Register.jsp").forward(request, response);
		}
					
		//doGet(request, response);
	}

}
