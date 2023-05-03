<?php 
// Question 5a
setcookie("user", "u10cs1001", time() + (60 * 60));
// var_dump($_COOKIE);
?>

<?php
// Question 5b
session_start();
session_destroy();
header("Location: /login.php");
exit();
?>
