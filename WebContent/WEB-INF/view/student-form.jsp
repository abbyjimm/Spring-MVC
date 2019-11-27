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
		
		Favorite Language:
		
		Java <form:radiobutton path="favoriteLanguage" value="java"/>
		PHP  <form:radiobutton path="favoriteLanguage" value="php"/>
		Node.js <form:radiobutton path="favoriteLanguage" value="node.js"/>
		Python <form:radiobutton path="favoriteLanguage" value="python"/>
		
		<br><br>
		
		Operating Systems:
		MS Windows <form:checkbox path="operatingSystems" value="MS Windows" />
		Linux <form:checkbox path="operatingSystems" value="Linux" />
		Mac OS <form:checkbox path="operatingSystems" value="Mac OS" />
		
		<br><br>
		
		<input type="submit" value="Submit" />
	
	</form:form>
</body> 
</html>