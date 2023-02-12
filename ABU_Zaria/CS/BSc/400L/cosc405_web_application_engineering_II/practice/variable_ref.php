<?php
	$Cosc400 = "Course";
	$Course = "Project";
	echo $$Cosc400 . "\n";

	echo "\nTESTING TYPE CONVERSION\n";
	$x = "400";
	$y = $x + 1;
	echo $y . "\n";

	echo "\n\nDevConfusion\n";
	$coursecode = array("COSC400", "COSC405", "COSC408"); 
	$CODE= "coursecode"; 
	$COSC400="Project"; 
	$COSC405="Web Application Engineering II"; 
	$COSC408="Compiler Construction"; 
	$o = "DEVELOPER CONFUSION :("; 
//	echo $$coursecode[1] ."\n"; //what will be the output? Error : Undefined variable $Array
	echo ${$CODE}[1] . "\n"; //what will be the output? COSC405
	echo $$CODE[1] . "\n"; //what will be the output? COSC405

?>
