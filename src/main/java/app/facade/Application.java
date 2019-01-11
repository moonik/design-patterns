package app.facade;

public class Application {

    public static void main(String[] args) {
        BankAccountFacade bank = new BankAccountFacade(123, 123);
        bank.deposit(1);
        bank.withdraw(1000000000);
    }
}
