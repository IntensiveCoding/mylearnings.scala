package com.mylearnings.scala

/**
 * 
 * @author senthil.nayagan
 */
object AnonymousFunction {
  
  // Main method
  def main(args: Array[String]): Unit = {
    var square = (x: Int) => x * x
    
    println(square(10))
  }
  
}