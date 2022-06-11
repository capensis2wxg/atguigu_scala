package com.capensis.chapter15projectPractice.customercrm.service

import com.capensis.chapter15projectPractice.customercrm.bean.Customer
import scala.collection.mutable.ArrayBuffer
import scala.util.control.Breaks._

/**
 * 对实体类的各种操作方法
 */
class CustomerService {
	/**
	 * id 计数
	 */
	var customerNum = 1

	/** customers是存放客户的，这里我们先初始化,为了测试 */
	val customers: ArrayBuffer[Customer] = ArrayBuffer(new Customer(1, "tom", '男', 10, "110", "tom@sohu.com"))

	/**
	 * 返回用户的数组
	 *
	 * @return 用户数组
	 */
	def list(): ArrayBuffer[Customer] = {
		this.customers
	}

	/**
	 * 添加用户
	 *
	 * @param customer 用户
	 * @return Boolean 添加是否成功
	 */
	def add(customer: Customer): Boolean = {
		//设置id
		customerNum += 1
		customer.id = customerNum
		//加入到customers
		customers.append(customer)
		true
	}

	/**
	 * 根据用户id进行删除
	 * @param id 删除用户的id
	 * @return Boolean 删除是否成功
	 */
	def del(id: Int): Boolean = {
		val index: Int = findIndexById(id)
		if (index != -1) {
			customers.remove(index)
			true
		} else false
	}

	/**
	 * 根据id判断要删除的用户是否存在
	 * @param id	删除用户的id
	 * @return Int 删除用户的id或者-1
	 */
	def findIndexById(id: Int): Int = {
		var index: Int = -1 //默认-1,如果找到就改成对应,如果没有找到，就返回-1
		//遍历customers
		breakable(for (i <- customers.indices) {
			if (customers(i).id == id) { //找到
				index = i
				break()
			}
		})
		index
	}
}
