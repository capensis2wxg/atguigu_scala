package com.atguigu.customer.bean

class Customer {
  var id: Int = _
  var age: Int = _
  var name: String = _
  var gender: Char = _
  var phone: String = _
  var email: String = _

  def this(id: Int, age: Int,name: String, gender: Char, phone: String,email: String) {
    this()
    this.id = id
    this.age = age
    this.name = name
    this.gender = gender
    this.phone = phone
    this.email = email
  }

  def this(age: Int,name: String, gender: Char, phone: String,email: String) {
    this()
    this.age = age
    this.name = name
    this.gender = gender
    this.phone = phone
    this.email = email
  }

  def getInfo(): String ={
    return this.id + "\t\t" + this.name + "\t\t" + this.gender + "\t\t" + this.age + "\t\t" + this.phone + "\t\t" + this.email
  }
}
