package com.concept.scala

object RunTimeCalculation {


  def calculateRunTime[Type] (operation: => Type): Float = {
    val start = System.currentTimeMillis
    operation
    val end = System.currentTimeMillis
    (end - start) / 1000.toFloat
  }
  def continueTil(condition: => Boolean)(operation: => Unit): Unit = {
    if (condition) {
      operation
      continueTil(condition)(operation)
    }
  }

}
