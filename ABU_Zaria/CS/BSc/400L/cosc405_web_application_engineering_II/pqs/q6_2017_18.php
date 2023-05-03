
<h2> Question 1a </h2>
<table border="1" style="width: 50%; table-layout: fixed;"> 
    <thead>
        <tr>  
            <th rowspan="2"> </th>
            <th colspan="4"> Context </th>
        </tr>
        <tr> 
            <th>Integer </th>
            <th>Float </th>
            <th>Boolean </th>
            <th>String </th>
        </tr>
    </thead>

    <tbody> 
        <tr> 
            <th> 0 </th>
            <td> 0 </td>
            <td> 0 </td>
            <td> false </td>
            <td> "0" </td>
        </tr>
         <tr> 
            <th> "true" </th>
            <td> 0 </td>
            <td> 0 </td>
            <td> true </td>
            <td> "true" </td>
        </tr>
         <tr> 
            <th> "cosc405" </th>
            <td> 0 </td>
            <td> 0 </td>
            <td> true </td>
            <td> "cosc405" </td>
        </tr>
         <tr> 
            <th> 3.84 </th>
            <td> 3 </td>
            <td> 3.84 </td>
            <td> true </td>
            <td> "3.84" </td>
        </tr>
        <tr> 
            <th> false </th>
            <td> 0 </td>
            <td> 0 </td>
            <td> false </td>
            <td> "false" </td>
        </tr>
 
        <tr> 
            <th> "7 points" </th>
            <td> 7 </td>
            <td> 7 </td>
            <td> true </td>
            <td> "7 points" </td>
        </tr>

    </tbody>

</table>

<br><br><hr>

<?php
/**
$el = array(0, "true", "cosc405", 3.84, false, "7 points");

foreach($el as $e) {
    echo "<br>";
    echo "Integer of $e is = " . intval($e) . "<br>";
    echo "Float of $e is = " . floatval($e) . "<br>";
    echo "Boolean of $e is = " . boolval($e) . "<br>";
    echo "String of $e is = " . strval($e) . "<Br>";
}
*/ 
?>

<h2> Question 1b </h2>
<?php 
// Question 1b 
    $x = "10 minus" + "5 equals " + 10;
    echo $x;

?>

<h2> Question 1c </h2>
Browser --> Client Software <br>
Mysql --> Storage Engine <br>
Apache --> Web Server <br>
Javascript --> Client Side Technology <br>
PHP Interpreter --> CGI Program <br>
HTTP --> Interaction Protocol <br>
CGI --> Server Side Technology <Br>
Web Service --> WSDL <br>
