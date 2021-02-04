<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page import="src.com.np.domaine.Client" %>
<!DOCTYPE html>



<html>
<head>
<meta charset="ISO-8859-1">
<!--  BOOTSTRAP -->

<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="bootstrap/js/bootstrap.min.js"></script>

<script src="js/jquery.js"></script>
<script src="js/bootstrap.js"></script>

<title>AffichageNomClient</title>
</head>

<body>
<br>
<br>
quel programme souhaiter vous éditer ?




<% 
Client client= (Client) session.getAttribute("client");



%>

<h1>TO DO get the date with  JavaScript</h1>

<button type="button"
onclick="document.getElementById('demo').innerHTML = Date()">
Click me to display Date and Time.</button>






<div class="container-fluid">
<div class="fixed-bottom">
<p><a href="acceuil.jsp">retour a l'acceuil</a></p>
</div>
</div>





</body>
</html>