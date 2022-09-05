import scala.io.StdIn

object Q1new {
 
  val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
  
  //c==charactor key=no of shift  a=alphabet
  val Encrypt =(c:Char,key:Int,a:String)=>a((a.indexOf (c.toUpper)+key)%a.size)
  
    
  val Decrypt =(c:Char,key:Int,a:String)=>a((a.indexOf (c.toUpper)-key)%a.size)  
    
  val cipher=(algo:(Char , Int ,String)=>Char,s:String,key:Int ,a:String)=> s.map(algo(_,key,a))
      
   
    def main(args:Array[String])={
        printf("Enter a text : ")
        var text = scala.io.StdIn.readLine()
        
        val  ct=cipher(Encrypt,text,5,alphabet)
        println(ct)
   
        val  pt=cipher(Decrypt,ct,5,alphabet)
        println(pt)
}
}