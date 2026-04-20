#!/bin/bash


read -p "N toog oruulna uu." n

a=0
b=1 
count=0
temp=0
while [ $count -lt $n ]
do

   temp=$((a + b))

  a=$b
  b=$temp 

count=$((count + 1))
done
echo $a
