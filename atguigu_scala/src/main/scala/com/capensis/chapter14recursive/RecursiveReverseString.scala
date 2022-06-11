package com.capensis.chapter14recursive

/**
 * @author wxg
 * */
object RecursiveReverseString {
	def main(args: Array[String]): Unit = {
		println(reverse("Hello"))

	}

	def reverse(xs: String): String =
		if (xs.length == 1) xs else reverse(xs.tail) + xs.head
}
