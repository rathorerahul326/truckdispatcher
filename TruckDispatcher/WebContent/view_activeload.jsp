<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored="false" %>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="jquery-3.2.1.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<link rel="stylesheet"  href="css/elements.css" />
	<script >function check_empty(){
		if(document.getElementById('name').value == "" 
			|| document.getElementById('email').value == "" 
			||document.getElementById('msg').value == "" ){
			alert ("Fill All Fields !");
			}
				else {  
				document.getElementById('form').submit();  
				alert ("Form submitted successfully...");
				}
			}

			//function to display Popup
			function div_show(){ 
			    document.getElementById('abc').style.display = "block";

				var loadnumber=document.getElementById('loadnumberid').innerHTML;
				var grossaftercommission=document.getElementById('grossaftercommissionid').innerHTML;
				alert(loadnumber);
				alert(grossaftercommission);
				document.getElementById("loadnumberid1").value=loadnumber;
				document.getElementById("grossaftercommissionid1").value=grossaftercommission;
		
				

			}

			//function to check target element
			function check(e){ 
			var target = (e && e.target) || (event && event.srcElement); 

			var obj = document.getElementById('abc'); 
			var obj2 = document.getElementById('popup'); 

			checkParent(target)?obj.style.display='none':null; 
			target==obj2?obj.style.display='block':null; 

			} 

			//function to check parent node and return result accordingly
			function checkParent(t){ 
				while(t.parentNode){ 
					if(t==document.getElementById('abc'))
						{ 
							return false 
						}
					else if(t==document.getElementById('close'))
						{
							return true
						} 
					t=t.parentNode 
				} 
				return true 
			} 
</script>	
<script src="jquery-3.2.1.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script type="text/javascript">
function myFunction() {
	
    var loadnumber = $('#loadnumberid1').val();
        $.ajax({
            url:"add_remainingamount",
            async: false,
            data:{                  
                	LoadNumber:loadnumber
            },
            type:"POST",            
            dataType:"json",        
            success:function(data)
            {    
            	alert(data);
            		var html='';
            	
            	$.each(data, function(i,item) {
            		html+='<option value='+item.a+'>'+item.a+'</option>';
            		html+='<option value='+item.b+'>'+item.b+'</option>';
            		html+='<option value='+item.c+'>'+item.c+'</option>';
            		html+='<option value='+item.d+'>'+item.d+'</option>';
            	});
            	$('#ct').append(html);
            }
        });
    
}
</script>

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
<style type="text/css">
<style type="text/css">
	/*----------------------------------------------
css settings for HTML div exactCenter 
------------------------------------------------*/
@import url(http://fonts.googleapis.com/css?family=Raleway);

#abc{
width: 100%;
height: 100%;
opacity: 0.95;
top: 0;
left: 0;
display: none;
position: fixed;			
background-color: #313131;
overflow:auto;

}

img#close{
position: absolute;
right: -14px;
top: -14px;
cursor: pointer;
}

div#popupContact{
position: absolute; 
left: 50%;
top: 17%;
margin-left: -202px;
font-family: 'Raleway', sans-serif;
}

form{
max-width: 300px;
min-width: 250px;
padding: 10px 50px;
border: 2px solid gray;
border-radius: 10px;
font-family:raleway;
background-color: white;
}

p{
margin-top: 30px;
}

h2{
background-color: #FEFFED;
padding: 20px 35px;
margin: -10px -50px;
text-align:center;
border-radius: 10px 10px 0 0;
}

hr{
margin: 10px -50px;
border: 0; 
border-top: 1px solid #ccc;
}
 
input[type=text]{
width:82%;
padding: 10px;
margin-top: 30px;
border: 1px solid #ccc;
padding-left: 40px;
font-size: 16px;
font-family:raleway;
} 

#name{
background-image: url('../images/name.jpg');
background-repeat: no-repeat;
background-position: 5px 7px;
}

#email{
background-image: url('../images/email.png');
background-repeat: no-repeat;
background-position: 5px 7px;
}

textarea{
background-image: url('../images/msg.png');
background-repeat: no-repeat;
background-position: 5px 7px;
width:82%;
height: 95px;
padding: 10px;
resize:none;
margin-top: 30px;
border: 1px solid #ccc;
padding-left: 40px;
font-size: 16px;
font-family:raleway;
margin-bottom: 30px;
}

#submit{
text-decoration:none;
width:100%;
text-align:center;
display:block;
background-color:#FFBC00;
color: white;
border: 1px solid #FFCB00;
padding: 10px 0;
font-size:20px;
cursor:pointer;
border-radius: 5px;
}

span{
color:red;
font-weight:bold;
}

button{
width:10%;
height:45px;
border-radius:3px;
background-color: peru;
color:white;
font-family: 'Raleway', sans-serif;
font-size:18px;
cursor:pointer;
}

/*-----------------------------------------------------------------
css settings for right side advertisement
------------------------------------------------------------------*/
img#fugo{
margin-left: 70%;
}	</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body id="body" onclick="check(event)" style="overflow:hidden;">
<center>
	<table id="t01">
		
			<h2> Active Load</h2>
		
		<tr>
			
			<th>  LoadNumber   </th>
			<th>  TruckNumber   </th>
			<th>  Gross   </th>
			<th>  DispatcherCommission  </th>
			<th>  GrossAfterCommission  </th>
			<th>  AdvanceDeposit  </th>
			<th>  PickUpDate  </th>
			<th>  PickUpCity  </th>
			<th>  PickUpState  </th>
			<th>  Close Load  </th>
            <th>  Add Money  </th>
            
			
		</tr>

<c:forEach items="${loaddetaillist}" var="testDetails">
			<tr>
				<td id="loadnumberid">  ${testDetails.getLoadnumber()}  </td>
				<td id="trucknumberid">   ${testDetails.getTrucknumber()}    </td>
				<td>   ${testDetails.getGross()}     </td>
				<td>   ${testDetails.getDispatcher_Commission()}  </td>
				<td id="grossaftercommissionid">   ${testDetails.getGross_after_commission()}   </span></td>
				<td>   ${testDetails.getAdvancedeposit()}   </td>
				<td>   ${testDetails.getPickupdate()}  </td>
				<td>   ${testDetails.getPickupcity()}  </td>
				<td>    ${testDetails.getPickupstate()}    </td>
				<td id="close_load"><a href="close_load?truckid=${testDetails.getTrucknumber()}">Close Load</a></td>
				<td onclick ="div_show()" id="popup">Add Money</td>
				
			</tr>

		</c:forEach>
	</table>
	</center>
	 
 <div id="abc">
 
	 <!-- Popup div starts here -->
 <div id="popupContact"> 

	<!-- contact us form -->
		<form action="#" method="post" id="form" >
			<img src="images/3.png" id="close"/>
			<h2>Advance Form</h2><hr/>
	Load Number:<input type="text" name="loadnumber1" id="loadnumberid1" onclick="myFunction()" />
			 
    Gross After Commission:<input type="text" name="grossaftercommission1" id="grossaftercommissionid1" />
			
    Remaining Money:<input type="text" name="remainingmoney" id="remainingmoneyid" />
   			
			<a id="submit" href="javascript: check_empty()">Send</a>
			
			<p><span>Note :</span> In this demo, we have stopped email sending functionality.</p>
		</form>
 </div> 
 <!-- Popup div ends here -->
 </div>
	
</body>
</html>