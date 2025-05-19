package appAccount;

public class Account {

    String accountNumber;
    String accountOwner;
    double balance;

    void printBalance () {
        System.out.println("Balance: R$ " + balance);
    }

    void deposit(double amount) {
        balance += amount;
    }
}
