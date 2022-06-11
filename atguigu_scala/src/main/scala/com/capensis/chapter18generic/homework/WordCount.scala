package com.capensis.chapter18generic.homework

/**
 * @author wxg
 * @date 2022/4/7-8:11
 * @quotes 小不忍则乱大谋
 */
object WordCount {
	def main(args: Array[String]): Unit = {
		val strings = List("hello spark spark", "hello hive hello")
		val result: List[(String, Int)] = strings
				.flatMap((_: String).split(" "))
				.map((_: String, 1))
				.groupBy((_: (String, Int))._1)
				.map((x: (String, List[(String, Int)])) => (x._1, x._2.size))
				.toList
				.sortBy((_: (String, Int))._2)
				.reverse
		result.foreach(println)
	}
}
