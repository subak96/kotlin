package com.example.homework_2

fun main() {
   for (i in 1..6){
       for (j in 1..6){
           if (i+j==6){
               println("$i , $j")
           }
       }
   }
}