<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ page isELIgnored="false" %>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script>
function addt()
{
	
	var x=document.getElementById('commissionid').value;
	var y=document.getElementById('grossid1').value;
	var z=document.getElementById('grossid2').value;
	var m=document.getElementById('quickfeeid').value;

	z= y-(x*y)/100;
	m=(y*2)/100;
	document.getElementById("grossid2").value=z;
	document.getElementById("quickfeeid").value=m;


}
</script>
<style type="text/css">

input[type=text], select, textarea {
    width: 50%; /* Full width */
    padding: 12px; /* Some padding */  
    border: 1px solid #ccc; /* Gray border */
    border-radius: 4px; /* Rounded borders */
    box-sizing: border-box; /* Make sure that padding and width stays in place */
    margin-top: 6px; /* Add a top margin */
    margin-bottom: 16px; /* Bottom margin */
    resize: vertical /* Allow the user to vertically resize the textarea (not horizontally) */
}
input[type=email], select, textarea {
    width: 50%; /* Full width */
    padding: 12px; /* Some padding */  
    border: 1px solid #ccc; /* Gray border */
    border-radius: 4px; /* Rounded borders */
    box-sizing: border-box; /* Make sure that padding and width stays in place */
    margin-top: 6px; /* Add a top margin */
    margin-bottom: 16px; /* Bottom margin */
    resize: vertical /* Allow the user to vertically resize the textarea (not horizontally) */
}

input[type=password], select, textarea {
    width: 50%; /* Full width */
    padding: 12px; /* Some padding */  
    border: 1px solid #ccc; /* Gray border */
    border-radius: 4px; /* Rounded borders */
    box-sizing: border-box; /* Make sure that padding and width stays in place */
    margin-top: 6px; /* Add a top margin */
    margin-bottom: 16px; /* Bottom margin */
    resize: vertical /* Allow the user to vertically resize the textarea (not horizontally) */
}
input[type=file], select, textarea {
    width: 50%; /* Full width */
    padding: 12px; /* Some padding */  
    border: 1px solid #ccc; /* Gray border */
    border-radius: 4px; /* Rounded borders */
    box-sizing: border-box; /* Make sure that padding and width stays in place */
    margin-top: 6px; /* Add a top margin */
    margin-bottom: 16px; /* Bottom margin */
    resize: vertical /* Allow the user to vertically resize the textarea (not horizontally) */
}


/* Style the submit button with a specific background color etc */
input[type=submit] {
    background-color: #4CAF50;
    color: white;
    padding: 12px 20px;
    border: none;
    border-radius: 4px;
    cursor: pointer;
}

/* When moving the mouse over the submit button, add a darker green color */
input[type=submit]:hover {
    background-color: #45a049;
}

.container{
 padding: 20px;

}

</style>

</head>
<body>
<%@include file="header.jsp" %>
<form action="add_load" method="post">

<div>
<div class="container">
<h1><b>Add Load</b></h1>
Load Number<input type="text" name= "loadnumber" id="loadid" required><span id="spnm"></span><br>
Truck Number:<select name="trucknumber" id="trucknumber" style="width: 120px; margin: 1%;" >
			<c:forEach  var="index"   items="${truckdetaillist}">
  				<option value="${index.getTrucknumber()}" >${index.getTrucknumber()}</option>
  			</c:forEach>
  			</select><br>
Gross:<input type="text" name= "gross" id="grossid1" required><span id="spnm"></span><br>
Dispatcher Commission %:<input type="text" name= "dispatcher_Commission" id="commissionid" required><span id="spnm"></span><br>


Gross After Commission:<input type="text" onclick="addt()" name= "gross_after_commission" id="grossid2" required><span id="spnm"></span><br>
Pick Up Date:<input type="date" name="pick_up_date" id="pickupdateid" required><span id="spmn"></span><br>
Pickup State<input type="text" name="pick_up_state" id="pickupstateid" required><span id="spmn"></span><br>
Pickup City:<input type="text" name="pick_up_city" id="pickupcityid" required><span id="sp"></span><br>
Drop Off Date:<input type="date" name="drop_off_date" id="dropoffdateid" required><span id="spmn"></span><br>
Drop off state: <input type="text" name="drop_off_state" id="dropoffstateid" required><span id="spmn"></span><br>
Drop Off city:<input type="text" name="drop_off_city" id="dropoffcityid" required><span id="spmn"></span><br>
Quick Fee:<input type="text" name="quickfee" id="quickfeeid" required><span id="spmn"></span><br>
Advance Deposit:<input type="text" name= "advancedeposit" id="advancedepositid" required><span id="spnm"></span><br>
<input type="submit" value="Submit">

</div>
</div>
</form>
</body>
</html>