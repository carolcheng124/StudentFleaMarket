<div class="top-bar">
  <div class="row">
    <div class="top-bar-left">
       <ul class="dropdown menu" data-dropdown-menu>
       <li class="menu-text" style="font-size:30px; font-weight:800; color: #666">Student Flea Market</li>
       </ul>
        <br>
        <ul class="dropdown menu" data-dropdown-menu>
          <li><a href="<%= request.getContextPath() %>/Main.jsp">Main</a></li>
          <li class="has-submenu">
              <a>Product</a>
                <ul class="submenu menu vertical" data-submenu>
                   <li>
                     <a href="<s:url action="showproductbycategory">
                       <s:param name="product.product_kind">Furniture</s:param>
                       </s:url>">Furniture
                     </a>
                   </li>
                    <li>
                     <a href="<s:url action="showproductbycategory">
                        <s:param name="product.product_kind">Books</s:param>
                       </s:url>">Books
                     </a>
                   </li>
                   <li>
                     <a href="<s:url action="showproductbycategory">
                        <s:param name="product.product_kind">Electronics</s:param>
                       </s:url>">Electronics
                     </a>
                   </li>
                   <li>
                     <a href="<s:url action="showproductbycategory">
                       <s:param name="product.product_kind">Appliances</s:param>
                       </s:url>">Appliances
                     </a>
                   </li>
                   <li>
                     <a href="<s:url action="showproductbycategory">
                       <s:param name="product.product_kind">Clothing, shoes & Jewelry</s:param>
                       </s:url>">Clothing, shoes & Jewelry
                     </a>
                   </li>
                   <li>
                     <a href="<s:url action="showproductbycategory">
                       <s:param name="product.product_kind">Video Games</s:param>
                       </s:url>">Video Games
                     </a>
                   </li>
                   <li>
                     <a href="<s:url action="showproductbycategory">
                       <s:param name="product.product_kind">Other</s:param>
                       </s:url>">Other
                     </a>
                   </li>
               
                </ul>
          </li>
          <li><a href="<%= request.getContextPath() %>/Sellitem.jsp">Sell items</a></li>
          <li><a href="#">Exploration</a></li>          
          <li><a href="<%= request.getContextPath() %>/about.jsp">About us</a></li>
       </ul>
    </div>

  <div class="top-bar-right">
  <% 
  	User user = (User)session.getAttribute("user");
  	if (user == null) {
  		//if user tries to bypass authorization check, it will redirect to the login page
	   	//response.sendRedirect(request.getContextPath() + "/login.jsp"); 
  %>
    <button class="button" type="submit">Sign in</button>
  <%
  	} else {
  		out.print("<a>" + user.getName() + "</a>");
  		out.print("&nbsp;&nbsp;|&nbsp;&nbsp;");
  		out.print("<a href='shoppingcart.jsp'>Shopping Cart</a>");
  	//out.print("<a href= '" + request.getContextPath() + "/Purchaselist.jsp'>Purchase List</a >");
  		out.print("&nbsp;&nbsp;|&nbsp;&nbsp;");
  		out.print("<a>Selling List</a>");
  		out.print("&nbsp;&nbsp;|&nbsp;&nbsp;");
  		out.print("<a href=\"" + request.getContextPath() + "/logout.jsp\">Log out</a>");
  	//out.print("<a href= '" + request.getContextPath() + "/Selllist.jsp'>Selling List</a >");
  	}
  %>
    <br>
    <br>
    <ul class="menu">
      <li><input type="search" placeholder="Search"></li>
      <li><button type="button" class="button">Search</button></li>
    </ul>
  </div>
  </div>
</div>