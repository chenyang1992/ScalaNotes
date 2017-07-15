// If you send only a few arguments, then you get back a partially applied function. 
// This gives you the convenience of binding some arguments and leaving the rest to be filled in later.

// We can eliminate the noise of passing the date to each call by partially applying that argument to the log( ) method. 
// To do so, we first bind a value to the date parameter and leave the second parameter unbound by putting an underscore at its place. 
// The result is a partially applied function that we've stored in a variable.

import java.util.Date

object PartiallyApplied {
   def main(args: Array[String]) {
      val date = new Date
      val logWithDateBound = log(date, _ : String)

      logWithDateBound("message1" )
      Thread.sleep(1000)
      
      logWithDateBound("message2" )
      Thread.sleep(1000)
      
      logWithDateBound("message3" )
   }

   def log(date: Date, message: String) = {
      println(date + "----" + message)
   }
}