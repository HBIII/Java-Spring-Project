<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
		<title>Customer Registration</title>
		<style>
			.error
			{color:red}
		</style>
</head>
<body>
<i>Fill out the form. Asterisk (*) means required field.</i>
<br><br>
	<form:form action="processForm" modelAttribute="customer">
		
		FirstName: <form:input path="firstName"/>
		
		<br><br>
		
		LastName: (*) <form:input path="lastName"/>
		<form:errors path="lastName" cssClass="error"></form:errors>
		
		<br><br>
		
		FreePasses: <form:input path="freePasses"/>
		<form:errors path="freePasses" cssClass="error"></form:errors>
		
		<br><br>
		
		PostalCode: <form:input path="postalCode"/>
		<form:errors path="postalCode" cssClass="error"></form:errors>
		
		<br><br>
		
		CourceCode: <form:input path="courceCode"/>
		<form:errors path="courceCode" cssClass="error"></form:errors>
		
		<br><br>
		
		<input type="submit" value="submit"/>
	</form:form>

</body>

</html>