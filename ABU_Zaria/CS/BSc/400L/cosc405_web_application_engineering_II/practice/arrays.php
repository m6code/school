<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Arrays</title>
</head>
<body>
    <?php
        $arrofpeps = array(
            array("name" => "John", "reg" => "U17cs1021"),
            array("name" => "Doe", "reg" => "U1723901"),
            array("name" => "Kain", "reg" => "U183soei") 
        );

        // Normal console printing
        // for($i = 0; $i < count($arrofpeps); $i++) {
        //     foreach($arrofpeps[$i] as $key => $value) {
        //         echo "$key : $value \n<br>";
        //     }
        // }

        echo "<table border=2>";
        echo "<tr><th>name</th><th>reg</th></tr>";
        for($i = 0; $i < count($arrofpeps); $i++) {
            echo "<tr>";
            foreach($arrofpeps[$i] as $key => $value) {
                echo "<td> $value </td>";
            }
            echo "</tr>";
        }
        echo "</table>";
    ?>
</body>
</html>