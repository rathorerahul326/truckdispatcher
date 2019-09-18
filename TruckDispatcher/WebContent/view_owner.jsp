<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored="false" %>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
	<table>
		
			<h2> Score Card</h2>
		
		<tr>
			
			<td><span> Owner Name</span></td>
			<td><span> Dob</span></td>
			<td><span> SSN</span></td>
		
			
		</tr>

<c:forEach items="${ownerlist}" var="testDetails">
			<tr>
				<td><span> ${testDetails.getName()}</span></td>
				<td><span> ${testDetails.getDob() }</span></td>
				<td><span> ${testDetails.getSsn()}</span></td>
			</tr>

		</c:forEach>
	</table>
	</center>
</body>
</html>