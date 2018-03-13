package com

/**
  * Created by HuangDanGeeker on 2018/3/13.
  * Demo of Tuple Operation
  */
object TupleDemo {
  def main(args: Array[String]): Unit = {
    //simple definition of Tuple, a Tuple can contain 22 elements at most
    val t = (1, 2.2, "HuangDan")
    val t2 = Tuple3(1, 2.2, "HuangDan")

    // get the element using the index
    println("the third element of a tuple : " + t._3)

    // toString
    println("\ntoString : " + t.toString())


    // productIterator() : get the Iterator of the Tuple
    println("\ntravel the element of the Tuple : ")
    t.productIterator.foreach(i => print(i + ", "))

    // swap : exchange the index of the Tuple2's element
    // attentsion : just Tuple2 have the  api  swap()
    println("\n swap the position of the Tuple2's two elements")
    val t3 = Tuple2(1, "HuangDan")
    println("before swap : "+t3 +"\nafter swap : "+t3.swap)
  }

}
