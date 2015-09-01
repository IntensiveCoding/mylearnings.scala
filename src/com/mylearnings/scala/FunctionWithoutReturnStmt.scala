package com.mylearnings.scala

/**
 * Like 'void' in Java, we can use 'Unit' to void return
 * 
 * @author senthil.nayagan
 */
object FunctionWithoutReturnStmt {

  // Main method
  def main(args: Array[String]): Unit = {
    // Calling a method which doesn't have an explicit return statement 
    println(add(10, 20))
    println(subtract(20, 10))
  }
  
  /* Method returns sum of two numbers without having 
     an explicit return statement */
  def add(val1: Int, val2: Int): Int = {
    val1 + val2    
  }

  /* Method returns sum of two numbers without having 
     an explicit return statement and type */
  def subtract(val1: Int, val2: Int) = {
    val1 - val2    
  }
  
}