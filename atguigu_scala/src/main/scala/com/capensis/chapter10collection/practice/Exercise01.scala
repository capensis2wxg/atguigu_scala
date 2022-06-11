package com.capensis.chapter10collection.practice

object Exercise01 {
  def main(args: Array[String]): Unit = {
    val names = List("Alice", "Bob", "Nick")
    val names2 = names.map(upper)
    println("names=" + names2)
  }

  def upper(s:String): String = {
    s.toUpperCase
  }
}
