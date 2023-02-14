<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Test Past Question for 2019</title>
</head>
<body>
    <H1>Question 5(i)</H1>
    <h2>Brute Force Version</h2>
    <?php
        $i = 2;
        while($i <= 100) {
            if($i % 2 === 0) {
                echo "$i, "; // \n prints a new line when run from console and <br> inserts a line break when run from browser
            }
            $i++; // increment i by one
        }
    ?>

    <h2>Optimized Version</h2>
    <?php 
        $i = 2;
        while($i <= 100) {
            echo "$i, ";
            $i+=2; // Increment I by 2 which skips odd numbers and goto the next even number
        }
    ?>

    <h1>Question 5(ii)</h1>
    <?php
        for($i = 5; $i <= 100; $i += 5){
            echo "$i, ";
        }
    ?>

    <h1>Question 6</h1>
    <?php
        // Creating the Array 
        $ccode = array(
            array("Code" => "NG", "Name" => "Nigeria"),
            array("Code" => "KEN", "Name" => "Kenya"),
            array("Code" => "GHN", "Name" => "Ghana"),
            array("Code" => "CAM", "Name" => "Cameroon"),
            array("Code" => "TUN", "Name" => "Tunisa")
        );

        // Traversing the array and printing as a table
        echo "<table border=1>";
        echo "<tr><th>Code</th><th>Name</th></tr>"; // Create the table header with "Code" and "Name"
        for($i = 0; $i < count($ccode); $i++) {
            echo "<tr>";
            foreach($ccode[$i] as $value) {
                echo "<td>$value</td>";
            }
            echo "</tr>";
        }
        echo "</table>";
    ?>
</body>
</html>
