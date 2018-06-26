<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Product</title>
<style>
body {
    font-family: Arial, Helvetica, sans-serif;
    background-color: #167ECF;
}

* {
    box-sizing: border-box;
}

/* Add padding to containers */
.container {
    padding: 16px;
    background-color: white;
}

/* Full-width input fields */
input[type=text], input[type=password] {
    width: 100%;
    padding: 15px;
    margin: 5px 0 22px 0;
    display: inline-block;
    border: none;
    background: #f1f1f1;
}

input[type=text]:focus, input[type=password]:focus {
    background-color: #ddd;
    outline: none;
}

/* Overwrite default styles of hr */
hr {
    border: 1px solid #f1f1f1;
    margin-bottom: 25px;
}

/* Set a style for the submit button */
.registerbtn {
    background-color: #A20560;
    color: white;
    padding: 16px 20px;
    margin: 8px 0;
    border: none;
    cursor: pointer;
    width: 100%;
    opacity: 0.9;
}

.registerbtn:hover {
    opacity: 1;
}

/* Add a blue text color to links */
a {
    color: dodgerblue;
}

/* Set a grey background color and center the text of the "sign in" section */
.signin {
    background-color: #f1f1f1;
    text-align: center;
}
</style>
</head>
<body>
<form action="Productservlet" method="post">
  <div class="container">
    <h1>Welcome to Java Store</h1>
    <p>Add Product to the Repository.</p>
    <hr>

    <label for="prodid"><b>Product ID</b></label>
    <input type="text" placeholder="Enter Product id" name="prodid" required>
    
    <label for="prodname"><b>Product Name</b></label>
    <input type="text" placeholder="Enter Product Name" name="prodname" required>

	<label for="description"><b>Product Description</b></label>
    <input type="text" placeholder="Enter Product Description" name="description" required>

	<label for="stdt"><b>Start Date</b></label>
	<p><input type="date"> <br></p>	
	
	<label for="expdt"><b>Expiry Date</b></label>
	<p><input type="date"> <br></p>	
   
    <hr>
    <p>By creating an account you agree to our <a href="https://en.wikipedia.org/wiki/Terms_of_service">Terms & Privacy</a>.</p>

    <button type="submit" class="registerbtn">Add Product</button>
  </div>
  
  <div class="container signin">
    <p>Dashboard - <a href="http://localhost:8086/Practice/Login.jsp"> Home Page</a>.</p>
  <b></b>  
  </div> 
   <p><b>Note:</b> The application is not supported in Safari or IE9 (and earlier).</p> 
</form>
</body>
</html>