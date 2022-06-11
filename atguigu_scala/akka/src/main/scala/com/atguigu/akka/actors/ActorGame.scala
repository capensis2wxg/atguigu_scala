package com.atguigu.akka.actors

import akka.actor.{ActorRef, ActorSystem, Props}

//100招后，就退出
object ActorGame extends App {
  //创建ActorSystem
  val actorFactory = ActorSystem("actorFactory")
  //先创建qiaoFengActor引用/代理
  val qiaoFengActorRef: ActorRef = actorFactory.actorOf(Props[QiaoFengActor], "qiaoFengActor")
  //创建huangFeiHongActor的引用, 注意：这里已经拿到了对方的引用
  val huangFeiHongActorRef: ActorRef = actorFactory.actorOf(Props(new HuangFeiHongActor(qiaoFengActorRef)), "aActor")
  //huangFeiHongActor出招, 其实质消息是通过QiaoFengActor的引用发过去的
  huangFeiHongActorRef ! "start"
}
