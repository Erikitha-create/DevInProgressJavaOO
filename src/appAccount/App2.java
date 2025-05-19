package appAccount;

public class App2 {

    public static void main(String[] args) {

        Account a = new Account();
        a.balance = 100;
        a.deposit(100);
        a.deposit(300);
        a.printBalance();
    }
}
