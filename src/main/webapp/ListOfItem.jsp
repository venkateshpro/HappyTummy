<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<html>
<head>
 	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">  
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
        .he{
            font-size: 30px;
            font-weight: 600;
            margin: 20px;
        }
</style>
</head>
<body>   

 <div class="d-flex flex-row justify-content-between">
        <h1 class="he">Available Items</h1>
        <a href="index.jsp"><h1 class="he">Logout</h1></a>
    </div>
    <table style="width:100%">
   
        <tr> 
            <th>ItemId</th> 
            <th>Price</th> 
            <th>ItemName</th> 
            <th>Description</th> 
             
        </tr> 
         <tbody>
		<c:forEach items="${itemlist}" var="i">
			<tr>
				<td>${i.item_id}</td>
				<td>${i.price}</td>
				<td>${i.item_name}</td>
				<td>${i.description}</td>
			
			
				

		</c:forEach>
		</tbody>
        
    </table>   
</body>
</html>