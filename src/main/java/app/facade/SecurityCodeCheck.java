package app.facade;

public class SecurityCodeCheck {

    private int code = 123;

    public int getCode() {
        return code;
    }

    public boolean isSecurityCodeValid(int code) {
        return this.code == code;
    }
}
