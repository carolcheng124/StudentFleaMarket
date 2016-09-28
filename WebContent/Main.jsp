<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page import="org.database.Beam.User" %>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
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

<div>
  <h1 align="center">
   Popular Products 
  </h1>
  <div class="row medium-6 columns" >
    <div class="image-wrapper overlay-fade-in thumbnail">    
      <img src="http://placehold.it/650x350"/> 
      <div class="image-overlay-content">
        <h2>.overlay-fade-in</h2>
        <p class="price">$99.99</p>
        <a href="#" class="button">Get it</a>
      </div>  
    </div>
  </div>
</div>


<div class="row small-up-4" style="align: center">
  <div class="column">
    <div class="image-wrapper overlay-fade-in thumbnail">    
      <img src="http://placehold.it/250x200" /> 
      <div class="image-overlay-content">
        <h2>.overlay-fade-in</h2>
        <p class="price">$99.99</p>
        <a href="#" class="button">Get it</a>
      </div>  
    </div>
  </div>
    
  <div class="column">
    <div class="image-wrapper overlay-fade-in thumbnail">    
      <img src="http://placehold.it/250x200" /> 
      <div class="image-overlay-content">
        <h2>.overlay-fade-in</h2>
        <p class="price">$99.99</p>
        <a href="#" class="button">Get it</a>
      </div>  
    </div>
  </div>
    
  <div class="column">
    <div class="image-wrapper overlay-fade-in thumbnail">    
      <img src="http://placehold.it/250x200" /> 
      <div class="image-overlay-content">
        <h2>.overlay-fade-in</h2>
        <p class="price">$99.99</p>
        <a href="#" class="button">Get it</a>
      </div>  
    </div>
  </div>
    
  <div class="column">
    <div class="image-wrapper overlay-fade-in thumbnail">    
      <img src="http://placehold.it/250x200" /> 
      <div class="image-overlay-content">
        <h2>.overlay-fade-in</h2>
        <p class="price">$99.99</p>
        <a href="#" class="button">Get it</a>
      </div>  
    </div>
  </div>
</div>

<hr>
<h1 align="center">
  Recommendations
</h1>
<br>
<h2 align="right">
  ——Just For You
</h2>
<hr>

<div class="column row">
  <ul class="tabs" data-tabs id="example-tabs">
     <li class="tabs-title is-active"><a href="#panel1" aria-selected="true">Your Neighbors</a></li>
     <li class="tabs-title"><a href="#panel2">Your Schoolmates</a></li>
  </ul>

  <div class="tabs-content" data-tabs-content="example-tabs">
    <div class="tabs-panel is-active" id="panel1">
       <h4>What Do They Buy?</h4>
       <div class="alert-box large">
         <strong>Cup</strong> Large Alert
       </div>
       <br>
       <div class="alert-box large">
         <strong>Books</strong> Large Alert
       </div>
       <br>
       <div class="alert-box large">
         <strong>Microwave</strong> Large Alert
       </div> 
   </div>
    
   <div class="tabs-panel" id="panel2">
    <div class="row">
      <div class="small-9 columns small-centered">
        <article class="event">
          <div class="event-date">
            <p class="event-month">Sept</p>
            <p class="event-day">18</p>
          </div>
          <div class="event-desc">
            <h4 class="event-desc-header">Day in the Life of Foundation for Apps</h4>
            <p class="event-desc-detail"><span class="event-desc-time"></span>BDConf - Altlanta</p>
          </div>
        </article>
        <hr>

        <article class="event">
          <div class="event-date">
            <p class="event-month">Oct</p>
            <p class="event-day">21</p>
          </div>
          <div class="event-desc">
            <h4 class="event-desc-header">Day in the Life of Foundation for Apps</h4>
            <p class="event-desc-detail"><span class="event-desc-time"></span>BDConf - Washington, DC</p>
          </div>
        </article>
        <hr>

        <article class="event">
          <div class="event-date">
            <p class="event-month">Oct</p>
            <p class="event-day">21</p>
          </div>
          <div class="event-desc">
            <h4 class="event-desc-header">Day in the Life of Foundation for Apps</h4>
            <p class="event-desc-detail"><span class="event-desc-time"></span>BDConf - Washington, DC</p>
          </div>
        </article>
      </div>
    </div>
  </div>
</div>
</div>


<hr>
<p align="center">Copyright 2016</p>
<p align="center">
Author: Kaiyang Lv Hanwei Cheng Tong Zhang
</p>
    
<script src="https://code.jquery.com/jquery-2.1.4.min.js"></script>
<script src="http://dhbhdrzi4tiry.cloudfront.net/cdn/sites/foundation.js"></script>
<script>
      $(document).foundation();
    </script>

</body>
</html>
