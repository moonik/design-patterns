package app.state;

public class NoCard implements ATMState {

    private ATMMachine atmMachine;

    public NoCard(ATMMachine atmMachine) {
        this.atmMachine = atmMachine;
    }

    @Override
    public void insertCard() {
        atmMachine.setATMState(atmMachine.getHasCardState());
        System.out.println("Enter PIN");
    }

    @Override
    public void ejectCard() {
        System.out.println("There is no card inside!");
    }

    @Override
    public void providePin(int pin) {
        System.out.println("There is no card inside!");
    }

    @Override
    public void requestCash(int amount) {
        System.out.println("There is no card inside!");
    }
}
