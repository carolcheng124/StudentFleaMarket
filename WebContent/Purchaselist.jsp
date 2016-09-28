<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page import="java.util.List" %>
<%@ page import="org.database.Beam.Store" %>
<%@ page import="org.database.Beam.Product" %>
<%@ page import="org.database.Beam.User" %>
<%@ page import="org.database.Beam.Transaction" %>
<!DOCTYPE html>
<html class="no-js" lang="en">
<head>
    <meta charset="utf-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <link rel="stylesheet" href="http://dhbhdrzi4tiry.cloudfront.net/cdn/sites/foundation.min.css">
    <link href="/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <link href="signin.css" rel="stylesheet">
    <link href="http://cdnjs.cloudflare.com/ajax/libs/foundicons/3.0.0/foundation-icons.css" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="zt.css" />
    <script src="//code.jquery.com/jquery-1.11.3.min.js"></script>
</head>
<body>
  <%@include file="include/nav.jsp" %> 
<br>

<form action="showtransaction" method="POST">
<table style="margin-top:100px; float:clear">
<% 
	List<Product> productlist = (List<Product>)request.getAttribute("showproduct"); 
	List<Transaction> transactionlist = (List<Transaction>)request.getAttribute("showtransaction"); 
	List<User> userList= (List<User>)request.getAttribute("showuser");
	out.print("<tr>");
	out.print("<td>" + "Category" + "</td>");
	out.print("<td>" + "Name" + "</td>");
	out.print("<td>" + "Price" + "</td>");
	out.print("<td>" + "Quantity" + "</td>");
	out.print("<td>" + "Description" + "</td>");
	out.print("<td>" + "Tradingtime" + "</td>");
	out.print("</tr>");
	for (int i=0; i< transactionlist.size(); i++) {
		Product p = productlist.get(i);
		out.print("<tr>");
		out.print("<td>" + p.getProduct_kind() + "</td>");
		out.print("<td>" + p.getName() + "</td>");
		out.print("<td>" + p.getPrice() + "</td>");
		out.print("<td>" + transactionlist.get(i).getQuantity()+ "</td>");
		out.print("<td>" + p.getDescription() + "</td>");
		out.print("<td>" + transactionlist.get(i).getDate()+ "</td>");
		out.print("</tr>");
	}
   %>
</table>
</form>



  </body>
</html>
