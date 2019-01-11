package app.prototype;

public class Application {

    public static void main(String[] args) {
        Animal dog = new Dog("Alex");
        Animal copy = dog.makeCopy();

        System.out.println("Dog: " + ((Dog) dog).getName());
        System.out.println("Copy: " + ((Dog) copy).getName());
    }
}
