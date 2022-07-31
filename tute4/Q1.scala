package tute4

object Q1 {
  def main(args:Array[String]):Unit={
   println("Enter amount:") 
   var amount=scala.io.StdIn.readInt();
   
   var intrst=interest(amount)
   println("Interest is:"+intrst);
    
    }
  def interest(x:Int):Double=x match{
    case x if(x<20000)=>x*0.02
    case x if(x<200000)=>x*0.04
    case x if(x<2000000)=>x*0.035
    case x if(x>=2000000)=>x*0.065
      
  }
}
    
  
