package com

/**
  * Created by HuangDanGeeker on 2018/3/13.
  * Demo of Iterator Operation
  */
object IteratorDemo {


  def main(args: Array[String]): Unit = {
    // simple definition of Iterator
    val iterator = Iterator(1,2,3,4,5,6)
    val iter= Iterator(1,2,3,4,5,6)
    //remember the iterator can only be traveled once
    //remember the iterator can only be traveled once
    //remember the iterator can only be traveled once


    // there are two basic apis of Iterator
    // 1. next() : get next element of a Iterator
    // 1. hasNext() : check the Iterator can provide an another element
//    println("travel all the values of a Iterator")
//    while( iterator.hasNext){
//      print(iterator.next + " ")
//    }

    // get max/min value in the Iterator
//    println("\nget max value of the Iterator :" + iterator.max)
//    println("get min value of the Iterator :" + iterator.min)

    // concat two Iterators
    iterator.++(iter)

    // transfer an Iterator to a BufferedIterator
    val buffIterator : BufferedIterator[Int] = iterator.buffered

    // copyToArrays : copy the Iterator (selected values )to a Array
    val a1 : Array[Int] = new Array[Int](10)
    iterator.copyToArray(a1)
    iterator.copyToArray(a1, 1, 4)  // specific the start and end index


    // count(p) : return the number of elements that satisfied with the condition p
    println("count(true) : " + iterator.count(i => true))
    println("count( i => i > 2) : " + iterator.count(i => i > 3))

    // drop(n) :delete the first n elements
    a1.drop(1)

    // dropWhile(i => p(i)) : delete the elements from left to right while p(i) == false
    a1.dropWhile(i => i < 3)


    //forall(p) : check all the elements in the Iterator if satisfied with the condition 'p'
    println("all the elements in the iterator is >= 0 : " + iterator.forall(i => i >= 0))

    // isTraversableAgain : tests the iterator can be repeatedly traversed
    println("this Iterator can be repeatedly traveled : " +  iterator.isTraversableAgain)


    // patch(from: Int, patchElems: Iterator[B], replaced: Int)
    // return this Iterator with patched elements from 'from' index to 'form + replaced' index
    iterator.patch(0, iter, 2)

    // sameElements(iterator B) : check the iterator returns the same elements in order as B does
    println("the two iterator returns the same elements in order : "+iterator.sameElements(iter))
    println("the two iterator returns the same elements in order : "+iterator.sameElements(iterator))


    // slice() : return a part of an Iterator
    iterator.slice(0, 3)

    // take(n) :  take the first n elements into a new Iterator
    iterator.take(3)

    // toIterable : Returns an Iterable containing all elements of this traversable or iterator. This will not terminate for infinite iterators.
    iterator.toIterable

    // toIterator :  Returns an Iterator over the elements in this traversable or iterator.
    // Will return the same Iterator if this instance is already an Iterator.
    // This will not terminate for infinite iterators.
    iterator.toIterator


    //zip(Iterator B) : Creates an iterator formed from this iterator and another iterator
    // by combining corresponding values in pairs.
    // If one of the two iterators is longer than the other, its remaining elements are ignored.
    iterator.zip(iter)

    // zipWithIndex : Creates an iterator that pairs each element produced by this iterator
    // with its index, counting from 0.
    iterator.zipWithIndex





  }



}
