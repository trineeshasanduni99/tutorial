package tute7

object Q4{

      class Account( account_no:Int, account_balance:Double){
        val acc_no = account_no
        var acc_balance = account_balance

        def withdraw( amount:Double) = this.acc_balance - amount
        def deposit( amount:Double) = this.acc_balance + amount
        def transfer ( account:Account, amount:Double) = {
            this.acc_balance = this.acc_balance - amount
            account.acc_balance = account.acc_balance + amount
        }
        def show_account = (acc_no, acc_balance);
        override def toString = "[ " + acc_no + " : " + acc_balance + " ]"
    }

    var bank_accounts:List[Account] = List[Account]();
    
    val show_accounts = (account_list:List[Account]) => account_list.map((account) => account.show_account)

    val overdraft_accounts = (account_list:List[Account]) => account_list.filter(account => account.acc_balance < 0.0).map((acc) => acc.show_account)

    val total_balance = (account_list:List[Account]) => account_list.foldLeft(0.0)((x, y) => x + y.acc_balance) 

    val individual_balance = (account_list:List[Account]) => account_list.map((x) => x.acc_balance) 

    val calculate_interest = (account_list:List[Account]) => account_list.map(account => if(account.acc_balance > 0) account.acc_balance*0.05 else account.acc_balance*0.1) 

    def main(args: Array[String]) = {
        
        val first_acc:Account = new Account( 200001, 50000.00 )
        val second_acc:Account = new Account( 200002, 75000.00 )
        val third_acc:Account = new Account( 200003, -1000.00 )

        bank_accounts = bank_accounts:+first_acc:+second_acc:+third_acc;

        println("\nAll Accounts :")
        println(show_accounts(bank_accounts))

        println("\nAccounts with overdraft : ")
        println(overdraft_accounts(bank_accounts))

        println("\nSum of all account balances : " + total_balance(bank_accounts))

        val l1 = calculate_interest(bank_accounts);
        val l2 = individual_balance(bank_accounts)
        val l3 = l2.zipAll(l1, 0, 0).map{ case (a:Double,b:Double) => a+b }
        println("\nBalance after calculating the interest : ")
        println(l3)
    }
}