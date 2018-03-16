package com

/**
  * Created by HuangDanGeeker on 2018/3/16.
  * Demo of Extractor operation
  */
object ExtractorDemo_1 {

  /*

  提取器是从传递给它的对象中提取出构造该对象的参数。

  Scala 标准库包含了一些预定义的提取器。

  Scala 提取器是一个带有unapply方法的对象。unapply方法算是apply方法的反向操作：unapply接受一个对象，然后从对象中提取值，提取的值通常是用来构造该对象的值。

   */
  def main(args: Array[String]): Unit = {

    println("use apply and unapply to create and exact")
    println("apply : " + apply("HuangDan", "gmail.com"))
    println("unapply : " + unapply("HuangDan@gmail.com"))
    println("unapply : " + unapply("HuangDan gmail.com"))


    println("\ncraete an Object with the effect of apply")
    // now, we can use the args in the apply to construct an ExtractorDeno Object
    var o = ExtractorDemo_1("HunangDan", "gmail.com")
    println(o)
    println("use unapply to extract the constructor's args from the object")
    println(unapply(o))


  }

  // 注入方法 injector
  // concat 'user' and 'domain' with a seperator '@'
  def apply(user : String, domain : String) = {
    user + '@' + domain
  }

  //提取方法 Extractor
  //split a String to an Array using the seperator '@'
  // if the String does NOT contain '@' return None
  def unapply(str : String): Option[(String, String)] = {
    val parts = str split '@'
    if(parts.length == 2){
      return Some(parts(0), parts(1))
    }else{
      // this is not acceptable
      // return Some(parts(0), None)
      return None
    }

  }

}
