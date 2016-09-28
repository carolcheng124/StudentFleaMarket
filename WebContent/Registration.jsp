<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="org.database.Beam.User" %>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
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
    
    <!-- <div class="top-bar">
    <div class="row">
    <div class="top-bar-left">
       <ul class="dropdown menu" data-dropdown-menu>
       <li class="menu-text">Big god</li>
       </ul>
        <br>
        <ul class="dropdown menu" data-dropdown-menu>
          
          <li class="has-submenu">
              <a href="#">Product</a>
          </li>
          <li><a href="#">Sell items</a></li>
          <li><a href="#">Exploration</a></li>          
          <li><a href="#">About us</a></li>
       </ul>
    </div>

  <div class="top-bar-right">
    <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
    <br> 
    <br>
    <ul class="menu">
      <li><input type="search" placeholder="Search"></li>
      <li><button type="button" class="button">Search</button></li>
    </ul>
  </div>
  </div>
</div> -->
<br> 

<div class="row">
<div class="small-8 small-offset-2">
<form method ="post" action = "register" align="center">
    <div>
    Account:
    <input type="text" name="user.account" size="50"/>
    </div>
    <br>
    <div>
    Password:
    <input type="text" name="user.password" size="50"/>
    </div>
    <br>
    
    <div>
    Name:
    <input type="text" name="user.name" size="50"/>
    </div>
    <br>
    <div>
    Gender:
    <select name="user.gender">
     <option value ="1">Male</option>
    <option value ="0">Female</option>
    </select>
    </div>
    <br>
    
    <div>
    Age:
    <input type="text" name="user.age" size="50"/>
    </div>
    <br>
    <div>
    Phone:
    <input type="text" name="user.phone" size="50"/>
    </div>
    <br>
    
    <div>
    <label>University:
    <select name="store.store_name">
      <option value ="University of Pittsburgh">University of Pittsburgh</option>
      <option value ="Carnegie Mellon University">Carnegie Mellon University</option>
      <option value="Harvard University">Harvard University</option>
      <option value="Johns Hopkins University">Johns Hopkins University</option>
      <option value="University of Florida">University of Florida</option>
      <option value="George Washington University">George Washington University</option>
      <option value="Duke University">Duke University</option>
      <option value="Boston College">Boston College</option>
      <option value="New York University">New York University</option>
      <option value="UCLA">UCLA</option>
      <option value="UC-Berkeley">UC-Berkeley</option>
      <option value="Stanford University">Stanford University</option>
      <option value="University of Washington">University of Washington</option>
      <option value="University of California-San Diego">University of California-San Diego</option>
      <option value="University of Southern California">University of Southern California</option>
      <option value="University of Chicago">University of Chicago</option>
      <option value="Northwestern University">Northwestern University</option>
      <option value="University of Illinois Urbana Champaign">University of Illinois Urbana Champaign</option>
      <option value="Rice University">Rice University</option>
    </select>
    </label>
    </div>
    <br>
    
    <div>
    School:
    <select name="user.school">
      <option value ="Information Science">Information Science</option>
      <option value ="Busines">Business</option>
      <option value="Computer Science">Computer Science</option>
      <option value="Medicine">Medicine</option>
      <option value="Law">Law</option>
      <option value="Engineering">Engineering</option>
      <option value="Art&Science">Art&Science</option>
      <option value="Other">Other</option>
    </select>
    </div>
    <br>
    
    <div>
    Street:
    <input type="text" name="user.street" size="50"/>
    </div>
    <br>
    
    <div>
    City:
    <input type="text" name="user.city" size="50"/>
    </div>
    <br>
    
    <div>
    State:
    <input type="text" name="user.state" size="50"/>
    </div>
    <br>
    
     <div>
    Zipcode:
    <input type="text" name="user.zipcode" size="50"/>
    </div>
    <br>
    
    <input type="submit" value="Submit" name="Submit" />

</form>
</div>  
</div>

        
        
        
        
        
</body>
</html>
