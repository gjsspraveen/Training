package com.mav.database;
import com.mav.model.FModel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class AddFlightDB 
{
	final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	final String DB_URL = "jdbc:mysql://127.0.0.1:3306/fbooking";
	
	// Database Credentials
	static final String USER = "root";
	static final String PASS = "";
	
	
	public void addFlightToDB(FModel flightModel)
	{
		Connection conn=null;
		Statement stmt=null;
		
		//Exception Handling and Error
		try
		{
			//registering the Driver
			Class.forName(JDBC_DRIVER);
			
			//getting the connection
			conn=DriverManager.getConnection(DB_URL, USER, PASS);
			
			//Creating the statement
			stmt = conn.createStatement();
			
			
			String query = "INSERT INTO flightdetails (fligntname,destination,source,fare,aircraftname,NOofseat) "
					+ "VALUES('"+flightModel.getFname()+ "', '" +flightModel.getDest()+ "','" +flightModel.getSrc()+ "','" +flightModel.getFare() + "','"+flightModel.getAname()+ "','"+flightModel.getSeats()+"')";
							
			System.out.println(query);
			int result = stmt.executeUpdate(query);
			stmt.close();
			conn.close();			
		}
		catch(Exception e)
		{
		System.out.println("Exception Occured"+e);
		}
		
		
	}
	
}
