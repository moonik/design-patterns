package app.delegate;

public class Cat {

    private Sound sound;

    public Cat() {
        this.sound = new MeowSound();
    }

    public void makeSound() {
        //delegation
        sound.makeSound();
    }
}
