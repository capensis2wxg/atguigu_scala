package com.capensis.chapter01functionalProgramming.fundetails

object DetailsRecursive {
  def main(args: Array[String]): Unit = {

  }

  def f1(n:Int): Int = {
      if (n==1) {
        1
      }else {
        f1(n-1)
      }
  }
}
