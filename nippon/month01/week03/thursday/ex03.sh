#!/bin/bash

 read -p "A toog oruulna uu!" A
 read -p "B toog oruulna uu!" B
 read -p "C toog oruulna uu!" C 


   if [ $A -lt $B ]; then 
     temp=$A
     A=$B
     B=$temp
   fi 

  if [ $A -lt $C ]; then 
     temp=$A
     A=$C
     C=$temp 
  fi 
   
  if [ $B -lt $C ]; then 
      temp=$B
      B=$C
      C=$temp 
  fi 
 echo "$A, $B, $C"

