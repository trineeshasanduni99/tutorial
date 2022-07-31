package tute4

object q2 {
  
def main(args :Array[String]):Unit={
   println("Enter no:") 
   var num=scala.io.StdIn.readInt();
   
   pattern(num)
}

def pattern(x:Int)=x match{
 
  case x if x == 0 => println("Negative/Zero is input")
  case x if x % 2 == 0 => println("Even number is given")
  case x if x % 2 != 0 => println("Odd number is given")
}
}


