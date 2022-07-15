package tute03

object Q4 {
  def main(args:Array[String]):Unit={
    println("Total Cost:"+TotalCost(60))
  }
  
  def CoverPrice(x:Int):Double={
    return 24.95*x
  }
  
  def discount(x:Int):Double={
    return 24.95*x*0.4
  }
  
  def afterdis(x:Int):Double={
    CoverPrice(x)-discount(x)
  }
  
  def shippingCost(x:Int):Double={
    if(x>50)
     (3*50) +(x-50)*0.75
    else
      3*x
  }
  
  def TotalCost(x:Int):Double={
    afterdis(x)+shippingCost(x)
  }
}