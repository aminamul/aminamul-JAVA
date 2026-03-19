public class example4 {
    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount("111",1000);
        s.deposit(500);
        s.withdraw(200);
        System.out.println("Баланс: " + s.balance);
    }
}

class BankAccount {
    String acc; double balance;
    BankAccount(String a,double b){ acc=a; balance=b; }

    void deposit(double x){
        balance += x;
        System.out.println("Пополнение на " + x);
    }

    void withdraw(double x){
        balance -= x;
        System.out.println("Снятие " + x);
    }
}

class SavingsAccount extends BankAccount {
    SavingsAccount(String a,double b){ super(a,b); }
}

class CreditAccount extends BankAccount {
    CreditAccount(String a,double b){ super(a,b); }
}
