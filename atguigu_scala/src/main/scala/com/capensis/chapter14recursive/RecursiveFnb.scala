package com.capensis.chapter14recursive

/**
 * @author wxg
 * */
object RecursiveFnb {
	def main(args: Array[String]): Unit = {
		println(fnb(5))
	}

	def fnb(n: BigInt): BigInt = {
		if(n==1 || n==2) 1 else fnb(n-1) + fnb(n - 2)
	}
}
