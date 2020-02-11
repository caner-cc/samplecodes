<?php

$month = date("F");

if($month == "August"){
   echo "It's August, so it's still holiday. <br>";
} else {
   echo "Not August, This is $month so I don't have any holidays. <br>";
}


$color = "red";

switch ($color){
    case "red":
        echo "The color is red <br>";
    break;

    default: 
        echo "The color is not red <br>";

    }

$grade = 50;

switch ($grade){
    case ($grade>=80):
        echo "Excellent <br>";
    break;
    case ($grade>=70 && $grade <80):
        echo "Great <br>";
    break;
    case ($grade>=60 && $grade <70):
        echo "Good <br>";
    break;
    case ($grade>=50 && $grade <60):
        echo "Pass <br>";
    break;
    case ($grade<50):
        echo "Fail <br>";
    break;
    default:
    echo "Invalid input";

}

?>