package com.mylearnings.scala

/**
 * Function composition (not to be confused with object composition) is 
 * an act or mechanism to combine simple functions to build more complicated ones.
 * 
 * The result of each function is passed as the argument of the next, and the 
 * result of the last one is the result of the whole.
 * 
 * @author Intensive Coding (intensive.coding@gmail.com)
 */
object FunctionComposition {
  
  // Main method
  def main(args: Array[String]) {
    val square = (x: Int) => x * x
    val add = (x: Int) => x + 1
    
    // Function composition - one way of doing things
    println(add(square(10)))
    
    // Built-in compose function - other way of doing things
    val finalValue = add.compose(square)
    println(finalValue(10))
  }
  
}