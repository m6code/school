<?php
// Question 3a
    $students = array(
        ["U06CS1001", "Aliyu", 26, "male", "Kaduna", "Computer Sci.", "100L", 4.31],
        ["U06CS1002", "Talatu", 30, "female", "Niger", "Law", "300L", 3.05],
        ["U06CS1003", "Sikirat", 22, "female", "Ibadan", "Accounting", "200L", 2.87],
        ["U06CS1004", "Chinedu", 39, "male", "Imo", "Pharmacy", "500L", 3.56]
        
    );

    // var_dump($students);
    // print_r($students);

// Question 3b
    $students[2][1] = "Bukola";
    // var_dump($students);
    // print_r($students);

// Question 3c
    foreach($students as $stu){
        for($i = 0; $i < count($stu); $i++) {
            echo $stu[$i]." ";
        }
        echo "<br> \n";
    }

// Question 3c again
    foreach($students as $student) {
        foreach($student as $stu) {
            echo $stu . " ";
        }
        echo "\n";
    } 

// Quesition 3d
    $myarr = array("var_dump", "explode", "out", "count", "Math.sqrt");
    
    foreach($myarr as $key => $value) {
        if(function_exists($value))
            echo "1 "; 
        else
            echo "0 ";
    }
    // Ans: 1 1 0 1 0
?>