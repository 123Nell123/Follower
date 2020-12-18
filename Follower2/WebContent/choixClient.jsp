<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

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

<%@ include file= "menu.jsp" %> 
<br>
<br>
rentrez le nom du client souhaité 
(ToDebug un client existant est MBIANDOU Douglas)
  <form action="MaServletClient"  method="post">
           <p>Nom : <input type="text" name="nom" placeholder="MBIANDOU"/></p>
            <p>Prenom : <input type="text" name="prenom" placeholder="Douglas"/></p>
           <p><input type="submit"  value="valider" /></p>
        </form>





</body>
</html>