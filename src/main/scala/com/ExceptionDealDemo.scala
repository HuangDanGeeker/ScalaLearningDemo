package com

import java.io.{FileNotFoundException, FileReader}

/**
  * Created by HuangDanGeeker on 2018/3/16.
  * Demo of dealing with Exception in scala
  */
object ExceptionDealDemo {

  def main(args: Array[String]): Unit = {
    var m = 1

    //delete the note below to invoke the IllegalArgumentException
    //m = 2
    if( m != 1)
      throw new IllegalArgumentException

    // use case to match the Exception that may occurred
    try{
      var arr = new Array[Int](3)

      // invoke the FileNotFoundException
      var file = new FileReader("input.txt")
      // invoke the IndexOutofBoundsException
      println(arr(10))
    }catch {  // use 'catch' to catch the possiblely occouring exceptions
      case ex : FileNotFoundException => {
        println(s"FileNotFountException")
        println("exception message : " + ex.getMessage)
        println("exception cause : " + ex.getCause)
        println("exception's stackTrace : " + ex.printStackTrace())

      }
      case ex : IndexOutOfBoundsException => {
        println("IntexOutOfBoundsExceptin")

      }
    }
    finally { //use 'finally' to always run code ignoring the exception's occurrence
      println("whether an exception occourred or not, code here will run normal")
    }
  }
}
