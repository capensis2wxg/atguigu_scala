package com.capensis.chapter00VariablesAndDatatypesAndOperatorsAndFlowcontrol.dataTypes

object TypeDemo02 {
  def main(args: Array[String]): Unit = {
    var num: Double = 1.2 //默认为double
    var num2: Float = 1.7f //这是float
    //num2 = num   //error
    num2 = num.toFloat

    println(sayHello)
  }

  //比如开发中，我们有一个方法，就会异常中断，这时就可以返回Nothing
  //即当我们Nothing做返回值，就是明确说明该方法没有正常返回值
  def sayHello: Nothing = {
      throw new Exception("抛出异常")
  }
}



