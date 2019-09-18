<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored="false" %>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>table {
    width:100%;
}
table, th, td {
    border: 1px solid black;
    border-collapse: collapse;
}
th, td {
    padding: 15px;
    text-align: left;
}
table#t01 tr:nth-child(even) {
    background-color: #eee;
}
table#t01 tr:nth-child(odd) {
   background-color: #fff;
}
table#t01 th {
    background-color: black;
    color: white;
}</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
	<table id="t01">
		
			<h2> Load View</h2>
		
		<tr>
			
			<th><span>  Name  </span>     </th>
			<th><span>  DOB   </span></th>
			<th><span>  SSN   </span></th>
			<th><span>  lic_exp  </span></th>
			<th><span>  Med_exp  </span></th>
			<th><span>  Drug_exp_Date  </span></th>
			<th><span>  Assigned_Truck  </span></th>
			<th><span>  Truck Owner  </span></th>

    
			
		</tr>

<c:forEach items="${driverdetaillist}" var="testDetails">
			<tr>
				<td><span>   ${testDetails.getDrivername()}   </span></td>
				<td><span>   ${testDetails.getDriverdob()}    </span></td>
				<td><span>   ${testDetails.getDriverssn()}     </span></td>
				<td><span>   ${testDetails.getLicenceexpiration()}  </span></td>
				<td><span>   ${testDetails.getMedicalexpiration()}   </span></td>
				<td><span>   ${testDetails.getDrugtestexpiration()}  </span></td>
				<td><span>   ${testDetails.getTrucknumber_assigned()}  </span></td>
				<td><span>    ${testDetails.getOwnername()}    </span></td>
			</tr>

		</c:forEach>
	</table>
	</center>
</body>
</html>