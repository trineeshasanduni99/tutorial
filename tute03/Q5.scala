package tute03

object Q5 {
  def main(args:Array[String]):Unit={
   var totTime=easypeace(2)+tempo(3)+easypeace(2)
   println("Total running time:"+totTime)  
  }
  
  def easypeace(x:Int):Int={
    return x*8
  }
  def tempo(y:Int):Int={
    return y*7
  }
}