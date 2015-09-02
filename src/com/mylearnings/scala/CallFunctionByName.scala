package com.mylearnings.scala

/**
 * Typically, parameters to functions are by-value parameters; that is, the value of 
 * the parameter is determined before it is passed to the function.
 * 
 * But what if we need to write a function that accepts as a parameter an expression 
 * that we don't want evaluated until it's called within our function?
 * 
 * For this circumstance, Scala offers call-by-name parameters.
 * 
 * A call-by-name mechanism passes a code block (function) to the callee and each time 
 * the callee accesses the parameter, the code block is executed and the value is calculated.
 * 
 * @author Intensive Coding (intensive.coding@gmail.com)
 */
object CallFunctionByName {

  //  Main method
  def main(args: Array[String]) {
    
    // Invoking the Call-By-Name method called 'methodOne' by passing methodTwo as argument
    methodOne(methodTwo());
  }
  
  // This method simply returns a string value 
  def methodTwo(): String = {
    println("Inside 'methodTwo'")
    "Method - 2";
  }
  
  // Call-By-Name method takes another function as parameter
  // Unlike pass-by-value or pass-by-reference, the arguments to this method i.e., methodTwo() function
  // will not be evaluated until it's called within our function
  def methodOne (m: => String): Unit = {
    println("Inside 'methodOne'")
    println("Parameter: " + m)
  }
  
}