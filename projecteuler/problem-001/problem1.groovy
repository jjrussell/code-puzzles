#!/usr/bin/env groovy

def sum = 0
def range = 999

(1..range).each{ num ->
  if (num % 3 == 0 || num % 5 == 0 ){ 
    sum += num
  }
}

println "The sum of all natural numbers from 1-${range} that are multiples of 3 or 5 is ${sum}"