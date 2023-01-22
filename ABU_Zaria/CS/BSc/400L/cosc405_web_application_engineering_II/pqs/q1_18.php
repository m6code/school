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
		echo $i. "<br> \n";

	// will echo 0, 8, 16, 24, 32 
 }
?>
