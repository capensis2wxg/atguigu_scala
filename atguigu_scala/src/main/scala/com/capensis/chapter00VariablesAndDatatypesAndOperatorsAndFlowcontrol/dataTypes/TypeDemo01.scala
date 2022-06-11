package com.capensis.chapter00VariablesAndDatatypesAndOperatorsAndFlowcontrol.dataTypes

object TypeDemo01 {
  def main(args: Array[String]): Unit = {

    val num1: Int = 10
    //因为Int 是一个类，因此Int的实例可以使用很多方法
    //在scala中，如果一个方法，没有形参，则可以省略()
    println(num1.toDouble + "\t" +num1.toString + "\t" + 100.toDouble)

    val isPass = true //
    println(isPass.toString)


    sayHi()

  }

  def sayHi(): Unit = {
    println("say hi")
  }
}
