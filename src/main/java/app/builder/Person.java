package app.builder;

public class Person {

    private String firstName;
    private String secondName;
    private int age;
    private Character gender;
    private String country;
    private String city;

    private Person(String firstName, String secondName, int age, Character gender, String country, String city) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        this.gender = gender;
        this.country = country;
        this.city = city;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public int getAge() {
        return age;
    }

    public Character getGender() {
        return gender;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public static class PersonBuilder {
        private String firstName;
        private String secondName;
        private int age;
        private Character gender;
        private String country;
        private String city;

        public PersonBuilder() {}

        public PersonBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public PersonBuilder secondName(String secondName) {
            this.secondName = secondName;
            return this;
        }

        public PersonBuilder age(int age) {
            this.age = age;
            return this;
        }

        public PersonBuilder gender(Character gender) {
            this.gender = gender;
            return this;
        }

        public PersonBuilder country(String country) {
            this.country = country;
            return this;
        }

        public PersonBuilder city(String city) {
            this.city = city;
            return this;
        }

        public Person build() {
            return new Person(firstName, secondName, age, gender, country, city);
        }
    }
}
