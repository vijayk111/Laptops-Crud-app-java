<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Display Laptops</title>
<link rel="stylesheet" href="../css/style.css" />
</head>
<body>
<jsp:include page="../../partial/header.jsp" />

<div align="center">
        <table border="1" cellpadding="5">
            <caption>List of Laptops</caption>
            <tr>
                <th>Laptop_ID</th>
                <th>ModelNumber</th>
                <th>Brand</th>
                <th>Type</th>
                <th>Condition</th>
                <th>SSD</th>
                <th>Hard Disk</th>
                <th>Comment</th>
            </tr>
            <c:forEach var="laptop" items="${laptopslist}">
                <tr>
                    <td><c:out value="${laptop.laptop_id}" /></td>
                    <td><c:out value="${laptop.modelnumber}" /></td>
                    <td><c:out value="${laptop.laptop_brand}" /></td>
                    <td><c:out value="${laptop.laptop_type}" /></td>
                    <td><c:out value="${laptop.laptop_condition}" /></td>
                    <td><c:out value="${laptop.laptop_ssd}" /></td>
                    <td><c:out value="${laptop.laptop_harddisk}" /></td>
                    <td><c:out value="${laptop.laptop_comment}" /></td>
                    <td>
                    	<a href="${pageContext.request.contextPath}/laptops/list?id=${laptop.laptop_id}">Edit</a>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </div>	

</body>
</html>