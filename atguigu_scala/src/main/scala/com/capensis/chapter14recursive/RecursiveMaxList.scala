package com.capensis.chapter14recursive

/**
 * @author wxg
 * */
object RecursiveMaxList {
	def main(args: Array[String]): Unit = {
		println(myMax(List(1, -1, 9, 10, 7, 89)))
	}

	def myMax(xs: List[Int]): Int = {
		if (xs.isEmpty)
			throw new java.util.NoSuchElementException
		if (xs.size == 1)
			xs.head
		// 直接告诉计算机目的, 而不是告诉计算机的行为方式
		else if (xs.head > myMax(xs.tail)) xs.head else myMax(xs.tail)
	}

}
