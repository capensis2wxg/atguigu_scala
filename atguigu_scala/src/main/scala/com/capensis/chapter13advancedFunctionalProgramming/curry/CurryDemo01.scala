package com.capensis.chapter13advancedFunctionalProgramming.curry

object CurryDemo01 {
  def main(args: Array[String]): Unit = {

    def mulCurry2(x: Int)(y:Int): Int = x * y
    println(mulCurry2(10)(8))

  }
}
