package tute7

object Q2{
        class Rational ( nume:Int, deno:Int ){
        def numerator = nume
        def denominator = deno

        def neg = new Rational(-this.numerator, this.denominator)
        def sub(that:Rational) = new Rational( this.numerator*that.denominator - this.denominator*that.numerator, this.denominator*that.denominator )
        override def toString = numerator + "/" + denominator
    }

    def main( args: Array[String] ) = {

        print("Enter the numerator of x : ")
        var n1 = scala.io.StdIn.readInt()
        print("Enter the denominator of x : ")
        var d1 = scala.io.StdIn.readInt()
        val r1 = new Rational( n1, d1 )

        print("Enter the numerator of y : ")
        var n2 = scala.io.StdIn.readInt()
        print("Enter the denominator of y : ")
        var d2 = scala.io.StdIn.readInt()
        val r2 = new Rational( n2, d2 )

        print("Enter the numerator of z : ")
        var n3 = scala.io.StdIn.readInt()
        print("Enter the denominator of z : ")
        var d3 = scala.io.StdIn.readInt()
        val r3 = new Rational( n3, d3 )

        println("x-y-z : " + (r1.sub(r2.sub(r3))))

    }
}
