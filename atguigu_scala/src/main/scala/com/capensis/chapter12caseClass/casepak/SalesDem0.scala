package com.capensis.chapter12caseClass.casepak

/**
 * 现在有一些商品，请使用Scala设计相关的样例类，完成商品捆绑打折出售。要求
 * 商品捆绑可以是单个商品，也可以是多个商品,但不能是一捆或者多捆商品
 * 打折时按照折扣x元进行设计.
 * 能够统计出所有捆绑商品打折后的最终价格
 */
object SalesDem0 {
	def main(args: Array[String]): Unit = {

		//这里给出了一个具体的打折的案例
		// 120.
		val sale = Bundle("书籍", 10, Book("漫画", 40), Bundle("文学作品", 20, Book("《阳关》", 80), Book("《围城》", 30), Book("天龙八部", 100)))

		//知识点1 - 使用case语句，得到 "漫画"
		val res: String = sale match {
			//如果我们进行对象匹配时，不想接受某些值，则使用_ 忽略即可，_* 表示所有
			case Bundle(_, _, Book(desc, _), _*) => desc
		}
		println("res=" + res) //


		//知识点2-通过@表示法将嵌套的值绑定到变量。_*绑定剩余Item到rest
		val res2: (Book, Seq[Item]) = sale match {
			//如果我们进行对象匹配时，不想接受某些值，则使用_ 忽略即可，_* 表示所有
			case Bundle(_, _, art@Book(_, _), rest@_*) => (art, rest)
		}
		println("res2=" + res2)

		//知识点3-不使用_*绑定剩余Item到rest
		val res3: (Book, Item) = sale match {
			//如果我们进行对象匹配时，不想接受某些值，则使用_ 忽略即可，_* 表示所有
			case Bundle(_, _, art3@Book(_, _), rest3) => (art3, rest3)
		}
		println("res3=" + res3)

		println("======" * 10)

		//案例的完成
		val sale2 = Bundle("书籍", 10, Book("漫画", 40),
			Bundle("文学作品", 20, Book("《阳关》", 80), Book("《围城》", 30), Book("天龙八部", 100)),
			Bundle("文学作品", 20, Book("《阳关》", 80), Book("《围城》", 30), Book("天龙八部", 100),
				Bundle("文学作品", 20, Book("《阳关》", 80), Book("《围城》", 30), Book("天龙八部", 100))
			)
		)
		println("price=" + price(sale2)) // 220
	}

	def price(it: Item): Double = {
		println(it)
		it match {
			case Book(_, p) => p
			case Bundle(_, disc, its@_*) => its.map(price).sum - disc
		}
	}
}

//设计样例类
abstract sealed class Item // 项

case class Book(description: String, price: Double) extends Item

//Bundle 捆, discount: Double 折扣, item: Item* ,
case class Bundle(description: String, discount: Double, item: Item*) extends Item


