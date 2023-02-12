<?php
    $arr = [0, "false", "true", "cosc405", 3.84, true, "400 Level", 345, -1.7E-4];

    // foreach( $arrn as $val) {
    //     echo "Element at ${$val} \n";
    // }

    // Before Converstion
    // for($i = 0; $i < count($arr); $i++) {
    //     echo "Element at $i is $arr[$i]\n";
    //     echo var_dump($arr[$i]) . "\n";
    // }

    //Conversion to Integer
    echo "CONVERT TO INTEGER\n";
    for($i = 0; $i < count($arr); $i++) {
        // Convert to string
        echo "integer value of $arr[$i] = " .intval($arr[$i]) . "\n";
        echo var_dump($arr[$i]) . "\n";
    }
    
    
    // Conversion to float
    echo "\n\nCONVERT TO FLOAT\n";
    // $arrStr = $arrn;
    for($i = 0; $i < count($arr); $i++) {
        // Convert to string
        echo "float value of $arr[$i] = " .floatval($arr[$i]) . "\n";
        echo var_dump($arr[$i]) . "\n";
    }


    // Conversion to String
    echo "\n\nCONVERT TO BOOLEAN\n";
    // $arrStr = $arrn;
    for($i = 0; $i < count($arr); $i++) {
        // Convert to string
        echo "Boolean value of $arr[$i] = " .boolval($arr[$i]) . "\n";
        echo var_dump($arr[$i]) . "\n";
    }

    
    // Conversion to String
    echo "\n\nCONVERT TO STRING\n";
    // $arrStr = $arrn;
    for($i = 0; $i < count($arr); $i++) {
        // Convert to string
        echo "String value of $arr[$i] = " .strval($arr[$i]) . "\n";
        echo var_dump($arr[$i]) . "\n";
    }
    
?>