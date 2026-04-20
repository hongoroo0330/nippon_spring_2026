#!/bin/bash

i=1
max=0 
while [ $i -le 5 ] 
do 
   echo "Too oruul:" 
   read num 
  if [ $num -gt $max ]; then
       max=$num
  fi

   ((i++))
done 
 echo "hamgiin ih too: $max" 

