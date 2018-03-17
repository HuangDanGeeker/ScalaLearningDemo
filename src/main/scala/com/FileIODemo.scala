package com

import java.io.PrintWriter
import java.io.File

import scala.io.Source

/**
  * Created by HuangDanGeeker on 2018/3/17.
  * Demo of File io
  */
object FileIODemo {

  // scala's File IO just use the java.io.File
  def main(args: Array[String]): Unit = {
    // write into the file
    println("write to file :")
    val writer = new PrintWriter(new File("content.txt"))
    writer.append("this is the append text\n")
    writer.println("this is second append text")
    writer.close()
    println("write complete\n")

    // read content from file
    println("\nread the file content :")
    Source.fromFile("content.txt").foreach(println)   //print content one line per letter
    println("read complete\n")


    // get user input from console
    println("please input something : ")
    val input = Console.readLine
    println("your input is : " + input)
  }

}
