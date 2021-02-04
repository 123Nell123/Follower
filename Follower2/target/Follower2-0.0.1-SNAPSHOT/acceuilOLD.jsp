<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head >
<meta charset="ISO-8859-1">

<!--  BOOTSTRAP local CSS -->

<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
<link rel="stylesheet" media="screen" type="text/css" href="style.css"/>

<!--  BOOTSTRAP en URL CSS -->
 <!-- <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css"> -->
  
  
  
  <script type="text/javascript" src="bootstrap/js/bootstrap.min.js"></script>
  



<title>Page d'acceuil</title>
<script src="js/jquery.js"></script>
<script src="js/bootstrap.js"></script>
</head>



<body >

<br>

<div class="container">
<div class="row">
<h2> Que voulez vous faire maintenant ? </h2>

</div>
</div>


<br>
<br>
<br>

<div class="container">

  <div class="row">
 <div class="col-sm-4">
<p>a) aller sur la fiche d'un client  </p>

   </div>
    <div class="col-sm-4">
 <p>  b) aller sur un programme en cours    </p>
 </div>
 
  <div class="col-sm-4">
<p> c) éditer un rapport  </p>
  </div>
  </div>
   </div>
   
  <form action="MaServletTraitement"  method="post">
           <p>Votre Choix : <input type="text" name="choix" placeholder="a" /></p>
           <p><input type="submit"  value="valider" /></p>
        </form>




<p><a href="menu.jsp">page menu</a></p>




<div class="fixed-bottom">
    <%@ include file="menu.jsp" %>
  </div>
 

</body>
</html>