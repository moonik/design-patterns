package app.state;

public class NoCash implements ATMState {

    private ATMMachine atmMachine;

    public NoCash(ATMMachine atmMachine) {
        this.atmMachine = atmMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("Can't insert another card!");
    }

    @Override
    public void ejectCard() {
        System.out.println("Card ejected");
        atmMachine.setATMState(atmMachine.getNoCardState());
    }

    @Override
    public void providePin(int pin) {
        System.out.println("You've already provided a PIN");
    }

    @Override
    public void requestCash(int amount) {
        System.out.println("We don't have money");
        atmMachine.setATMState(atmMachine.getNoCardState());
    }
}
