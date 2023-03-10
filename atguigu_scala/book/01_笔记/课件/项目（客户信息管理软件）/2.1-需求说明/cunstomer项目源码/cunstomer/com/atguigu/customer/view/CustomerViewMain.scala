package com.atguigu.customer.view
import com.atguigu.customer.bean.Customer
import com.atguigu.customer.service.CustomerService
import scala.util.control.Breaks.{break, breakable}

import scala.io._
object CustomerViewMain {
  def main(args: Array[String]): Unit = {
    new CustomerView().mainMenu()
  }
}

class CustomerView {
  var loop = true
  var key = ' '
  var customerService = new CustomerService


  //显示主菜单和前面的项目一样
  //-----------------客户信息管理软件-----------------
  //
  //    1 添 加 客 户
  //    2 修 改 客 户
  //    3 删 除 客 户
  //    4 客 户 列 表
  //    5 退           出
  //
  //    请选择(1-5)：_
  def  mainMenu(): Unit ={

    do {

      println("-----------------客户信息管理软件-----------------")
      println("                 1 添 加 客 户")
      println("                 2 修 改 客 户")
      println("                 3 删 除 客 户")
      println("                 4 客 户 列 表")
      println("                 5 退       出")
      println("请选择(1-5):")
      key = StdIn.readChar()

      key match {
        case '1' => this.add
        case '2' => println("2")
        case '3' => this.del
        case '4' => this.showList
        case '5' => this.exit //this.loop = false
        case _ => println("输入错误，请重新输入")

      }

    } while (loop)

    println("你已经成功的退出了系统....");
  }
  //显示客户列表
  //完成退出
  def exit(): Unit ={
    //增加一个返回确认的逻辑
    println("确认是否退出(Y/N)：");
    var choice = ' '
    breakable {
      do {
        choice = StdIn.readChar().toLower
        if (choice == 'y' || choice == 'n') {
          break()
        }
        println("你的输入有误，请重新输入 y/n ?");
      } while (true)
    }
    if (choice == 'y') this.loop = false else this.loop = true
  }

  //显示客户列表
  //---------------------------客户列表---------------------------
  //编号  姓名       性别    年龄   电话            邮箱
  // 1    张三       男      30     010-56253825   abc@email.com
  // 2    李四       女      23     010-56253825    lisi@ibm.com
  // 3    王芳       女      26     010-56253825   wang@163.com
  //-------------------------客户列表完成-------------------------

  def showList() = {

    val customerlist = customerService.showList()


    println("---------------------------客户列表---------------------------")
    println("编号\t姓名\t性别\t年龄\t电话\t邮箱")
    for(item <- customerlist) {
      println(item.getInfo())
    }
  }

  //完成添加客户
  //---------------------添加客户---------------------
  //姓名：张三
  //性别：男
  //年龄：30
  //电话：010-56253825
  //邮箱：zhang@abc.com
  //---------------------添加完成---------------------

  def add(): Boolean = {

    println("---------------------添加客户---------------------")
    print("姓名：")
    val name = StdIn.readLine()
    print("性别：")
    val gender = StdIn.readChar()
    print("年龄：")
    val age = StdIn.readInt()
    print("电话：")
    val phone = StdIn.readLine()
    print("邮箱：");
    val email = StdIn.readLine()
    //先新创建一个客户
    val newCustomer = new Customer(age, name, gender, phone, email)

    if(customerService.add(newCustomer)) {
      println("---------------------添加完成---------------------")
      true
    }else {
      println("---------------------添加失败---------------------")
      false
    }

  }

  def del(): Unit ={
    println("---------------------删除客户---------------------")
    println("请选择待删除客户编号(-1退出)：")
    val id = StdIn.readInt()
    if (id == -1) {
      println("---------------------删除没有完成---------------------");
      return
    }
    println("确认是否删除(Y/N)：")
    var choice = ' '
    breakable {
      do {
        choice = StdIn.readChar().toLower
        if (choice == 'y' || choice == 'n') {
          break()
        }
        println("你的输入有误，请重新输入 y/n ?");
      } while (true)
    }
    if (choice == 'y') {
      if(customerService.del(id)){
        println("---------------------删除完成---------------------");
      }else{
        println("---------------------删除没有完成，无此id---------------------");
      }
    }
  }

}