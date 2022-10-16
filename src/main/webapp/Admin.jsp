<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
        .he{
            font-size: 30px;
            font-weight: 600;
            margin: 20px;
        }
        .button{
        	width

        }
        .btnn{
		    height: 50px;
		    width: 10rem;
		    margin-bottom: 20px;

		}
    </style>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">  
</head>
<body>
 <div class="d-flex flex-row justify-content-between">
        <h1 class="he">Welcome to Admin Operations</h1>
        <a href="/"><h1 class="he">Logout</h1></a>
    </div>
    <div class="d-flex flex-row justify-content-center">
        <div class=" d-flex flex-column justify-content-center mt-4 ">
            <a href="AddUser.jsp"><button class=" btnn btn btn-info m-2">Add Customer</button></a>
            <a href="addItems.jsp"><button class=" btnn btn btn-info  m-2">Add Items</button></a>
            <a href="/listoforders"><button class="btnn btn btn-info  m-2">Show List Of Orders</button></a>
            <a href="/getlistofcustomers"><button class=" btnn btn btn-info  m-2">Show list Of Customers</button></a>
            <a href="/listof_items"><button class=" btnn btn btn-info  m-2">Show List Of Items</button></a>
            
        </div>
    </div>
</body>
</html>