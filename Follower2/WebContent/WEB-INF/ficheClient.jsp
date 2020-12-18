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

<%@ include file= "/menu.jsp" %> 

<br>
<br>

<% 
Client client= (Client) session.getAttribute("client");
%>

<h1>Information Client</h1>
<ul>

<li>Nom : <%=client.getNom()%>  avec expression langage: ${!empty client.nom ? client.nom :'' }
<li>Prenom : <%=client.getPrenom()%>
<li>Adresse : <%=client.getAdresse()%>
<li>Email : <%=client.getMail()%>
<li>Email : <%=client.getMail()%>
<li>Email : <%=client.getMail()%>
</ul>




</body>
</html>