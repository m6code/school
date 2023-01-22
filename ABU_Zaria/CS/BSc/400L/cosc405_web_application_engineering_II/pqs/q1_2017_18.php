<?php
// Question 1a
	$a = 2;
	$b = 3.0;
	$c = 5;
	echo (($c--===$b) || ($a++>$b*$b)); // False
	var_dump(($c--==$b) || ($a++ > $b*$b)); // bool(False)


// Question 1b
 $aa = 35;
 for($i=0; $i<=$aa; $i++){
	if($i % 8 == 0)
		echo $i. "<br> \n"; // will echo 0, 8, 16, 24, 32 
 }

// Question 1c - Datatypes in PHP
// Integer
// Float (double)
// Boolean
// String
// Array
// Object
// Resource
// Null


// Question 1e
 	function myFunc($a, $b, $c, $d = array(401, 403, 405, 407, 409, 411, 415)) {
		define("MYCONS", time());
		echo date("Y-m-d", MYCONS);
	}

	$j = 1;
	myFunc($j, $j + 1, $j + 2); 
	// Ans: 2023-01-22 (current yyyy-mm-dd)
?>
