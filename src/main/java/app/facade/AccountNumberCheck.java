package app.facade;

public class AccountNumberCheck {

    private int account = 123;

    public int getAccount() {
        return account;
    }

    public boolean isAccountActive(int acc) {
        return account == acc;
    }
}
