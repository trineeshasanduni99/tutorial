package tute03
object Q1 {
  def main(args:Array[String]){
    Area();
  }
  
  def Area(){
    var r:Double=0;
    var area:Double=0;
    var pi=3.14;
    println("Enter the r:");
    r=scala.io.StdIn.readInt();
    
    area=pi*r*r;
    println("Area of a disk: "+area); 
    }
}