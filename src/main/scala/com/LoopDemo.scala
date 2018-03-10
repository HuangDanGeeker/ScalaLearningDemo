package com

import scala.util.control.Breaks

/**
  * Created by HuangDanGeeker on 2018/3/9.
  * this is a Demo about using loop key words such as "for while"
  */
object LoopDemo {

  var a : Int = -1


  def main(args: Array[String]): Unit = {
    // 'for' Demo
    //1. use ‘util’
    println("for(x <- util)\n not include the right edge of range")
    for(a <- 1 until 4){
      println(a)
    }

    //2. use 'to'
    println("for(x <- util)\n include the right edge of range")
    for(a <- 1 to 4){
      println(a)
    }

    //3. loop the elements in a List
    val list = List(1,2,3,4,5)
    println("for(x <- List) \n  travel the elements in the list ")
    for(a <- list){
      println(a)
    }

    //4. filter while looping
    println("for(... if condition; if condition)\n  filter while looping")
    for(a <- 1 to 20
          if a%4 == 0; if a > 8){
      println(a)
    }

    //4. using 'yield' to save for and filter conditions as a attribute
    println("using yield")
    val foo = for{a <- 1 to 20
                  if a%4 == 0 ;if a > 8
    }yield a
    for(a <- foo){
      println(a)
    }


    //‘while’demo
    //1.simple while demo
    a = 1
    println("simple while demo")
    while(a < 4){
      println(a)
      a = a + 1
    }

    //2.break in while loop
    println("break in while loop")
    val loop = new Breaks
    loop.breakable{
      a = 1
      while(a < 10){
        println(a)
        if(a > 6){
          loop.break()
        }
        a = a + 1
      }
    }
    println("if break successed the print above only include 1~7")

  }



}
