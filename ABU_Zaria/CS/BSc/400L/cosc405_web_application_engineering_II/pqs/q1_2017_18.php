<h2>Question 1a </h2>
<?php
// Question 1a
	$a = 2;
	$b = 3.0;
	$c = 5;
	echo (($c--===$b) || ($a++>$b*$b)); // False
	var_dump(($c--==$b) || ($a++ > $b*$b)); // bool(False)

echo "<br><br>";
?>

<h2>Question 1b </h2>

<?php 
// Question 1b
 $aa = 35;
 for($i=0; $i<=$aa; $i++){
	if($i % 8 == 0)
		echo $i. "<br> \n"; // will echo 0, 8, 16, 24, 32 
 }
?>

<h2> Question 1c </h2>
<?php 
echo "Question 1c - Datatypes in PHP <br>";
// Question 1c
// Integer
// Float (double)
// Boolean
// String
// Array
// Object
// Resource
// Null
echo "Integer, Float, Boolean, String, Array, Object, Resource and Null <br>";
?>


<!-- Question 1d -->
<h2> Question 1d </h2>
<!-- below code is equivalent to <?php echo "<h3>trying</h3>" ?> -->
<!-- <?= "<h3>trying</h3>" ?> -->

<?php 
function getGrade($score) {
    $grade = "";
    if($score < 40) $grade = "F";
    else if($score >= 40 && $score <= 44) $grade = "E";
    else if($score >= 45 && $score <= 49) $grade = "D";
    else if($score >= 50 && $score <= 59) $grade = "C";
    else if($score >= 60 && $score <= 69) $grade = "B";
    else $grade = "A";

    return $grade;
}

echo "when score is 02 grade = " . getGrade(02) . "<br>";
echo "when score is 42 grade = " . getGrade(42) . "<br>";
echo "when score is 56 grade = " . getGrade(56) . "<br>";
echo "when score is 67 grade = " . getGrade(67) . "<br>";
echo "when score is 87 grade = " . getGrade(87) . "<br>";
echo "<br><br>"

?>

<h2>Question 1e</h2>
<?php 
// Question 1e
 	function myFunc($a, $b, $c, $d = array(401, 403, 405, 407, 409, 411, 415)) {
		define("MYCONS", time());
		echo date("Y-m-d", MYCONS);
	}

	$j = 1;
	myFunc($j, $j + 1, $j + 2); 
	// Ans: 2023-01-22 (current yyyy-mm-dd)
?>
