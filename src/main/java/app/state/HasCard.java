package app.state;

public class HasCard implements ATMState {

    private ATMMachine atmMachine;

    public HasCard(ATMMachine atmMachine) {
        this.atmMachine = atmMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("You can't enter more than one card");
    }

    @Override
    public void ejectCard() {
        System.out.println("Card ejected.");
        atmMachine.setATMState(atmMachine.getNoCardState());
    }

    @Override
    public void providePin(int pin) {
        if (pin == 1111) {
            System.out.println("Correct PIN.");
            atmMachine.setCorrectPinEntered(true);
            atmMachine.setATMState(atmMachine.getHasCorrectPinState());
        } else {
            System.out.println("Wrong PIN.");
            atmMachine.setCorrectPinEntered(false);
            atmMachine.setATMState(atmMachine.getNoCardState());
        }
    }

    @Override
    public void requestCash(int amount) {
        System.out.println("Enter PIN");
    }
}
