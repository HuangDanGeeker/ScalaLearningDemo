package com
import Array._
/**
  * Created by HuangDanGeeker on 2018/3/11.
  * Demo about Array operation
  */
object ArrayDemo {

  //definition of array
  val arr1 = new Array[Int](3)
  val arr2 : Array[Int] = new Array[Int](3)

  def main(args: Array[String]): Unit = {

    //use the element by index
    arr1(0) = 0
    arr1(1) = 1
    arr1(2) = 1

    // travel the elements in the array
    println("travel the elements in the array and print")
    var a = 0
    for(a <- arr1){
      println(a)
    }

    //two dimensions array
    println("travel the elements in  a two-dimension array and print")
    val arr = ofDim[Int](3, 3)
    val row : Int = 0
    val col : Int = 0
    for(row <- 0 until 3){
      for(col <- 0 until 3){
        arr(row)(col) = row * col
        print(arr(row)(col) + " ")
      }
      println()
    }

    // concat two arrays
    println("concat two arrays")
    arr1(0) = 1
    arr1(1) = 2
    arr1(2) = 3
    arr2(0) = 4
    arr2(1) = 5
    arr2(2) = 6
    println("travel the concated array and print")
    var arr3 = concat(arr1, arr2)
    for(a <- arr3){
      print(a + " ")
    }

    // create arrays using range() to simplify the definition
    val arr4 : Array[Int] = range(20, 30, 2)
    val arr5 : Array[Int] = range(20, 30) //the third arg in definited to be 1 as default
    println("\nprint the values in the arr4 \n  created by range(start, end, step)")
    for(a <- arr4){
      print(a + " ")
    }
    println("print the values in the arr5 \n  created by range(start, end) using the default step")
    for(a <- arr5){
      print(a + " ")
    }


    // fill the array with appointed value and length while created
    println("\ncreate and travel the array created by 'fill(lenght)(value)'")
    var arr6 = fill[Int](3)(10) //this will create a array whose elements' value is 10 and whose length is 3
    for(a <- arr6){
      print(a +" ")
    }
    println("\nwe can also use fill(n1, n2)(value) to create a two-dimension arary\n")


    //'tabulate' create a array whose elememt's value is relative to its' index
    println("create a array whose elememt's value is relative to its' index")
    val arr7 = tabulate(5)(a => a+1)  //tabulate(5)(_ + 1)
    val arr8 = tabulate(5)(a => a*2)  //tabulate(5)(_ * 2)
    println("the result of tabulate(5)(a => a+1)\n arr[index] == index + 1")
    for(a <- arr7){
      print(a + " ")
    }
    println("\nthe result of tabulate(5)(a => a*2)\n  arr[index] == index * 2")
    for(a <- arr8){
      print(a + " ")
    }
    println("\nresult of using 'tabulate(5,5)((a, b) => a+b)' to create a two-dimension array")
    val arr9 = tabulate(5,5)((a, b) => a+b)
    for(row <- 0 until 5){
      for(col <- 0 until 5){
        print(arr9(row)(col) + " ")
      }
      println()
    }
    println(" it's much same that creating a heigher dimension array,\n such as 4-dimension array : tabulate(3,3,3)((a,b,c) => a+b+c)\n")


    //iterate(start, len)(func)

    println("use 'iterate(start, len)(func)' to crate a array whose length is 'len' and element value is relative to 'start' and 'func'\n it's much same to 'tabulate(len)(func)'\n arr[index] = func(arr[indedx-1]) and arr[0] = start)")
    var arr10 = iterate(4, 5)(_ * 3)
    for(a <- arr10){
      print(a + " ")
    }


  }

}
