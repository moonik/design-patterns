package app.facade;

public class BankAccountFacade {

    private int account;
    private int securityCode;
    private AccountNumberCheck accountNumberCheck;
    private SecurityCodeCheck securityCodeCheck;
    private FundsCheck fundsCheck;

    public BankAccountFacade(int account, int securityCode) {
        this.account = account;
        this.securityCode = securityCode;
        this.accountNumberCheck = new AccountNumberCheck();
        this.securityCodeCheck = new SecurityCodeCheck();
        this.fundsCheck = new FundsCheck();
    }

    public void withdraw(double amount) {
        if (!accountNumberCheck.isAccountActive(account)) {
            System.out.println("Account number is not active.");
            return;
        }
        if (!securityCodeCheck.isSecurityCodeValid(securityCode)) {
            System.out.println("Security code is not active.");
            return;
        }
        if (!fundsCheck.haveEnoughMoney(amount)) {
            System.out.println("You don't have enough money.");
            return;
        }
        fundsCheck.withdraw(amount);
    }

    public void deposit(double amount) {
        if (!accountNumberCheck.isAccountActive(account)) {
            System.out.println("Account number is not active.");
            return;
        }
        if (!securityCodeCheck.isSecurityCodeValid(securityCode)) {
            System.out.println("Security code is not active.");
            return;
        }
        fundsCheck.deposit(amount);
    }
}