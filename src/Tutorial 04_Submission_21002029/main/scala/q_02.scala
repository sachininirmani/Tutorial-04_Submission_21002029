//2. Write a program in PatternMatching, takes the integer input from the command line. Based
//on the input, write a code using match to print Negative/Zero is input when input is less than or
//equal to 0.Print Even number is given when input is even, and print Odd number is given when
//input is odd.
import scala.io.StdIn.readInt
object q_02 {
  def main(args: Array[String]): Unit = {
    println("Enter the number -   ");
    val num = readInt()
    println(check(num))

  }

  def check(number: Int): String = number match {
    case x if x <= 0 => "Negative/Zero"
    case x if x%2 == 0 => "Even number is given"
    case x if x%2 != 0 => "Odd number is given"

  }
}
