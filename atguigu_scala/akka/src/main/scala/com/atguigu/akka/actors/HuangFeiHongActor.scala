package com.atguigu.akka.actors

import akka.actor.{Actor, ActorRef}

/**
 * 给乔峰发消息
 * @param actorRef qiaoFengActor的引用
 */
class HuangFeiHongActor(actorRef: ActorRef) extends Actor {
	val qiaoFengActorRef: ActorRef = actorRef
	override def receive: Receive = {
		case "start" => {
			println("HuangFeiHongActor 出招了 , start ok")
			self ! "我打" //发给自己
		}
		case "我打" => {
			//给qiaoFengActor 发出消息
			//这里需要持有QiaoFengActor的引用(QiaoFengActorRef)
			println("HuangFeiHongActor(黄飞鸿) 厉害 看我佛山无影脚")
			Thread.sleep(1000)
			qiaoFengActorRef ! "我打" //给qiaoFengActor 发出消息
		}
	}
}
