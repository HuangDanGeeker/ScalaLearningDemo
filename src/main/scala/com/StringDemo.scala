package com

/**
  * Created by HuangDanGeeker on 2018/3/10.
  * Demo about String operation
  */
object StringDemo {

  def main(args: Array[String]): Unit = {
    //String definition
    val str1 = "HuangDan"
    val str2 : String = "HuangDan"

    //String in scala is unmodifiable, we can use 'StringBuilder' to build a String step by step
    val strBuilder = new StringBuilder
    // if just add a character to the stringBuilder use '+='
    // else add a String to the stringBuilder use '++='
    strBuilder += 'H'
    strBuilder ++= "uangDan"
    println(StringBuilder.toString())
    println(StringBuilder)

    //create special String in format
    val str = printf("my name is %s and my age is %d", "HuangDan", 12)
    println(str)
  }

// the other api is roughly as same as that in JAVA

}
