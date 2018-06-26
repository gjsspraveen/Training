package com.mav.db;

import java.beans.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.mav.logic.prodlogic;
import com.mav.repo.Prodt;
import com.mav.repo.Repo;

import sun.rmi.transport.Connection;

public class Dbconnection {
	
	static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://127.0.0.1:3306/fbooking";
	
	static final String USER = "root";
	static final String PASS = "";
	
	public int adddb (Repo modelobj)
	{
		java.sql.Connection conn = null;
		java.sql.Statement stmt = null;
		int result = 0;
		try
		{

			Class.forName(JDBC_DRIVER);
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			stmt = conn.createStatement();
			
			String query = "INSERT INTO repository (EmpID,EmpName,DeptCode,DOJ,Password,Re_Password) VALUES('"+modelobj.getEmpid()+ "','" +modelobj.getEmpname()+ "','" +modelobj.getDeptcode()+ "','" +modelobj.getDoj()+ "','"+modelobj.getPsw()+ "','"+modelobj.getPsw_repeat()+"');";
			System.out.println(query);
			result = stmt.executeUpdate(query);
			stmt.close();
			conn.close();
		}
		catch(Exception e)
		{
		System.out.println("Exception Occured"+e);
		}
		return result;
	}
	
	public int addproddb (Prodt prodobj)
	{
		java.sql.Connection conn = null;
		java.sql.Statement stmt = null;
		int result = 0;
		try
		{

			Class.forName(JDBC_DRIVER);
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			stmt = conn.createStatement();
			
			String query = "INSERT INTO addprodtable (prodid,prodname,description,stdt,expdt) VALUES('"+prodobj.getProductid()+ "','" +prodobj.getProductname()+ "','" +prodobj.getDescription()+ "','" +prodobj.getStartdate()+ "','"+prodobj.getExpirydate()+"');";
			System.out.println(query);
			result = stmt.executeUpdate(query);
			stmt.close();
			conn.close();
		}
		catch(Exception e)
		{
		System.out.println("Exception Occured"+e);
		}
		return result;
	}
	
	
 public int getuserinfo (String user, String Pswd)
	{
		java.sql.Connection conn = null;
		java.sql.Statement stmt = null;
		int result = 0;
		try
		{

			Class.forName(JDBC_DRIVER);
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			stmt = conn.createStatement();
			
			String query = "SELECT * from repository where EmpID='"+user+"' and Password='"+Pswd+"'";
			System.out.println(query);
			ResultSet retrn = stmt.executeQuery(query);
			
			if(retrn.next()) {
				result=1;
			}
			
			stmt.close();
			conn.close();
		}
		catch(Exception e)
		{
		System.out.println("Exception Occured"+e);
		}
		return result;
	}
 
 public List<Prodt> productList ()
	{
		java.sql.Connection conn = null;
		java.sql.Statement stmt = null;
		List<Prodt> product = new ArrayList<Prodt>();
		Prodt productadd = new Prodt();
		try
		{

			Class.forName(JDBC_DRIVER);
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			stmt = conn.createStatement();
			
			String query = "SELECT * from repository";
			System.out.println(query);
			ResultSet retrn = stmt.executeQuery(query);
			
			while(retrn.next()) {
				productadd = new Prodt();
				productadd.setProductid(retrn.getString("prodid"));
				productadd.setProductname(retrn.getString("prodname"));
				productadd.setDescription(retrn.getString("description"));
				productadd.setStartdate(retrn.getString("stdt"));
				productadd.setExpirydate(retrn.getString("expdt"));
				product.add(productadd);
			}
			
			stmt.close();
			conn.close();
		}
		catch(Exception e)
		{
		System.out.println("Exception Occured"+e);
		}
		return product;
	}

public int adddb(Prodt prodmodelobj) {
	// TODO Auto-generated method stub
	return 0;
}

}
