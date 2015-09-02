package com.mylearnings.scala

/**
 * Anonymous function is a lightweight syntax for defining a function 
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
    var square = (x: Int) => x * x
    
    println(square(10))
  }
  
}