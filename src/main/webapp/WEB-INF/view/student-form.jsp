<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html>

<head>
	<title>Student Registration Form</title>
</head>

<body>

	<form:form action="processForm" modelAttribute="student"> 
	<%-- modelAttribute value should be same as in the controller theModel.addAttribute --%>
	
		First name: <form:input path="firstName" />
		<%--it will call the student.getFirstName() --%>
		<br><br>
	
		Last name: <form:input path="lastName" />
		
		<br><br>
		Country:
		<form:select path="country">
		<%-- commented for hard coded countries
			<form:option value="India" label="India"/>
			<form:option value="France" label="France"/>
			<form:option value="Germany" label="Germany"/>
			<form:option value="USA" label="USA"/> --%>
			
			<form:options items="${student.countryOptions}"/>
		</form:select>
		<br><br>
		<%-- 
		Favorite Language:
		
		Java <form:radiobutton path="favouriteLanguage" value= "Java"/>
		Python <form:radiobutton path="favouriteLanguage" value="Python"/>
		Perl <form:radiobutton path="favouriteLanguage" value= "Perl"/>
		C# <form:radiobutton path="favouriteLanguage" value= "C#"/>
		--%>
		
		<form:radiobuttons path="favouriteLanguage"
			items="${student.favouriteLanguageOptions}"/>
			
		<br><br>
		Operating Systems:
		Linux <form:checkbox path="operatingSystems" value="Linux"/>
		Macintosh <form:checkbox path="operatingSystems" value="Mac Os"/>
		Windows <form:checkbox path="operatingSystems" value="Windows"/>
			
		
		<br><br>
	
		<input type="submit" value="Submit" />
		<%-- on submit it calls the setter methods of the class --%>
		
	</form:form>


</body>

</html>