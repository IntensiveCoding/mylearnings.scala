package com.mylearnings.scala

/**
 * In a normal function call, the arguments in the call are matched 
 * one by one in the order of the parameters of the called function.
 * 
 * Named arguments in Scala allow us to pass arguments to a function 
 * in a different order.
 * 
 * The syntax is simply that each argument is preceded by a parameter 
 * name and an equals sign.
 * 
 * @author senthil.nayagan
 */
object FunctionWithNamedArgs {

  // Main method
  def main(args: Array[String]) {
    //printArguments("1st", "2nd", 10);
    
    // Calling a method with named arguments i.e., preceded by a parameter names 
    printArguments(StrArgTwo = "2nd", IntArg = 10, StrArgOne = "1st");
  }
  
   // Method
  def printArguments(StrArgOne: String, StrArgTwo: String, IntArg: Int) = {
    println("StrArgOne: " + StrArgOne)
    println("StrArgTwo: " + StrArgTwo)
    println("IntArg: " + IntArg)
  }
  
}