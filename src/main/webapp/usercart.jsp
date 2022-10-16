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


<h1 style="font-weight: bold;font-size: 25px; margin:20px">Order By  Customer</h1> 

    <table style="width:100%">
   
        <tr> 
            <th>Order ID</th> 
            <th>CustomerName</th> 
            <th>ItemName</th> 
            <th>QTY & Price</th> 
            <th> Customer Id</th>
            <th> Item Id</th>
            
             
        </tr> 
         <tbody>
		<c:forEach items="${orderlist}" var="i">
			<tr>
				<td>${i.order_id}</td>
				<td>${i.cus_name}</td>
				<td>${i.item_name}</td>
				<td>${i.price} * ${i.qty} = ${i.price * i.qty}</td>
				
				<td>${i.customer.cus_Id}</td>
				<td>${i.item.item_id}</td>
				
			</tr>
				
				
				

		</c:forEach>
		</tbody>
        
    </table>   

</body>
</html>