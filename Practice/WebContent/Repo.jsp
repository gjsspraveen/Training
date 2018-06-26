<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title> Reference Repository</title>
</head>
<body>

<p>The reference element specifies a list of pre-defined options for an input element.</p>

<form action="" method="get">
Project: <input list="projectname" name="projectname"> <!-- Project List -->
		<datalist id="projects">	
    		<option value="Metro">
    		<option value="Tandem">    
  		</datalist>
  
Module:  <input list="Modulename" name="Modulename"> <!-- Module List -->
  		<datalist id="Modules">
    		<option value="Loans">
    		<option value="Cards">    
  		</datalist>
   
SubModule: <input list="Submodulename" name="Submodulename"> <!-- Submodule List -->
  		<datalist id="submodule">
    		<option value="Metro">
    		<option value="Tandem">    
  		</datalist>
  		
Product Code: <input list="ProductCode" name="Productcode"> <!-- Submodule List -->
  		<datalist id="productcode">
    		<option value="Metro">
    		<option value="Tandem">    
  		</datalist>  		
  
   <input type="submit">
</form>

<p><b>Note:</b> The reference tag is not supported in Safari or IE9 (and earlier).</p>

</body>
</html>