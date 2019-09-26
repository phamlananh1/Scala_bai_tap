//import java.io._

object VietTat {
  // Answer
  def abbreviation(a: String, b: String): Boolean = {
    var check:String = ""
    for(i<-0 until a.length)  {
      if(b.contains(a(i).toUpper)) {
        check += a(i)
      }
      else if(a(i).toChar >= 65 && a(i).toChar<=90) return false
    }
    if(check.toUpperCase.equals(b)) return true
    else false
  }

  def main(args: Array[String]) {
    val a = scala.io.StdIn.readLine
    val b = scala.io.StdIn.readLine
    println(abbreviation("UMKFW", "UMKFW"))
  }
}
