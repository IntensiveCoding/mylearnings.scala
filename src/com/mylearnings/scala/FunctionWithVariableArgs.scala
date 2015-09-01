package com.mylearnings.scala

/**
 * Scala allows you to indicate (by * symbol) that the last parameter 
 * to a function may be repeated.
 * 
 * This allows clients to pass variable length argument lists to the function.
 * 
 * @author senthil.nayagan
 */
object FunctionWithVariableArgs {

  // Main method
  def main(args: Array[String]) {
    printStrings("1st", "2nd", "3rd");
  }

  // Method with variable arguments
  def printStrings(args: String*) = {
    var i: Int = 0;

    for (arg <- args) {
      println(arg);
      i = i + 1;
    }
  }
  
}