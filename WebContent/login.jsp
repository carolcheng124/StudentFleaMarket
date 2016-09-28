<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0"/>
<link rel="stylesheet" href="http://dhbhdrzi4tiry.cloudfront.net/cdn/sites/foundation.min.css">
<link href="/bootstrap/css/bootstrap.min.css" rel="stylesheet">
<link href="signin.css" rel="stylesheet">
<link href="http://cdnjs.cloudflare.com/ajax/libs/foundicons/3.0.0/foundation-icons.css" rel="stylesheet">
<link rel="stylesheet" type="text/css" href="zt.css" />
<style>
	.wwFormTable {
		margin: auto;
	}

</style>


</head>
<body>
	<div style="margin-top: 60px;">
	<h4 class="text-center" style="font-size:36px; font-weight:800; color: #666">Student Flea Market</h4>
	<s:form action="login">
		<s:textfield label="Login ID" key="user.account" />
		<s:password label="Password" key="user.password" />
		<s:submit cssClass="button"/>
	</s:form>
	
	<div class="text-center">
		<a href="<%= request.getContextPath() %>/Registration.jsp"> A new user? Register here!</a>
	</div>
	</div>
</body>
</html>