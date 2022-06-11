package com.capensis.chapter14recursive

import java.text.SimpleDateFormat
import java.util.Date

import scala.annotation.tailrec

//noinspection DuplicatedCode
object RecursiveDemo02 {
  def main(args: Array[String]): Unit = {

    // 递归的方式来解决
    //传统方法完成 1-50 的求和任务
    val now: Date = new Date()
    val dateFormat: SimpleDateFormat =
      new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
    val date: String = dateFormat.format(now)
    println("date=" + date) //输出时间

    @tailrec
    def mx(num: BigInt, sum: BigInt): BigInt = {
      if (num <= 99999999L) mx(num + 1, sum + num)
      else sum
    }

    //测试
    val num = BigInt(1)
    val sum = BigInt(0)
    val res: BigInt = mx(num, sum)
    println("res=" + res)

    //再一次输出时间
    val now2: Date = new Date()
    val date2: String = dateFormat.format(now2)
    println("date2=" + date2) //输出时间

  }
}
