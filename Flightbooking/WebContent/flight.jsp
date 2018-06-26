<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Flight Booking</title>
</head>
<body>
<form method="post" action="Flightbook">
<br>
Flight Name: <input type="text" name="fname"/><br>
Source : <input type="text" name="source"/><br>
Destination : <input type="text" name="Destination"/><br>
Fare : <input type="text" name="Fare"/><br>
No of seats : <input type="text" name="Seats"/><br>
Aircraft Name : <input type="text" name="Aname"/><br>
<input type="submit" value = "Search" /> 

<!--  <button type="button" onclick=" ">Add Flight</button>
<input type="submit" /> 
<button type="button" onclick="alert('Searching the selected Option....!')">Search</button>
-->

</form>
</body>
</html>