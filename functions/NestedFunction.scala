
// We can define functions inside a function and functions defined inside other functions are called local functions. Here is an implementation of a factorial calculator, where we use a conventional technique of calling a second, nested method to do the work.

object NestedFunction {
   def main(args: Array[String]) {
      println( factorial(0) )
      println( factorial(1) )
      println( factorial(2) )
      println( factorial(3) )
   }

   def factorial(i: Int): Int = {
      def fact(i: Int, accumulator: Int): Int = {
         if (i <= 1)
            accumulator
         else
            fact(i - 1, i * accumulator)
      }
      fact(i, 1)
   }
}