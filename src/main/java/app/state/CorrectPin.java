package app.state;

public class CorrectPin implements ATMState {

    private ATMMachine atmMachine;

    public CorrectPin(ATMMachine atmMachine) {
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
        if (atmMachine.getCash() > amount) {
            System.out.println("You got " + amount + "$");
            atmMachine.setCash(atmMachine.getCash()-amount);
            System.out.println("Card ejected");
            atmMachine.setATMState(atmMachine.getNoCardState());

            if (atmMachine.getCash() == 0) {
                atmMachine.setATMState(atmMachine.getAtmOutOfMoneyState());
            }
        } else {
            System.out.println("Not enough money");
            System.out.println("Card ejected");
            atmMachine.setATMState(atmMachine.getNoCardState());
        }
    }
}
