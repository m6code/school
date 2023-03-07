<?php
//$x = "10 box" + "5 size" + 10 + "6sijjh";
//echo $x;

?>

<?php
$students = array(
        array("U06CS1001", "Aliyu", 26, "male", "Kaduna", "Computer Sci.", "100L", 4.31),
        array("U06CS1002", "Musa", 30, "female", "Niger", "Law", "300L", 3.05),
        array("U06CS1003", "Sikirat", 22, "female", "Ibadan", "Accounting", "200L", 2.87),
        array("U06CS1004", "Chinedu", 39, "male", "Imo", "Pharmacy", "500L", 3.56)

);

// Change Musa to Talatu
$students[1][1]= "Talatu";

// Print content of array
for($i = 0; $i < count($students); $i++){
	for($j = 0; $j < count($students[$i]); $j++){
		echo $students[$i][$j].", ";
	}
	echo "\n";
}






?>
