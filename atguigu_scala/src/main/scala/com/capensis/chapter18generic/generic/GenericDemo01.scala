package com.capensis.chapter18generic.generic

object GenericDemo01 {
  def main(args: Array[String]): Unit = {
    val intMessage: Int = new IntMessage[Int](10).get
    println(intMessage)
    val strMessage: String = new StringMessage[String]("hello").get
    println(strMessage)
  }
}

/*
  编写一个Message类
  可以构建Int类型的Message,
  String类型的Message.
  要求使用泛型来完成设计,(说明：不能使用Any)
 */

abstract class Message[T](s:T) {
  def get: T = s
}

class IntMessage[Int](v:Int) extends Message(v)
class StringMessage[String](v:String) extends Message(v)
