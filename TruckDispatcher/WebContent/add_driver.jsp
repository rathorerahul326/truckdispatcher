<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ page isELIgnored="false" %>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script src="jquery-3.2.1.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script type="text/javascript">
$(document).ready(function(){
	var ownerssn;
	$("#ownerssn").change(function(){
		alert("Event called");
		//alert($(this).find(':selected').val());
		$("#trucknumber").find("option").remove();
		//$("#tid ").find("option").remove();
    	ownerssn=$(this).find(':selected').val();
   		// alert($(this).find(':selected').text());//this will give the selected option's text
    	trucknumber(ownerssn);
    	//alert(topicID);
	});
	var trucknumber=function(ownerssn){
			$.post("addtruck_indriver",{'OwnerSsn' : ownerssn},function(data, textStatus){		
		                var json=JSON.parse(data);
		                alert(json);
		                alert("Event called");
		                var html='<option value="" disabled selected hidden>Please Choose...</option>';
		                $.each(json,function(i,item){
		                	html+='<option value='+item.trucknumber+'>'+item.trucknumber+'</option> ';
		                		//$('#SubTopicSelect').append($('<option>').text(item.Subtopic).attr('value',item.stid));
		                });
		                $('#trucknumber').append(html);
		  	});
		}
});
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
<form action="add_driver" method="post">
<div>
<div class="container">
<h1><b> Add Driver Details </b></h1>
<input type="text" name= "drivername" id="nm" placeholder="Driver Name"required><span id="spnm"></span><br>
<input type="text" name="driverssn" id="mn" placeholder="Driver SSN"required><span id="spmn"></span><br>
<input type="date" name="driverdob" id="mn" placeholder="Driver DOB"required><span id="spmn"></span><br>
<input type="date" name="licenceexpiration" id="mn" placeholder="Driver License Expiration"required><span id="spmn"></span><br>
<input type="date" name="medicalexpiration" id="mn" placeholder="Driver Medical Card Expiration"required><span id="spmn"></span><br>
<input type="date" name="drugtestexpiration" id="mn" placeholder="Drug Test Expiration Date"required><span id="spmn"></span><br>
OwnerAdded:<select name="ownerssn" id="ownerssn" style="width: 120px; margin: 1%;" >
			<c:forEach  var="index"   items="${OwnerName}">
  				<option value="${index.getSsn()}" >${index.getName()} ${index.getSsn()}</option>
  			</c:forEach>
  			</select><br>
Current Assigned Truck:<select name="trucknumber" id="trucknumber" style="width: 120px; margin: 1%;" >
		
<input type="submit" value="submit">

</div>
</div>
</form>
</body>
</html>
