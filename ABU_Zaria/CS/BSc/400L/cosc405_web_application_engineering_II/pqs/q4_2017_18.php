<?php

// Question 4a
class Student 
{
    private $id;
    private $fullname;
    
    public function __construct($id, $fullname) 
    {
        $this->id = $id;
        $this->fullname = $fullname;
    }

    public function __toString()
    {
        return "id: " .$this->id . "\nFullname: " .$this->fullname;
    }
}

// Question 4b
echo "<h2>Question 4b</h2>";
$stu1 = new Student(1234, "John Doe");
echo $stu1;

?>

<!-- Question 4c -->
<h2>Question 4c </h2>
Advantages and Disadvantages of Server side form validation <Br>
<ul> Advantages 
    <li> It is more reliable and secure than client-side validation</li>
    <li> It is independent of client functionality </li>
</ul>

<ul> 
    <li>It is less convinient to users (since no realtime validation) </li>
    <li>It is slower than client-side validation </li>
</ul>

<!-- Question 4d -->
<h2> Question 4d </h2>
<ul> 
    <li>(i) Public - variables/methods/properties are visible within the class and external classes; </li>
    <li>(ii) Protected - visible within the class and all subclasses </li>
    <li>(iii) Private - visible only to the current class </li>
</ul>
