package com.capensis.chapter18generic.upperbounds

object LowerBoundsDemo {
	def main(args: Array[String]): Unit = {
		biophony(Seq(new Bird, new Bird)) //? √
		biophony(Seq(new Animal, new Animal)) //对
		biophony(Seq(new Animal, new Bird)) //√
		//biophony(Seq(new Earth, new Earth)) //×,因为Earth不是Animal子类
	}

	//上界
	def biophony[T <: Animal](things: Seq[T]): Seq[Unit] = things.map ((_: T).sound())
}

class Earth { //Earth 类
	def sound() { //方法
		println("hello !")
	}
}

class Animal extends Earth {
	/**
	 *
	 */
	override def sound(): Unit = { //重写了Earth的方法sound()
		println("animal sound")
	}
}

class Bird extends Animal {
	override def sound(): Unit = { //将Animal的方法重写
		println("bird sounds")
	}
}
