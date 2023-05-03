<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>PQ 2018</title>
</head>
<body>
<!-- Question 2a -->
<h2>Question 2a</h2>
    <form action = "handler.php" method ="POST">
        Username: <input type= "text" name= "usn" />
        Password: <input type= "password" name= "pwd" />
        <input type="submit" name="submit" value="login">
    </form>
    
<!-- (i) No the form is a valid form aside the fancy quotation mark -->
<!-- (ii) the usn, pwd, and submit variables will be available in $_POST and $_REQUEST superglobals -->

<br><br>
<h2>Question 2b</h2>
<!-- Question 2b -->
    <form action="handler.php" method="POST"> 
        Fullname: <input type="text" name="fullname" /><br>
        Email: <input type="email" name="email" /><br> 
        State: <select name = "state"> 
            <option>Kano</option>
        </select>
        <input type="submit" name="submit" value="Save" />
    </form>

    <!-- using mysqli -->
    <!-- $conn = mysqli_connect("localhost", "root", " ", "studentdb") -->
    <!-- $sql = "INSERT INTO tbl_student (fullname, email, state) VALUES($fullname, $email, $state); -->
    <!-- $q_insert = $conn.mysqli_query($sql); -->
    
</body>
</html>
