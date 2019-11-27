<!-- reference to taglib -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
	<title> Student form </title>
</head>

<body>
	<form:form action="processStudent" modelAttribute="student">
	
		First name: <form:input path="firstName"/>
		
		<br><br>
		
		Last name: <form:input path="lastName"/>
		
		<br><br>
		
		<form:select path="country">
		
			<form:options items="${ countryOptions }"/>
			
		</form:select>
		
		<br><br>
		
		<input type="submit" value="Submit" />
	
	</form:form>
</body> 
</html>