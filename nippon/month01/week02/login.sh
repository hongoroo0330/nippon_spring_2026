#!/bin/bash

correct_password="icode2024"
attempts=3

while [ $attempts -gt 0 ]
do
  read -s  -p "Nuuts ugiig oruulna uu: " password
if [ "$password" = "$correct_password" ]; then
    echo "Newterlee!" 
    exit 0
 else
   attempts=$((attempts - 1)) 
   if [ $attempts -gt 0 ]; then
   echo "Buruu nuuts ug. $attempts oroldlogo uldlee."
  else 
   echo "Bloklogdloo"
   fi
 fi
done
