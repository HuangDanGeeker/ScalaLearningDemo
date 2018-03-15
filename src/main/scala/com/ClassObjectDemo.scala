package com

/**
  * Created by HuangDanGeeker on 2018/3/15.
  * Demo of Class-Object Operation
  */
object ClassObjectDemo {

  def main(args: Array[String]): Unit = {
    // get an Object of Class 'Point'
    val point = new Point(1,1)
    point.move(2,1)
    println("Point.detail :")
    point.detail

    val location = new Location(1, 2, 3)
    location.move(2,2,2)
    println("Location.detail :")
    location.detail

    println()
    // Type Checking
    if(point.isInstanceOf[Point])
      println("point is the instance of Point")
    else{
      println("point is   NOT the instance of Point")
    }

    if(point.getClass == location.getClass)
      println("point.getClass == location.getClass")
    else{
      println("point.getClass != location.getClass")
    }

    //using 'ClassOf[T]'
    if(location.getClass == classOf[Location])
      println("location.getClass == classOf[Location]")
    else{
      println("location.getClass != classOf[Location]")
    }








    // anonymous sub-class
    var student = new Person("HuangDan"){
      def getAge : String =  "My age is " + 12
    }
    introduction(student)



    // 构造顺序 && 提前定义
    //please referring to https://www.cnblogs.com/one--way/p/5806604.html
  }

  def introduction(p : Person{def getAge : String}): Unit = {
    println("My name is " + p.name + " and " + p.getAge)
  }
}


// define a class
// the arg 'xp' && 'yp' can be used all the time in the class
class Point(xp : Int, yp : Int){

  var x : Int = xp
  var y : Int = yp

  final def move(dx : Int, dy : Int): Unit = {
    x = x + dx
    y = y + dy

    print("Moving Point : \nx 的坐标值为 :　" + x)
    println(", y 的坐标值为 :　" + y)


    // we can get the args 'xp' && 'yp' here
    print("\nget the initial args in the internal method : ")
    println("xp == "+xp+", yp == "+yp)
  }


  def detail: Unit = {
    println("Point("+x+", "+y+")")

  }
}

// Class inherit, can and only can inherit one parent class
// scala class can also inherit java's class
class Location(xp : Int, yp : Int, zp : Int)
  extends Point(xp, yp){

  //override the attribution
  //override var x = 123
  var z = zp

  def move(dx: Int, dy: Int, dz : Int): Unit = {
    x = dx
    y = dy
    z = dz

    println("Moving Location :\n\tx 的坐标为 " + x + ", y 的坐标为 " + y + ", z的坐标为 " + z)
  }

  // override a not 'final' method
  override def detail: Unit = {
    //use super to present the parent class
    print("parent class detail : ") ; super.detail
    println("Location("+x+", "+y+", "+z+")")
  }
}



class Person(val name : String){}

