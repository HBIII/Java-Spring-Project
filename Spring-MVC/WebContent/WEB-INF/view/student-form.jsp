<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
		<title>Hello World</title>
</head>
<body>

	<form:form action="processForm" modelAttribute="student">
	
	FirstName: <form:input path="firstName"/>
	
	<br><br>
	
	LastName: <form:input path="lastName"/>
	
	<br><br>
	
	Country: 
	<form:select path="country">
		<form:options items="${student.countryOptions}"/>
	
	</form:select>
	
	<br><br>
	
	Favourite Language: 
	Java<form:radiobutton path="favLang" value="Java"/>
	Python<form:radiobutton path="favLang" value="Python"/>
	C++<form:radiobutton path="favLang" value="C++"/>
	Ruby<form:radiobutton path="favLang" value="Ruby"/>
	
	<br><br>
	
	Operating Systems:
	
	Linux<form:checkbox path="os" value="Linux"/>
	Windows<form:checkbox path="os" value="Windows"/>
	Mac<form:checkbox path="os" value="Mac"/>
	
	<br><br>
	
	<input type="submit"/>
	
	</form:form>


</body>

</html>