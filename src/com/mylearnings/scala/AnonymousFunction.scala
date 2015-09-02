package com.mylearnings.scala

/**
 * Anonymous function is a lightweight/short syntax for defining a function 
 * where it doesn't have a name by default, but you can give them a 
 * name by binding them to a variable.
 * 
 * Anonymous functions in source code are called 'function literals' 
 * and at run-time, function literals are instantiated into objects 
 * called 'function values'.
 * 
 * @author Intensive Coding (intensive.coding@gmail.com)
 */
object AnonymousFunction {
  
  // Main method
  def main(args: Array[String]): Unit = {
    val square = (x: Int) => x * x
    val add = (firstVal: Int, secondVal: Int) => firstVal + secondVal
    
    println("Square: " + square(10))
    println("Add: " + add(10, 20))
  }
  
}