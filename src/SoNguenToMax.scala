import java.io._
import java.util.Scanner
object SoNguenToMax {
  // Answer
  def checkPrime(n: Int, i: Int): Boolean = {
    if (n == 1) {
      return false
    }
    if (n == 2) {
      return true
    }
    if (n % i == 0) {
      false
    }
    else if (i * i > n) {
      true
    }
    else {
      checkPrime(n, i + 1)
    }
  }

  def showPrime(m: Int): IndexedSeq[Int] = {
    for (i <- 1 to m
         if checkPrime(i, 2)) yield i
  }

  def maxPrime(n: Int): Int = {
    val result = showPrime(n).last
    result
  }

  def main(args: Array[String]): Unit = {
//    println( "anh")
    println(maxPrime(12))
  }
}


