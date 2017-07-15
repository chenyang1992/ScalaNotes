// A call-by-name mechanism passes a code block to the call and each time the call accesses the parameter, the code block is executed and the value is calculated.

object CallByName {
   def main(args: Array[String]) {
        delayed(time());
   }

   def time() = {
      println("Getting time in nano seconds")
      System.nanoTime
   }
   def delayed( t: => Long ) = {
      println("In delayed method")
      println("Param: " + t)
   }
}