package com.mav.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mav.db.Dbconnection;
import com.mav.logic.Logic;
import com.mav.logic.prodlogic;
import com.mav.repo.Prodt;
import com.mav.repo.Repo;

/**
 * Servlet implementation class Productservlet
 */
// @WebServlet("/Productservlet")
public class Productservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Productservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String Productid = request.getParameter("prodid");
		String Productname = request.getParameter("prodname");
		String Description = request.getParameter("description");
		String Startdate = request.getParameter("stdt");
		String Expirydate = request.getParameter("expdt");
		
		Dbconnection dbcon = new Dbconnection();
		
		List<Prodt> prodlog = dbcon.productList();
		
		System.out.println("prodlog");
		
				//(Productid,Productname,Description,Startdate,Expirydate);
		/**
		if (prodlog>0) {
			request.getRequestDispatcher("Addpage.jsp").forward(request, response);
		}
		else {
			request.getRequestDispatcher("Login.jsp").forward(request, response);
		}	*/
				
			
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String Productid = request.getParameter("prodid");
		String Productname = request.getParameter("prodname");
		String Description = request.getParameter("description");
		String Startdate = request.getParameter("stdt");
		String Expirydate = request.getParameter("expdt");
		
		System.out.println("prod add");
		
		prodlogic prdtid = new prodlogic(); // object creation for logic
		Prodt prodmodelobj = new Prodt(); // object creation of Model class
		
		prodmodelobj.setProductid(Productid); // setting the values from the get string above
		prodmodelobj.setProductname(Productname);
		prodmodelobj.setDescription(Description);
		prodmodelobj.setStartdate(Startdate);
		prodmodelobj.setExpirydate(Expirydate);
			
		 
		boolean result = prdtid.details(prodmodelobj);		//dept ?
		
		if(result) {
			Dbconnection Dobj = new Dbconnection(); // obj creation for DB class
			int added = Dobj.adddb(prodmodelobj);
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
	}
//// 
}
