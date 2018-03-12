package com
import scala.collection.mutable.Map
/**
  * Created by HuangDanGeeker on 2018/3/12.
  * Demo of Map operation
  */
object MapDemo {

  def main(args: Array[String]): Unit = {

    // the scala.collection.immutable,Map is default imported
    // if you need the mutable Map, import scala.collection.mutable.Map

    // simple definition of Map
    val m2 : Map[Char, Int] = Map('e' -> 60)
    val m = Map('a' -> 56, 'b' -> 57,'c' -> 58)

    // add element to Map
    m += ('d' -> 59)
    // remove a element from the Map
    m -= ('d')

    // get all the keys of the map
    println(m.keys)
    // get all the values of the map
    println(m.keys)
    // check if the Map is Empty
    println("the map is empty : " + m.isEmpty)
    // check if the Map contains the key
    println("the map contains key 'e' : " + m.contains('e'))

    // concat two Map, the duplicate keys will be removed to left one
    println("concat two maps : \n the origin Map : " +m+ " " + m2)
    println(m++m2)
    println(m.++(m2))

    // foreach keys and values
    println("\nforeach the keys and correspond values in a Map :")
    m.keys.foreach{ key =>
                        print("key : " + key)
                        println(",values : " + m(key))
    }

    // clone the Map
    val map = m.clone()


    // remove the key and the correspond value
    m.remove('a')

    // get the accumulation of all digital value of the Map
    // println("the accumulation of digital values : " + m.product)

    // transfer to other collection
    m.toSeq
    m.toList
    m.toArray

    // the other api is much like that of List


  }
}
