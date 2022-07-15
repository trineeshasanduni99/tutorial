package tute03

object Q2 {
  def main(args:Array[String]){
    temp();
  }
  def temp(){
    println("Enter temperature in celsius:")
    var TempInCel=scala.io.StdIn.readFloat()
  
    var far=(1.8000* TempInCel + 32)
    println("Temperature in Fahrenheit:"+far)
  }
}