<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
		<title>Hello</title>
</head>
<body>
		
	The Customer is confirmed:  ${customer.firstName} ${customer.lastName}
	
	<br><br>
	
	FreePasses: ${customer.freePasses}
	
	<br><br>
	
	PostalCode: ${customer.postalCode}
	
	<br><br>
	
	CourceCode: ${customer.courceCode}
	
	<br><br>
	
</body>

</html>
