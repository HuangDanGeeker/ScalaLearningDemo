package com
import scala.collection.mutable.Set
/**
  * Created by HuangDanGeeker on 2018/3/12.
  * Demo of Set operation
  */
object SetDemo {

  def main(args: Array[String]): Unit = {


    //simple definition of Set
    // the scala.collection.immutable.Set is default imported
    // if we need the mutable Set, import scala.collection.mutable.Set anywhere
    val s = Set(1,2,3,4,5)
    val s2 : Set[Int] = Set(12,3,4)

    // print the Set
    println(s"s2 = ${s2}")
    println(s2)

    // add element into Set
    s.add(6)
    s += 7
    println(s"the result of adding elements \ns = ${s}\n")

    // remove element in the Set
    s -= 7
    println(s"the result of deleting elements \ns = ${s}\n")

    // the difference between mutable.Set and immutable.scala is that
    // when the operations change the structure of a immutable Set, the result will be a brand new Set and the origin Set is NOT changed;
    // otherwise, applying to a mutable Set will just change the origin

    // Set.head() please referring to ListDemo
    // Set.tail() please referring to ListDemo
    // Set.isEmpty() please referring to ListDemo

    //concat two Set, the duplicate elements will only be left one in the result
    var set = s ++ s2
    s.++(s2)
    println("the result of concat two sets:\n" +
      "the origin sets : " + s +" "+ s2)
    println(s"set = ${set}")
    println(s"s = ${s}\n")

    // find the max/min element in the Set
    println(s"the max element of s : " + s.max)
    println(s"the min element of s : " + s.min)

    // get the intersection of two Sets
    println(s"\nget the intersection of two Sets")
    println(s.&(s2))
    println(s.intersect(s2))

    //get the different set of two sets
    println("\nget the different set of two sets : " + s.&~(s2))

    // apply(A) check if the Set contains element A
    println("the Set contains element 7 : " + s.apply(7))

    // the other api is much like that of List
    // please refer to ListDemo

  }
}
