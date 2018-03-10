package com

/**
  * Created by HuangDanGeeker on 2018/3/10.
  * Scala Method definition and invoke
  */
object MethodDemo {

  def printName(name : String) : Unit = {
    println("printName : " + name)
  }

  // default args
  def printIntroducation(name : String = "anonymous", id : Int = 0) : Unit = {
    println("print Introducation " + name +" "+ id)
  }

  def callByName(t : => Unit) = {
    print("Call-By-Name ")
    t
  }
  def main(args: Array[String]): Unit = {
    //simple invoke
    printName("HuangDanGeeker")

    //specify the args' name
    printIntroducation("HuangDan", 12)
    printIntroducation(id = 12, name = "HuangDan")

    // call by name
    callByName(printIntroducation("HuangDan", 12))

    // call the method using the default args
    printIntroducation()
  }
}
