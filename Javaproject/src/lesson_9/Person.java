package lesson_9;

public class Person {

    private String firstName;
    private String lastName;
    private int age;
    private boolean isJewish;

    public Person(String firstName, String lastName, int age, boolean isJewish) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.isJewish = isJewish;
    }

    public Person() {
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public boolean isJewish() {
        return isJewish;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", isJewish=" + isJewish +
                '}';
    }

    public void whatIsYourName() {
        System.out.println("My name is " + firstName + " " + lastName + "");
    }
}
