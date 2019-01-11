package app.state;

public class ATMMachine {

    private ATMState hasCard;
    private ATMState noCard;
    private ATMState hasCorrectPin;
    private ATMState atmOutOfMoney;
    private ATMState atmState;

    private int cash = 1000;
    private boolean correctPinEntered = false;

    public ATMMachine() {
        this.hasCard = new HasCard(this);
        this.noCard = new NoCard(this);
        this.hasCorrectPin = new CorrectPin(this);
        this.atmOutOfMoney = new NoCash(this);
        this.atmState = noCard;
    }

    public void setATMState(ATMState state) {
        this.atmState = state;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }

    public void insertCard() {
        this.atmState.insertCard();
    }

    public void ejectCard() {
        this.atmState.insertCard();
    }

    public void providePin(int pin) {
        this.atmState.providePin(pin);
    }

    public void requestCash(int amount) {
        this.atmState.requestCash(amount);
    }

    public ATMState getHasCardState() {
        return hasCard;
    }

    public ATMState getNoCardState() {
        return noCard;
    }

    public ATMState getHasCorrectPinState() {
        return hasCorrectPin;
    }

    public ATMState getAtmOutOfMoneyState() {
        return atmOutOfMoney;
    }

    public boolean isCorrectPinEntered() {
        return correctPinEntered;
    }

    public void setCorrectPinEntered(boolean correctPinEntered) {
        this.correctPinEntered = correctPinEntered;
    }

    public int getCash() {
        return cash;
    }
}
