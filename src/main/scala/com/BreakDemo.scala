package com

import scala.util.control.Breaks


/**
  * Created by HuangDanGeeker on 2018/3/9.
  */
object BreakDemo {

  var loop = new Breaks
  var a = 1



  def main(args: Array[String]): Unit = {
    loop.breakable{
      for(a <- 1 to 12){
        println("the value of a :" + a)
        if( a == 5){
          loop.break
        }
      }
    }
    println("if not breaked this will print to 12")
  }
}
