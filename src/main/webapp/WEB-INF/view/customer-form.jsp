<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html>

<head>
	<title>Customer Registration Form</title>
	<style>
		.error {color:red}
	</style>
	
</head>

<body>

	<form:form action="processForm" modelAttribute="customer"> 
	<%-- modelAttribute value should be same as in the controller theModel.addAttribute --%>
	
		First name: <form:input path="firstName" />
		<%--it will call the student.getFirstName() --%>
		<br><br>
	
		Last name(*): <form:input path="lastName" />
		<form:errors path="lastName" cssClass="error"/>
		<br><br>
		
		Free Pass(*): <form:input path="freePasses" />
		<form:errors path="freePasses" cssClass="error"/>
		<br><br>
		
		Postal Code(*): <form:input path="postalCode" />
		<form:errors path="postalCode" cssClass="error"/>
		<br><br>
		
		Course Code(*): <form:input path="courseCode" />
		<form:errors path="courseCode" cssClass="error"/>
		<br><br>
		
		
		<input type="submit" value="Submit" />
		<%-- on submit it calls the setter methods of the class --%>
		
	</form:form>


</body>

</html>