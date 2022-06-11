package com.capensis.chapter14recursive

import java.text.SimpleDateFormat
import java.util.Date

//noinspection DuplicatedCode
object RecursiveDemo01 {
  def main(args: Array[String]): Unit = {

    //传统方法完成 1-50 的求和任务
    val now: Date = new Date()
    val dateFormat: SimpleDateFormat =
      new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
    val date: String = dateFormat.format(now)

    println("date=" + date) //输出时间
    var res = BigInt(0)
    var num = BigInt(1)
    val maxVal = BigInt(99999999L) //BigInt(99999999l)[测试效率大数]
    while (num <= maxVal) {
      res += num
      num += 1
    }
    println("res=" + res)
    //再一次输出时间
    val now2: Date = new Date()
    val date2: String = dateFormat.format(now2)
    println("date2=" + date2) //输出时间

  }
}
