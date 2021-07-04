<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>

<html>

<head>
	<title>Customer Confirmation Page</title>
</head>

<body>

	The Student is confirmed: ${customer.firstName} ${customer.lastName}  
	<br><br>
	
	Free Pass: ${customer.freePasses}
	
	Postal Code: ${customer.postalCode}
	
	Postal Code: ${customer.courseCode}
</body>

</html>