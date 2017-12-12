#!/bin/bash

addr=./Robocode/robots/robosGerados
libaddr=./Robocode/libs/robocode.jar
nomeclasse=MisterRobot

mkdir $addr

for src in ./test/gerador/*.txt; do
	   dst=$addr/$nomeclasse$(basename "$src" .txt | tr -dc '0-9').java	
       java -jar ./out/RC.jar  $src $dst
	   javac -cp $libaddr $dst
done
