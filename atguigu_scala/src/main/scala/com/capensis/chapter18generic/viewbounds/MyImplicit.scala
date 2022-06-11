package com.capensis.chapter18generic.viewbounds

object MyImplicit {
	implicit def person3toOrderedPerson3(p3: Person3): Ordered[Person3] = new Ordered[Person3] {
		override def compare(that: Person3): Int = { //是你自己的业务逻辑
			p3.age - that.age
		}
	}

}
