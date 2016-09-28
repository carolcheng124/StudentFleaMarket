<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<s:iterator value="#request.listProducts">
<br>
<s:property value="name" />
<tr>
<s:property value="price" />
</tr>
<tr>
<s:property value="product_kind" />
</tr>
<tr>
<s:property value="description" />
</tr>
</s:iterator>

<s:property value="#session.user.account"/>
</body>
</html>