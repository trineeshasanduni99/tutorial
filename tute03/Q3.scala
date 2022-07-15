package tute03

object Q3 {
   def main(args:Array[String]){
    Volume();
  }
  
  def Volume(){
    var r:Double=0;
    var volume:Double=0;
    var pi=3.14;
    println("Enter the r:");
    r=scala.io.StdIn.readInt();
    
    volume=( 4*pi*r*r*r)/3;
    println("Volume of a sphere: "+volume); 
    }
}