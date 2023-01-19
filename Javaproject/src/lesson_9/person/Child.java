package lesson_9.person;

public class Child extends Person {
    public Child(String firstName, String lastName, int age, boolean isJewish) {
        super(firstName, lastName, age, isJewish);
    }

    @Override
    public void whoAreYou() {
        System.out.println("I'm a child");
    }

    @Override
    public void whatIsYourName() {
        super.whatIsYourName();
    }
}
