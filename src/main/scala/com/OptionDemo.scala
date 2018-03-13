package com

/**
  * Created by HuangDanGeeker on 2018/3/13.
  * Demo of Option Operation
  */
object OptionDemo {

  def main(args: Array[String]): Unit = {
    /* explain of Option
     *  Represents optional values. Instances of Option are either an instance of scala.Some or the object None.Represents optional values.
     *  Instances of Option are either an instance of scala.Some or the object None.
    */

    // definition of Option
    val map = Map[String, Int]("HuangDan" -> 1, "Geeker" -> 2)  // remeber this Nap is immutable
    val firstValue : Option[Int] = map.get("HuangDan")
    val secondValue : Option[Int] = map.get("Geeeeeker")
    println("get the exist value : " + firstValue)
    println("get the exist value : " + firstValue.get)
    println("get the exist value, you will get the Some.class" + firstValue.getClass)
    println("get the NOT exist value : " + secondValue)
    println("get the NOT exist value, you will get the None.class" + secondValue.getClass)
//    println("get the NOT exist value : " + secondValue.get)    //this will cause an error

    // facing with the possible None value, we can use 'getOrElse' to always get a value (the real value or the default value)
    println("\nusing getOrElse to get a exist value  : " +  firstValue.getOrElse(100))    // get the real value
    println("using getOrElse to get a NOT exist value : " +  secondValue.getOrElse(100)) //get the default value

    // isEmpty
    println("\ncheck the exist value : " + firstValue.isEmpty)     // false
    println("check the NOT exist value : " + secondValue.isEmpty)   // true

    println("\nthe size of the Option (exist value): " + firstValue.productArity)
    println("the size of the Option (NOT exist value): " + secondValue.productArity)

    // producElement : get the n-th element, 0-based
    println("\nget the first element of firstValue : " + firstValue.productElement(0))
//    println("get the first element of firstValue : " + firstValue.productElement(1))  // this will cause an error

    // Option.filter
    // Option.filterNot

    // flatMap(f) : Returns the result of applying f to this scala.Option's value if this scala.Option is nonempty. Returns None if this scala.Option is empty. Slightly different from map in that f is expected to return an scala.Option (which could be None).
    // println(firstValue.flatMap(i => (i = i + 1)))

    // Option.isDefined : Returns true if the option is an instance of scala.Some, false otherwise.
    // this method is as much same as 'isEmpty'


    // withFilter : create a non-strict filter of  this iterable collection






  }
}
