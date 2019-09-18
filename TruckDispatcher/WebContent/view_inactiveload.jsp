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
		
			<h2> Close Load</h2>
		
		<tr>
			
			<th><span>  LoadNumber   </span>     </th>
			<th><span>  TruckNumber   </span></th>
			<th><span>  Gross   </span></th>
			<th><span>  DispatcherCommission  </span></th>
			<th><span>  GrossAfterCommission  </span></th>
			<th><span>  PickUpDate  </span></th>
			<th><span>  PickUpCity  </span></th>
			<th><span>  PickUpState  </span></th>
			<th><span>  DropOffDate  </span></th>
			<th><span>  DropOffCity  </span></th>
			<th><span>  DropOffState  </span></th>
			<th><span>  Close Load  </span></th>
			</tr>
	

<c:forEach items="${loaddetaillist}" var="testDetails">
			<tr>
				<td><span>    ${testDetails.getLoadnumber()}   </span></td>
				<td><span>    ${testDetails.getTrucknumber()}    </span></td>
				<td><span>    ${testDetails.getGross()}     </span></td>
				<td><span>    ${testDetails.getDispatcher_Commission()}  </span></td>
				<td><span>    ${testDetails.getGross_after_commission()}   </span></td>
				<td><span>    ${testDetails.getPickupdate()}  </span></td>
				<td><span>    ${testDetails.getPickupcity()}  </span></td>
				<td><span>    ${testDetails.getDropoffdate()}    </span></td>
				<td><span>    ${testDetails.getDropoffcity()}    </span></td>
				<td><span>    ${testDetails.getDropoffstate()}    </span></td>
				<td><span>    ${testDetails.getQuickfee()}    </span></td>
				
				</tr>

		</c:forEach>
	</table>
	</center>
</body>
</html>