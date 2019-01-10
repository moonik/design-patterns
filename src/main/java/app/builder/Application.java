package app.builder;

public class Application {

    public static void main(String[] args) {
        Person person = new Person.PersonBuilder()
                .age(10)
                .firstName("Roman")
                .secondName("Mysan")
                .build();

        System.out.println(person.getFirstName());
    }
}
