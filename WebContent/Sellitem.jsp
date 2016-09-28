<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html class="no-js" lang="en">
<%@ page import="org.database.Beam.User" %>
<head>
<meta charset="utf-8"/>
<meta name="viewport" content="width=device-width, initial-scale=1.0"/>
<link rel="stylesheet" href="http://dhbhdrzi4tiry.cloudfront.net/cdn/sites/foundation.min.css">
<link href="/bootstrap/css/bootstrap.min.css" rel="stylesheet">
<link href="signin.css" rel="stylesheet">
<link href="http://cdnjs.cloudflare.com/ajax/libs/foundicons/3.0.0/foundation-icons.css" rel="stylesheet">
<link rel="stylesheet" type="text/css" href="zt.css" />
<script src="/scripts/jquery.min.js"></script>
</head>
<body>
<%@include file="include/nav.jsp" %> 

<br>     
<div class="row">
<div class="small-8 small-offset-2">
<form method ="post" action ="postproductaction" align="center">
    <div>
      Item Category:
    <select name="product.product_kind">
      <option value ="Furniture">Furniture</option>
      <option value ="Appliances">Appliances</option>
      <option value="Books">Books</option>
      <option value="Electronics">Electronics</option>
      <option value="Clothing,shoes&jewelry">Clothing,shoes&jewelry</option>
      <option value="video games">video games</option>
      <option value="Other">Other</option>
    </select>
    </div>    
       
    <div>
      Item Name:
      <input type="text" name="product.name"/>
    </div>
    <br>
    
    <div>
      Item Price:
      <input type="text" name="product.price"/>
    </div>
    <br>
    
    <div>
      Item amount:
      <input type="text" name="product.inventory_amount"/>
    </div>
    <br>
    
    <div>
      Description:
      <input type="text" name="product.description"/>
    </div>
    <br>
    
    
    <input type="submit" value="Submit" name="Sell it" class="button" />
</form>  
</div>
</div>
<script src="https://code.jquery.com/jquery-2.1.4.min.js"></script>
<script src="http://dhbhdrzi4tiry.cloudfront.net/cdn/sites/foundation.js"></script>
<script>
      $(document).foundation();
    </script>     
</body>
</html>
