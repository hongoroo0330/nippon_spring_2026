#!/bin/bash
while true 
do

 count=1 
 read -p "Too oruulna uu!" a 
  if [ $a -eq 0 ]; then 
    echo "bayrtai" 	
   break
  fi
  while [ $count -le 10 ]; 
  do 
    echo "$a * $count = $((a * count))" 
    ((count++))
   done
done

  
