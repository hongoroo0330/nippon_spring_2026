#!/bin/bash

 secret=42

 while true 
 do 
    read -p "Too oruulna uu!" guess

    if [ $guess -eq $secret ]; then 
       echo "Баяр хүргэе!!!" 
    elif [ $guess -gt $secret ]; then 
        echo "Too ih baina" then
    else 
        echo "Too baga baina" 
    fi 
done

