package tute4

object Q3 {
  def main(args:Array[String]):Unit={
    println(formatNames(name="Benny")()(toUpper(_)))
    println(formatNames(name="Niroshan")(id=1)(toUpper(_)))
    println(formatNames(name="Saman")()(toLower(_)))
    println(formatNames(name="Kumara")(id=5)(toUpper(_)))
  }
  def toUpper(name:String): String = {
   return name.toUpperCase()
 }

 def toLower(name: String): String = {
   return name.toLowerCase()
 }
 

 def formatNames(name: String)(id:Int*)(func: String => String): String = {
   if(id.isEmpty){
   func(name)
   }
   else{
     var temp=""
     var i=0
     while(i<name.length){
       if(id.contains(i)){
         temp=temp+func(name.charAt(i).toString)
       }
       else{
         temp=temp+name.charAt(i).toString
       }
       i=i+1
     }
    temp 
   }
   }
 
}