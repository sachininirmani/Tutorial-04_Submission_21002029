/*  3. Write a Scala program which defines a method named "toUpper" and it accepts a String as
input parameter that is then formatted to upper case as output. Define another method named
"toLower'' which accepts a String as input parameter and formats the input to lower case as
output. Define another method named "formatNames" which also has an input String called
"name". This method however has a parameter group which accepts a function with an input of
type String and also outputs a String. This particular function will be used to apply the given
format to the "name" input. You can use the test inputs for, say, "Benny", "Niroshan", "Saman"
“Kumara”, and make sure that the output is as shown below.
Output:
BENNY
NIroshan
saman
KumarA */

import scala.io.StdIn

object q_03 {
  def main(args : Array[String]) : Unit = {
    //println(toUpper("Hello"))
    //println(toLower("HelloABC!!!"))
    println(formatNames("Benny", toUpper))
    println(formatNames("Ni", toUpper) + formatNames("roshan", toLower))
    println(formatNames("Saman", toLower))
    println(formatNames("K", toUpper) + formatNames("umar", toLower) + formatNames("a", toUpper))
  }

  def toUpper(my_string :String) :String = {
    var Upper_str :String = ""

    for(i <- my_string){
      if (i.toInt > 96) Upper_str += (i.toInt - 32).toChar
      else Upper_str += i
    }
    Upper_str
  }

  def toLower(my_string :String) :String = {
    var Lower_str :String = ""

    for (i <- my_string){
      if (i.toInt > 64 && i.toInt < 97) Lower_str += (i.toInt + 32).toChar
      else Lower_str += i
    }
    Lower_str
  }

  def formatNames(name :String, format_func :(String) => String) :String = {
    format_func(name)
  }


}
