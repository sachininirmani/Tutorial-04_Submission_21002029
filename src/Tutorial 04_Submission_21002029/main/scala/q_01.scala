//Develop the function of interest. It consumes a deposit amount and produces the actual
//amount of interest that the money earns in a year. The bank pays a flat 2% for deposits of up to
//Rs. 20 000, a flat 4% per year for deposits of up to Rs. 200000, a flat 3.5% per year for deposits
//of up to Rs. 2000000, and a flat 6.5% for deposits of more than Rs. 200000.
import scala.io.StdIn.readInt
object q_01 {
  def main(args:Array[String]) : Unit = {
    println("Enter the deposit amount -   ");
    val dep = readInt()
    println("The interest is - " + interest(dep))

  }

  def interest(deposit_amount :Int) : Double = deposit_amount match {
    case x if x < 20000 => x * 0.02
    case x if x < 200000 => x * 0.04
    case x if x < 2000000 => x * 0.035
    case x if x >= 2000000 => x * 0.065

  }

}
