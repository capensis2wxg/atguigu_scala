package com.atguigu.customer.Test01

import com.atguigu.customer.bean.Customer

object Test {
  def main(args: Array[String]): Unit = {
    var t = new Customer(10,30,"jack",'N',"110","jack@sohu.com")
    println(t.id)
  }
}
