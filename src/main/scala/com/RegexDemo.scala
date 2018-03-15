package com

/**
  * Created by HuangDanGeeker on 2018/3/15.
  * Demo of using Regular Expression in Scala
  */
object RegexDemo {

  //import scala.util.matching.Regex
  // generate a Regex using str.r or str.r()X
  val regex = "(S|s)cala".r
  val str = "Scala is the best computer Language in the world! I love scala"

  def main(args: Array[String]): Unit = {
    // find the first matching string
    println("find the first matching string")
    println(regex findFirstIn str)
    println(regex findFirstIn(str))

    // find all the matching string
    println("\n find all the matching string, return a Iterator containning the matching strings")
    println(regex findAllIn(str))
    println((regex findAllIn(str)).mkString(","))

    // replace the first matching string
    println("\nreplace the first matching string, return the replaced String")
    println(regex replaceFirstIn(str, "PHP"))

    // replace all the matching string
    println("\nreplace all the matching string, return the replaced String")
    println(regex replaceAllIn(str, "PHP"))


  }
}
