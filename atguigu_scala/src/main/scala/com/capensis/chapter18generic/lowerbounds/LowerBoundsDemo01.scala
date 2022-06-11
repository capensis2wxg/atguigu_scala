package com.capensis.chapter18generic.lowerbounds

//
//1）和Animal直系的，是Animal父类的还是父类处理，是Animal子类的按照Animal处理()，
//2）和Animal无关的，一律按照Object处理！
object LowerBoundsDemo01 {
	def main(args: Array[String]): Unit = {
		println("ok!")
		//满足下界的约束
		biophony(Seq(new Earth, new Earth)).foreach((_: Earth).sound())
		//满足下界的约束
		biophony(Seq(new Animal, new Animal)).foreach((_: Animal).sound())

		//这里我们不能使用上界的思路去推导，这里是可以运行
		//1.?
		println("===================")
		biophony(Seq(new Bird, new Bird)).foreach((_: Animal).sound()) //

		biophony(Seq(new Moon, new Moon)).foreach(println)

	}

	//下界
	def biophony[T >: Animal](things: Seq[T]): Seq[T] = things
}


class Earth { //Earth 类
	def sound() { //方法
		println("hello !")
	}
}

class Animal extends Earth {
	override def sound(): Unit = { //重写了Earth的方法sound()
		println("animal sound")
	}
}

class Bird extends Animal {
	override def sound(): Unit = { //将Animal的方法重写
		print("bird sounds")
	}
}

class Moon {
	  def sound(): Unit ={ //将Animal的方法重写
	    print("moon sounds")
	  }
}
