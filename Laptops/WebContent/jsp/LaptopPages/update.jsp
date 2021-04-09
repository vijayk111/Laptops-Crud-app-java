<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update Laptop</title>
<link rel="stylesheet" href="../css/style.css" />
</head>
<body>
<jsp:include page="../../partial/header.jsp" />

<script>
function validateform(){
	var mnumber= document.addLaptop.modelnumber.value;
	var brand= doucument.addLaptop.laptop_brand.value;	
}
</script>	
<br><br>
<form name="addLaptop" action="${pageContext.request.contextPath}/laptops" method="post" onSubmit="return validateform()">
 
<fieldset>
	<legend>update laptop</legend>
	<br><br>
	
	ModelNumber:<input type="text" id="modelnumber" name="modelnumber"/><br><br>
	Brand:<input type="text" id="laptop_brand" name="laptop_brand"/><br><br>
	
	Condition: <input type="radio" id="New" name="laptop_condition" value="New" ${laptop.laptop_condition == 'New' ? 'checked' : ''}>
	<label for="New">New</label>
	<input type="radio" id="PreOwned" name="laptop_condition" value="PreOwned" ${laptop.laptop_condition == 'PreOwned' ? 'checked' : ''}>
	<label for="PreOwned">PreOwned</label><br><br>
	
	<label for="laptop_type">Choose Laptop Type:</label>
    <select id="laptop_type" name="laptop_type">
      <option value="Notebook" ${laptop.laptop_type == 'Notebook' ? 'selected' : ''}>Notebook</option>
      <option value="Gaming" ${laptop.laptop_type == 'Gaming' ? 'selected' : ''}>Gaming</option>
      <option value="Hybrid" ${laptop.laptop_type == 'Hybrid' ? 'selected' : ''}>Hybrid</option>
      <option value="WorkStation" ${laptop.laptop_type == 'WorkStation' ? 'selected' : ''}>WorkStation</option>
      <option value="Others" ${laptop.laptop_type == 'Others' ? 'selected' : ''}>Others</option>
    </select><br><br>
    
    Storage Capacity: Default is 500gb Hard disk.<br>
    <input type="checkbox" id="laptop_ssd" name="laptop_ssd" value="120" ${laptop.laptop_ssd == '120' ? 'checked' : '' }/>
    <label for="laptop_ssd"> 120gb Ssd</label>
    <input type="checkbox" id="laptop_harddisk" name="laptop_harddisk" value="1024" ${laptop.laptop_harddisk == '1024' ? 'checked' : '' }/>
    <label for="laptop_harddisk"> 1TB Hard Disk</label><br><br>
    
    <label for="laptop_comment"> Comment for additional Configuration:</label><br>
    <textarea id="laptop_comment" name="laptop_comment" rows="5" cols="50"></textarea>
    <br><br><br>
    <input type="hidden" name="laptop_id" value="${laptop.laptop_id }"/><br>
    <input type="hidden" name="action" value="update"/>
    <input type="submit" value="Update"/>
    <br><br>
</fieldset>

</form>
	
</body>
</html>