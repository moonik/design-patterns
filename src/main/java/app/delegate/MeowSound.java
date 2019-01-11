package app.delegate;

public class MeowSound implements Sound {

    @Override
    public void makeSound() {
        System.out.println("Meow meow..");
    }
}
