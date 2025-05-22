package appAccount;

public class AppTest {

    public static void main(String[] args) {

        Account a = new Account();
        a.accountOwner = "Júnior";
        a.accountNumber = "1234-6";
        a.balance = 100.00;

        Account b = new Account();
        b.accountOwner = "Érika";
        b.accountNumber = "5432-6";
        b.balance = 100.00;

        System.out.println("Saldo inicial:");
        a.printBalance();
        b.printBalance();

        a.transfer(45, b);

        System.out.println(" ");
        System.out.println();
        System.out.println("Saldo final:");
        a.printBalance();
        b.printBalance();

    }
}
