package com.capensis.chapter13advancedFunctionalProgramming.HigherOrderFunctions

object HigherOrderFunction {
  def main(args: Array[String]): Unit = {
    def test(f: String => Int, f2: Double =>String, n1: Double): Int = f(f2(n1)) // f(0)
    //sum 是接收一个Double,返回一个Double
    def sum(d: String): Int = {
      d.toInt
    }

    def mod(d:Double): String = {
      (d.toInt % 2).toString
    }

    val res: Int = test(sum, mod, 8.0) //
    println("res= " + res) // 2.0

  }
}
