package app.facade;

public class FundsCheck {

    private double funds = 100000.00;

    public double getFunds() {
        return funds;
    }

    public void decreaseCash(double amount) {
        funds -= amount;
    }

    public void increaseCash(double amount) {
        funds += amount;
    }

    public boolean haveEnoughMoney(double amount) {
        return funds > amount;
    }

    public void deposit(double amount) {
        increaseCash(amount);
        System.out.println("Deposit completed, current balance is: " + getFunds());
    }

    public void withdraw(double amount) {
        decreaseCash(amount);
        System.out.println("Withdraw completed, current balance is: " + getFunds());
    }
}
