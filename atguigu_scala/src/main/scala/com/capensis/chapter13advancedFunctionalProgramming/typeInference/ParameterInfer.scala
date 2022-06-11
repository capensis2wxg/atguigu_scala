package com.capensis.chapter13advancedFunctionalProgramming.typeInference

object ParameterInfer {
  def main(args: Array[String]): Unit = {

    val list = List(1, 2, 3, 4)
    println(list.map((x:Int)=>x + 1)) //(2,3,4,5)
    println(list.map((x: Int) =>x + 1)) //(2,3,4,5)
    println(list.map((x: Int) =>x + 1)) //(2,3,4,5)
    println(list.map( (_: Int) + 1)) //(2,3,4,5)


    println(list.reduce(f1)) // 10
    println(list.reduce((n1:Int ,n2:Int) => n1 + n2)) //10
    println(list reduce ((n1: Int, n2: Int) => n1 + n2)) //10
    println(list.reduce( (_: Int) + (_: Int))) //10


    val res: Int = list.reduce((_: Int)+(_: Int))

  }

  def f1(n1:Int ,n2:Int): Int = {
    n1 + n2
  }
}
