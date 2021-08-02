<?php
include 'functions.php';
// Your PHP code here.

// Home Page template below.
?>

<?=template_header('Home')?>

<!DOCTYPE html>
<html>
<head>
  <title></title>
   <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css">
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
	<br>
  <h2>Pokemon Image</h2>
  <hr/>
  <div class="card" style="width:400px">
    <img class="card-img-top" src="img_avatar.png" alt="Card image" style="width:100%">
    <div class="card-body">
      <h4 class="card-title">Steven</h4>
      <p class="card-text">Steven adalah seorang Web Developer & Android Developer</p>
      <a href="#" class="btn btn-primary">Detail Info</a>
    </div>
  </div>
  <br>
</div>
</body>
</html>
<?=template_footer()?>