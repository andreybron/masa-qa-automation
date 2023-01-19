package lesson_9.person;

public class Student extends Person {

    double grade;

    public Student(String firstName, String lastName, int age, boolean isJewish, double grade) {
        super(firstName, lastName, age, isJewish);
        this.grade = grade;
    }

    public Student(double grade) {
        this.grade = grade;
    }

    @Override
    public void whatIsYourName() {
//        super.whatIsYourName();
        System.out.println("I am student,my name is " + getFirstName());
    }

    @Override
    public void whoAreYou() {
        System.out.println("I'm a student");
    }
}
