package app.prototype;

public class Dog implements Animal {

    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public Animal makeCopy() {
        Dog dog = null;

        try {
            dog = (Dog) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return dog;
    }

    public String getName() {
        return name;
    }
}
