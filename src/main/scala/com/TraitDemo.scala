package com

/**
  * Created by HuangDanGeeker on 2018/3/15.
  * Demo of trait in scala
  *
  */
object TraitDemo {

  // trait is much like the 'abstract class' and interface in java 1.8

  def main(args: Array[String]): Unit = {
    val collegeStudent = new CollegeStudent(20)
    println(collegeStudent.isStudent)
    println(collegeStudent.selfIntroduction())
  }
}

// define a trait
trait People{
  var name : String = ""
  var age : Int = -1
  def isAdult = age > 20 && age <= 42
  def isNotAdult = !isAdult
}

// another trait
trait Student{
  var classNo : String = ""
  var rank : Int = -1
  def isStudent = true
}


// not like the Class Inherit, one class can extends as many traits as it needs
class CollegeStudent(age1 : Int) extends People with Student{

  age = age1
  classNo = "计科1502"
  rank = 10
  name = "HuangDan"
  override def isStudent: Boolean = {
    return this.age >= 19 && this.age <= 22
  }

  def selfIntroduction() : String ={
    return "name :" + name + ", age : " +age + ", classNo : " +classNo + ", rank : " + rank
  }

}