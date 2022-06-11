package com.capensis.chapter00VariablesAndDatatypesAndOperatorsAndFlowcontrol.dataTypes

object TypeDemo03 {
  def main(args: Array[String]): Unit = {
    println("long的最大值" + Long.MaxValue + "~" + Long.MinValue)

    var i = 10 //i Int
    var j = 10L //j Long
    var e = 9223372036854775807L //说 9223372036854775807 超过int

    //2.2345678912f , 2.2345678912
    val num1: Float = 2.2345678912f
    val num2: Double = 2.2345678912
    println("num1=" + num1 + "num2=" + num2)
  }
}
