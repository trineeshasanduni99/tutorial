package tute7
object Q3 {
  
     def main( args: Array[String]) {

        val first_acc:Account = new Account( 200001, 50000.00 )
        val second_acc:Account = new Account( 200002, 75000.00 )
        val third_acc:Account = new Account( 200003, 24000.00 )

        println( first_acc.acc_no + " - \t" + first_acc.acc_balance )
        println( second_acc.acc_no + " - \t" + second_acc.acc_balance )
        println( third_acc.acc_no + " - \t" + third_acc.acc_balance )

        first_acc.transfer( second_acc, 20000 )

        println("\nAfter the money transaction : ")

        println( first_acc.acc_no + " - \t" + first_acc.acc_balance )
        println( second_acc.acc_no + " - \t" + second_acc.acc_balance )
        println( third_acc.acc_no + " - \t" + third_acc.acc_balance )

    }
     
    class Account( account_no:Int, account_balance:Double){
        val acc_no = account_no
        var acc_balance = account_balance

        def withdraw( amount:Double) = this.acc_balance - amount
        def deposit( amount:Double) = this.acc_balance + amount
        def transfer ( account:Account, amount:Double) = {
            this.acc_balance = this.acc_balance - amount
            account.acc_balance = account.acc_balance + amount
        }
        override def toString = "[ " + acc_no + " : " + acc_balance + " ]"
    }

  
}