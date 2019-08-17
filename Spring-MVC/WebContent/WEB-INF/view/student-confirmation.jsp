<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
		<title>Hello</title>
</head>
<body>
		
	Hello There!! ${student.firstName} ${student.lastName}
	
	<br><br>
	
	Country: ${student.country}
	
	<br><br>
	
	Favourite Language: ${student.favLang}
	
	<br><br>
	
	Operating System:
	
	<ul>
		<c:forEach var="temp" items="${student.os}" >
		<li> ${temp} </li>
		</c:forEach>
	</ul>
</body>

</html>