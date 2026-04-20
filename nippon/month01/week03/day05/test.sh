#!/bin/bash

read -p "Ehnii too oruulna uu!" a
read -p "Hoyr dahi too oruulna uu!" b
read -p "Uildel(+, -, *, /) oruulna uu!" c

if [ "$c" = "+" ]; then
  result=$((a + b)) 
 elif [ "$c" = "-" ]; then
  result=$((a - b)) 
 elif [ "$c" = "*" ]; then
  result=$((a * b)) 
 elif [ "$c" = "/" ]; then
   if [ "$b" -eq 0 ]; then  
  echo "Aldaa garlaa"
  exit
  else
      result=$((a / b))
  fi
fi 
  echo "hariu: $result" 
