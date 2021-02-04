<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page import="src.com.np.domaine.Client" %>
     <%@ page import="src.com.np.rapport.ClientRapport" %>
       <%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" import="java.io.*,java.util.List,java.util.ArrayList"%>
<!DOCTYPE html>



<html>
<head>
<meta charset="ISO-8859-1">
<!--  BOOTSTRAP -->

<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="bootstrap/js/bootstrap.min.js"></script>

<script src="js/jquery.js"></script>
<script src="js/bootstrap.js"></script>

<title>Affichage Liste des Clients</title>
</head>

<body>

<%@ include file= "/menu.jsp" %> 

<br>
<br>
<% 
Client client= (Client) session.getAttribute("client");
%>


<%  ArrayList<Client> maliste = ( ArrayList<Client>) session.getAttribute("RapportClient"); %>

<h1>Information Client</h1>
<ul>
<li>client1: <%=maliste.get(0) %>

<li>client2: <%=maliste.get(1) %>
<li>client3: <%=maliste.get(2) %>



</ul>




</body>
</html>