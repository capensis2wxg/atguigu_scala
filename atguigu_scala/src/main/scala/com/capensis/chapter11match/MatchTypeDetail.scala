package com.capensis.chapter11match

object MatchTypeDetail {
  def main(args: Array[String]): Unit = {

    val obj = 10
    val result = obj match {
      case a: Int => a
      //case b: Map[String, Int] => "Map集合"
      case _ => "啥也不是"
    }

  }
}
