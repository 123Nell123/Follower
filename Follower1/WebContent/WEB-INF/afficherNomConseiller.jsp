<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>



<html>
<head>
<meta charset="ISO-8859-1">
<title>AffichageNomClient</title>
</head>

<body>

  <form action="/presentation/Controler"  method="post">
           <p>Nom : <input type="text" name="nom" /></p>
           <p>Prénom : <input type="text" name="prenom" /></p>
           <p><input type="submit"  value="valider" /></p>
        </form>


</body>
</html>