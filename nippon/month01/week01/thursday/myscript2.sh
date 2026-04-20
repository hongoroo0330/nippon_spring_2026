#!/bin/bash

mkdir project
cd project
mkdir week01 week02 week03
ls
touch notes.txt  
echo "hongoroo baina" > notes.txt
echo "sain baina uu" >> notes.txt
echo "bayrtai" >> notes.txt
cat notes.txt
cp notes.txt notes-backup.txt
ls
wc -l notes.txt
ls | wc -l 
grep "bash" notes.txt
NAME=Hongoroo
echo "MINII NER: $NAME"


