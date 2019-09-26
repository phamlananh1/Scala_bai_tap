import java.io._

object Tong {
  def sumAll(a: Int, b: Int): Int = {
    var sum = 0
    if (a<b) {
      for(i <- a to b ){
        sum += i
      }
    } else {
      for(i <- b to a ){
        sum += i
      }
    }
    sum
  }
  // Main Method
  def main(args: Array[String])
  {
    println(sumAll(5, 3))
  }
}



//object anh {
//
//  def sumAll(a: Int, b: Int): Int = {
//    var sum = 0
//    var c = 0
//    var d = 0
//    if (a < b) {
//      c = a
//      d = b
//    } else {
//      c = b
//      d = a
//    }
//    for (i <- c to d) {
//      sum += i
//    }
//    sum
//  }
//
//  // Main Method
//  def main(args: Array[String]) {
//    // prints Hello World
//    println(sumAll(1, 2))
//  }
//}