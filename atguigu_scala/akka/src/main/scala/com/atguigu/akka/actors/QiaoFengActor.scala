package com.atguigu.akka.actors

import akka.actor.Actor

class QiaoFengActor extends Actor{
  override def receive:Receive = {
    case "我打" =>
      println("qiaoFengActor(乔峰) 挺猛 看我降龙十八掌")
      Thread.sleep(1000)
      //通过sender() 可以获取到发现消息的HuangFeiHongActor的ref
      sender() ! "我打"
  }
}
