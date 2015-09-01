package com.mylearnings.scala

/**
 *  Scala supports a feature where we don't really need to pass the 
 *  complete arguments when invoking a function.
 * 
 *  This gives us the convenience of binding some arguments and leaving 
 *  the rest to be filled in later.
 *   
 *  @author senthil.nayagan
 */
object FunctionWithPartialArgs {
  
  // Main method
  def main(args: Array[String]) {
    val medicareEligileAge = 60
    
    // Here, we binded a value to the first Age-cap parameter and 
    // leave the second parameter unbounded by putting an underscore (_) at its place   
    val isEligibleForMedicare = isMedicare(medicareEligileAge, _: Int)
    
    println("Is age 40 eligible for Medicare: " + isEligibleForMedicare(40))
    println("Is age 65 eligible for Medicare: " + isEligibleForMedicare(65))
  }
  
  // A function determines the eligibility for Medicare 
  def isMedicare(medicareAgeCap: Int, personAge: Int): Boolean = {
    if (personAge >= medicareAgeCap) {
      true  
    }
    else
      false
  }
}