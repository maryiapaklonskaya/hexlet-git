public class Account {
//    Create   a    class    Account    class     with     balance     as     data    member.
//    Create     twoconstructors  (no argument, and two arguments)
//    and methods to withdraw and depositbalance.


    private double balance = 0;
    private String ownerName;

    public Account(double balance, String ownerName){
        this.balance = balance;
        this.ownerName = ownerName;
    }
    public Account(){
        this.balance = 0;
    }
    public void deposit(double deposit) {
        this.balance += deposit;
    }

    public void withdraw(double withdraw) {
        if(withdraw > balance) {
            System.out.println("no enough money");
        } else {
        this.balance -= withdraw;}
    }

    public double getBalance() {
        return balance;
    }




}
