<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<style>
ul {
  list-style-type: none;
  margin: 0;
  padding: 0;
  overflow: hidden;
  background-color: #333;
}

li {
  float: left;
  color: white;
}

li a {
  display: block;
  color: white;
  text-align: center;
  padding: 18px 30px;
  text-decoration: none;
}

li a:hover:not(.active) {
  background-color: #111;
}

.active {
  background-color: #4CAF50;
}

select {
	margin-top: 12px;
    text-align: center;
    padding: 5px 10px;
    text-decoration: none;
}

li input {
  margin-top: 12px;
  margin-left: 15px;
  text-align: center;
  padding: 5px 10px;
  text-decoration: none;
}
</style>
</head>
<body>

<form name="searchLaptop" action="${pageContext.request.contextPath}/laptops/list" onsubmit="" method="get">

	<ul>
	  <li><a class="active" href="${pageContext.request.contextPath}/jsp/LaptopPages/addLaptop.jsp">Add Laptop</a></li>
	  <li><a href="${pageContext.request.contextPath}/laptops/list">Display Laptops</a></li>
	  <li>
	  	  Search Type:
    	  <select id="search_type" name="search_type">
      			<option value="modelnumber">modelnumber</option>
      			<option value="laptop type">laptop type</option>
      	  </select>
      </li>
	  <li><input type="text" name="searchString" id="searchString"></li>
	  <li><input type="submit" value="Search"></li>
	</ul>
	
</form>

</body>
</html>