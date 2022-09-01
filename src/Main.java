import People.MenMain;
import People.WomenMain;

public class Main {
    public static void main(String[] args) {
//        Account myAccount = new Account();
//        Account yourAccount = new Account(123, "MaryiaP");
//
//        System.out.println(myAccount.getBalance());
//        System.out.println(yourAccount.getBalance());
//        myAccount.deposit(123);
//        yourAccount.deposit(1);
//        System.out.println(myAccount.getBalance());
//        System.out.println(yourAccount.getBalance());
//        yourAccount.withdraw(1335);
//        System.out.println(myAccount.getBalance());
//        System.out.println(yourAccount.getBalance());
//
//
//    }
        SetHour hour = new SetHour(20);
        SetMin min = new SetMin(25);
        SetSec sec = new SetSec(34);
        Time localTime = new Time(hour, min, sec);
        localTime.displayTime();


    }
}

