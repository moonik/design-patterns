package app.state;

public class Application {

    public static void main(String[] args) {
        ATMMachine atmMachine = new ATMMachine();
        atmMachine.insertCard();
        atmMachine.providePin(111);
        atmMachine.insertCard();
        atmMachine.providePin(1111);
        atmMachine.requestCash(100);
    }
}
