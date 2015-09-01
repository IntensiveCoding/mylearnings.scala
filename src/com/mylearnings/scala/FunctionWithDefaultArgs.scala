package com.mylearnings.scala

/**
 * Scala lets you specify default values for function parameters.
 * 
 * The argument for such a parameter can optionally be omitted from 
 * a function call, in which case the corresponding argument will be 
 * filled in with the default.
 * 
 * @author senthil.nayagan
 */
object FunctionWithDefaultArgs {
  
  // Main method
  def main(args: Array[String]): Unit = {
    
    // Calling 'add' method without having to pass the arguments
    println(add())
  }
  
  // Method with default arguments 
  def add(val1: Int = 10, val2: Int = 20): Int = {
    val1 + val2    
  }
  
}