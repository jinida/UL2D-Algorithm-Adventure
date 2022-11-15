<?php
/*
숫자의 합
https://www.acmicpc.net/problem/11720
*/
fscanf(STDIN,"%d",$a);
fscanf(STDIN,"%s",$b);
$sum = 0;
for($i = 0; $i<$a; $i++){
    $sum += $b[$i];
}
echo $sum;