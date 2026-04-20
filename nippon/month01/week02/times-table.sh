#!/bin/bash

for ((i=1; i<=10; i++)); do
  echo "5x$i=$((i*5))" 
done 

for ((i=2; i<=20; i=i+2)); do
    echo "too: $i"
done
