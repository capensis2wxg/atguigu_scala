package com.atguigu.customer.service

import com.atguigu.customer.bean.Customer

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer
import scala.util.control.Breaks.{break, breakable}

class CustomerService {

  //直接初始化一个客户到customers
  ////mutable.Map((1,new Customer(1, 10, "tom", '男', "119", "tom@sohu.com"))) 因为可变map是无序的，因此选择ArrayBuffer
  private var customers  = ArrayBuffer[Customer](new Customer(1, 10, "tom", '男', "119", "tom@sohu.com"))
  private var customerNum: Int = 1
  //显示当前客户列表
  def showList(): ArrayBuffer[Customer] ={
    customers
  }

  //添加一些进行的客户
  def add(newCustomer: Customer): Boolean = {
    customerNum += 1
    newCustomer.id = customerNum
    this.customers.append(newCustomer)
    return true;
  }

  //删除客户
  def del(id: Int): Boolean ={
    //找到id对应的元素下标
    val index = this.findIndex(id)
    if (index == -1) {
      false//说明这个客户不存在..
    }else {
      this.customers.remove(index)
      true
    }
  }

  //根据输入的id去找对应的下标，如果找不到返回-1
  def findIndex(id: Int): Int ={
    var index = -1
    breakable {
      for (i <- 0 until  customers.length) {
        if (customers(i).id == id) {
          index = i
          break()
        }
      }
    }
    return index
  }
}
