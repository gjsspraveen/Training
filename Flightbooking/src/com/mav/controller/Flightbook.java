package com.mav.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mav.fblogic.Fblogic;
import com.mav.model.FModel;

/**
 * Servlet implementation class Flightbook
 */
//@WebServlet("/Flightbook")
public class Flightbook extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Flightbook() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// doGet(request, response);
		
		String flightname=request.getParameter("fname");
		String source=request.getParameter("source");
		String destination=request.getParameter("Destination");
		String fare=request.getParameter("Fare");
		String seats=request.getParameter("Seats");
		String aircraftname=request.getParameter("Aname");
		
		FModel fbook = new FModel();
		fbook.setFname(flightname);
		fbook.setSrc(source);
		fbook.setDest(destination);
		fbook.setSeats(seats);
		fbook.setFare(fare);
		fbook.setAname(aircraftname);
		
		Fblogic logi = new Fblogic ();
		boolean b ;
		b = logi.log(fbook);
		
		if (b)
		{
			System.out.println ("navigated to DB");
			
		}
		else 
			System.out.println ("https://www.google.co.in");
		}					
		
	}



