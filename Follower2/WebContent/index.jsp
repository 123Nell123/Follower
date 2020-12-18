<!DOCTYPE html>
<html>


<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" media="screen" type="text/css" href="styleAcceuil.css"/>


<!--  BOOTSTRAP -->

<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="bootstrap/js/bootstrap.min.js"></script>

<script src="js/jquery.js"></script>
<script src="js/bootstrap.js"></script>


<title>Interface Odysseal </title>

</head>



<body >
<!--  commentaire -->

<div class="container-fluid">
<h1 ><b> BIENVENU SUR VOTRE INTERFACE </b></h1>

<blockquote>
<p>interface de gestion </p>
</blockquote>
</div>

<div class="container-fluid">
<h2>...</h2>


<form method="POST" action="MaServlet">


   <div class="form-group">
      <label for="login">Login:</label>
        <div class="col-sm-3">  
      <input type="text" class="form-control" id="login" name="login" placeholder="Alex">
         </div>
    </div>
    
       
        
    <div class="form-group">
      <label for="password">Password:</label>
          <div class="col-sm-3">  
      <input type="text" class="form-control" id="password" name="password" placeholder="Alex">
        </div>
    </div>


 <div class="form-group">

 <div class="col-sm-offset-2 col-sm-10">
        <button type="submit" class="btn btn-primary">se connecter</button>
        
      </div>





   </div>
</form>




</div>

<div class="container-fluid">
<div class="fixed-bottom">
<footer>
<img src="Odysseal.jpg" alt="logo" width="200" height="100">
<a href="https://www.odysseal.com/">Le groupe Odysseal</a>
</footer>
</div>
</div>
</body>
</html>