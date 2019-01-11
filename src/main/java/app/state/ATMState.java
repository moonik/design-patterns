package app.state;

public interface ATMState {
    void insertCard();
    void ejectCard();
    void providePin(int pin);
    void requestCash(int amount);
}
