<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page import="java.util.List" %>
<%@ page import="org.database.Beam.Store" %>
<%@ page import="org.database.Beam.Product" %>
<%@ page import="org.database.Beam.User" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html class="no-js" lang="en">
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

<form method ="post" action = "checkout">
<!--<div style="width:60px; float:left">
   <ul>
   <li><b>Name</b></li>
   <s:iterator value="#request.listProducts">
   <li>
     <s:property value="name" />
   </li>
   </s:iterator>
   </ul>
</div>

<div style="width:300px; float:left">  
   <ul> 
   <li>Product kind</li>
   <s:iterator value="#request.listProducts">
   <li>
     <s:property value="product_kind" />
   </li>
   </s:iterator>
   </ul>
</div>

<div style="width:300px; float:left">    
   <ul>
   <li>Price</li>
   <s:iterator value="#request.listProducts">
   <li>
     <s:property value="price" />
   </li>
   </s:iterator>
   </ul>
</div>

<div style="width:300px; float:left">    
   <ul> 
   <li>Amount</li>
   <s:iterator value="#request.listProducts">
   <li>
     <s:property value="inventory_amount" />
   </li>
   </s:iterator>
   </ul>
 </div>
 
 <div style="width:300px; float:left">    
   <ul>   
   <li>Description</li>
   <s:iterator value="#request.listProducts">
   <li>
     <s:property value="description" />
   </li>
   </s:iterator>
   </ul>
 </div>
 
 <div style="width:300px; float:left">    
   <ul>     
   <li>University</li>
   <s:iterator value="#request.storelistList">
     <li>
       <s:property value="store_name" />
     </li>
   </s:iterator>
   </ul>
</div>

 <div style="width:300px; float:left">    
   <ul>   
   <li>Salesman</li>
   <s:iterator value="#request.salespersonList">
     <li>
       <s:property value="user.account" />
     </li>
   </s:iterator>
   </ul>
</div>

 <div style="width:300px; float:left">    
   <ul>    
    <li>Buy it</li>
    <s:iterator value="#request.listProducts">
      <li>
      <a herf="<s:url id="url" action="checkout"> 
               <s:param name="product.id"><s:property value="product.id"/></s:param> 
          </s:url>">
          <input type="submit"  value="buy it" /> 
       </a>
       </li>
    </s:iterator>
    </ul>
 </div>-->

<table style="margin-top:100px; float:clear">

   <% 
	List<Product> listProducts = (List<Product>)request.getAttribute("showproduct"); 
	List<Store> storelistList = (List<Store>)request.getAttribute("showstore"); 
	List<User> userList= (List<User>)request.getAttribute("showuser");
	out.print("<tr>");
	out.print("<td>" + "Name" + "</td>");
	out.print("<td>" + "Price" + "</td>");
	out.print("<td>" + "Amount" + "</td>");
	out.print("<td>" + "Description" + "</td>");
	out.print("<td>" + "University" + "</td>");
	out.print("<td>" + "Salesman" + "</td>");
	out.print("<td>" + "Add to cart" + "</td>");
	out.print("</tr>");
/* 	for (int i=0; i< listProducts.size(); i++) {
		out.print("<tr>");
		out.print("<td>" + listProducts.get(i).getName() + "</td>");
		out.print("<td>" + listProducts.get(i).getPrice() + "</td>");
		out.print("<td>" + listProducts.get(i).getInventory_amount() + "</td>");
		out.print("<td>" + listProducts.get(i).getDescription() + "</td>");
		out.print("<td>" + storelistList.get(i).getStore_name() + "</td>");
		out.print("<td>" + userList.get(i).getAccount() + "</td>");
		out.print("<td>" + "    "   + "</td>");
		out.print("</tr>");
	} */
	for (int i=0; i< listProducts.size(); i++) {
		Product p = listProducts.get(i);
		
		out.print("<tr>");
		out.print("<td>" + p.getName() + "</td>");
		out.print("<td>" + p.getPrice() + "</td>");
		out.print("<td>" + p.getInventory_amount() + "</td>");
		out.print("<td>" + listProducts.get(i).getDescription() + "</td>");
		out.print("<td>" + storelistList.get(i).getStore_name() + "</td>");
		out.print("<td>" + userList.get(i).getAccount() + "</td>");
		out.print("<td>" + "<a class='button buy-btn'>Add it</a >" + "</td>");
		out.print("<td>" + "<input type='text' name='quantity' value='0'/>" + "</td>");
		out.print("<input type='hidden' name='product.id' value='" + p.getId() + "'>");
		out.print("</tr>");
		
	}

   %>

</table>
</form>

<form id="buy-form" action="checkout" method="POST" style="display:none">
	<input type="hidden" value="" name="product.id" />
	<input type="text" value="" name="quantity" />
</form>


<script src="https://code.jquery.com/jquery-2.1.4.min.js"></script>
<script src="http://dhbhdrzi4tiry.cloudfront.net/cdn/sites/foundation.js"></script>
<script>
      $(document).foundation();
    </script>


 <script>
	function buyFormSubmit(id, quantity) {
		var $form = $("#buy-form");
		$form.find('[name="product.id"]').val(id);
		$form.find('[name="quantity"]').val(quantity);
		console.log(id, quantity);
		$form.submit();
	}
	$(document).ready(function(){
	
		$('body').on('click', '.buy-btn', function(){
			var $btn = $(this);
			var $parent = $btn.closest('tr');
			var id = $parent.find('[name="product.id"]').val();
			var q = $parent.find('[name="quantity"]').val();
			buyFormSubmit(id, q);
		})
	
	})
 </script>

</body>
</html>