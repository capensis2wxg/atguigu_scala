package com.capensis.chapter14recursive

/**
 * @author wxg
 * */
object RecursiveFactorial {
	def main(args: Array[String]): Unit = {
		println(factorial(10))
	}

	def factorial(n: Int): Int =
		if (n == 0) 1 else n * factorial(n - 1)

}
