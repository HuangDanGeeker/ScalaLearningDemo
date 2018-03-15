package com

/**
  * Created by HuangDanGeeker on 2018/3/15.
  * Demo of Match-Case Operation
  */
object MatchCaseDemo {

  def main(args: Array[String]): Unit = {

    println("1 => " + numToStr(1))
    println("200 => " + numToStr(200))

    var m = 100
    m match{
      case 1 => println("1 is ONE")
      case 2 => println("2 TWO")
      case 3 => println("3 THERE")
      case 4 => println("4 FOUR")
      case _ => println(m +" is NUMBER")
    }
  }

  def numToStr(x :Int) :String = x match {
    case 1 => "ONE"
    case 2 => "TWO"
    case 3 => "THERE"
    case 4 => "FOUR"
    case _ => "NUMBER"

  }
}
