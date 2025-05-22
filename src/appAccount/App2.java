package appAccount;

public class App2 {

    public static void main(String[] args) {

        Account a = new Account();
        a.balance = 100;

        if (a.deposit(-100)) {
            System.out.println("Ops, depósito inválido");
        }
        a.printBalance();

        a.deposit(300);

        if (!a.withdraw(-50)){
            System.out.println("Ops, Saque inválido");
        }

        a.printBalance();
    }
}
