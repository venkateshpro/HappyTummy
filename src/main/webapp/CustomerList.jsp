<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
            <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
  table, th, td { 
            border: 2px solid black; 
            border-collapse: collapse; 
        } 
          
        th, td { 
            padding: 20px; 
        } 
          
        th { 
            text-align: left; 
        } 
</style>
</head>
<body>


<h1 style="font-weight: bold;font-size: 25px; margin:20px">List of Customer</h1> 

    <table style="width:100%">
   
        <tr> 
            <th>Customer Id</th> 
            <th>Customer Email</th> 
            <th>Customer Name</th> 
            <th>Customer Phone</th> 
            <th> Customer Password</th>
            
             
        </tr> 
         <tbody>
		<c:forEach items="${cuslist}" var="i">
			<tr>
				<td>${i.cus_Id}</td>
				<td>${i.cus_email}</td>
				<td>${i.cus_name}</td>
				<td>${i.cus_phone}</td>
				<td>${i.cus_psw}</td>
				
			</tr>
				
				
				

		</c:forEach>
		</tbody>
        
    </table>   

</body>
</html>