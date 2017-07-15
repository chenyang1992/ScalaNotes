// times() contain a loop transaction that will execute the given statement in number of times that we give.

object Run {
   implicit class IntTimes(x: Int) {
      def times [A](f: =>A): Unit = {
         def loop(current: Int): Unit =
         
         if(current > 0){
            f
            loop(current - 1)
         }
         loop(x)
      }
   }
}