package tute8

object Q1  extends App{
  var a= point(1,2)
  var b= point(4,10)
  
  println(a.add(b))
  
  b.move(x=2,y=4)
  println(b)
  
  var c= a.distance(b)
  println(c)
  
  a.invert()
  println(a)
}

case class point(var x:Int, var y:Int){
    def add(a:point)= new point (this.x+a.x, this.y+a.y)
    
    def move(x:Int, y:Int):Unit ={
      this.x = this.x+x
      this.y = this.y+y
    }
    
    def distance(a:point):Double={
      var xDist:Int=this.x-a.x
      var yDist:Int=this.y-a.y
      var Dist:Int=xDist*xDist + yDist* yDist
      scala.math.sqrt(Dist)
    }
    
    def invert():Unit= {
      var tmp=this.x
      this.x = this.y
      this.y= tmp
    }
}