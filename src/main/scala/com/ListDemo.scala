package com
/**
  * Created by HuangDanGeeker on 2018/3/11.
  * Demo about List operate
  */
object ListDemo {

  def main(args: Array[String]): Unit = {
    //simple definition of List
    val l1 = List(1,2,3)
    val l2 :List[Int] = List(1,2,3)
    // heigher dimension List
    var l3 :List[List[Int]] = List(
      List(1,2,3),
      List(4,5,6)
    )
    // two basic  elements in List 'Nil' and '::'
    // create a simple List
    var l4 = "Huang" :: ("Dan" :: ("is" :: Nil))
    //creaet a two-dimension List
    var l5 = ("china" ::("ShanDong" :: ("QingDao" :: Nil))) ::
             ("Americ" ::("LA" ::("emmm" :: Nil))) ::
             Nil

    //basic API and operation of list
    println("demo of basic api and operation")
    val list = List(1,2,3,4,5)
    val l = List(6,7,8)
    println(list.head)            // return the first element of the list
    println(list.tail)            // return all the element except the first element as a new List
    println(list.isEmpty)         // return true if the List is empty
    println(list(2))              // return the element at the specific index of the List
    println(list.apply(2))        // return the element at the specific index of the List
    println(List.fill(3)("huangdan")) // create a List at appointed Length and element value
    // List.tabulate() please referring to ArrayDemo.scala::76
    // List.fill() please referring to ArrayDemo.scala::67
    println(list.reverse)         // reverse the list and return the result in a new List
    println(0 +: list)            // append an element at the first of list and return the result as a new List
    println(0 :: list)            // append an element at the first of list and return the result as a new List
    println(l ::: list)           // append a list B at the first of list A and return the result as a new List
    println(list :+ 11)           // append an element at the tail of the list and return the result as a new List

    //concat two or more lists together
    println("concat two or more lists together")
    println(list ::: l)
    println(List.concat(list ,l))
    println(list.:::(l))

    println("add all of the element to a StringBuilder")
    var strBuilder = new StringBuilder
    println(list.addString(strBuilder).toString())
    strBuilder.clear()
    println(list.addString(strBuilder, " ").toString()) // add to a StringBuilder with a separator

    println(list.contains(11))  //detect if the list contains the special value
    val list1 = List(1,1,1,1,1,2,3,4,5,6,7,8,9,0)
    list1.distinct //remove the duplicate elements in the list and return the result as a new List
    list1.dropRight(3) // drop the last 3 element
    list1.dropWhile(a => a == 3) // drop the element whose value meet the condition "value == 3"
    list1.drop(3)  // selects all the element except the first n elements and return the result as a new List
    println(list.forall(_ >= 10)) // if all the elements satisfied with the condition, return true


    list.foreach(a => print(a+1 + " "))  // apply the function to all elements of the list

    println("\nthe resule of List.intersect(List)")
    List(1,2,3,4).intersect(List(4,5,6,7)).foreach(a => print(a)) //get the intersection of two List
    println()

    //get the iterator of the List
    var iterator = list.iterator

    //get the Max and Min element
    println("the max value of the list : " + list.max)
    println("the min value of the list : "+ list.min)

    //transfer the list into a String
    println(list.mkString)
    println(list.mkString(", "))  // add a specator between two elements

    // sort the elements in the list
    val list2: List[Int] = List(5,6,7,1,2,3)
    print("\nbefore sort : " + list2.foreach(a => print(a)))
    val list3 = list2.sorted(math.Ordering.Int.reverse)
    println("\nafter sort (new List) : " +  list3.foreach(a => print(a)))

    // sort the list with a specific algorithm
    println("\nsort the list with a specific algorithm")
    list2.sortWith((a, b) => a > b).foreach(print)
    println()
    list2.sortWith((a, b) => a < b).foreach(print)

    //sum up all the elements' value
    println("\nthe sum of all the elements' value : " + list2.sum)


    // transfer to other Collection Type
    list1.toSeq // attension: do not use list.toXXX(), just list.XXX
    list.toSet
    list.toArray



  }
}
