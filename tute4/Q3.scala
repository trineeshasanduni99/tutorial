package tute4

object Q3 {
  def main(args:Array[String]):Unit={
    println(formatNames(name="Benny")(toUpper(_)))
    println(formatNames(name="Ni")(toUpper(_))+formatNames(name="roshan")(toLower(_)))
    println(formatNames(name="Saman")(toLower(_)))
    println(formatNames(name="K")(toUpper(_))+formatNames(name="umar")(toLower(_))+formatNames(name="a")(toUpper(_)))
  }
  def toUpper(name:String): String = {
   return name.toUpperCase()
 }

 def toLower(name: String): String = {
   return name.toLowerCase()
 }

 def formatNames(name: String)(func: String => String): String = {
   
   func(name)
   }
 
}