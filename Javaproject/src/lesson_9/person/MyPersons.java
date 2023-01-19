package lesson_9.person;

public class MyPersons {
    public static void main(String[] args) {

//        Person person = new Person();
        Person person;
        person.whoAreYou();
//        System.out.println("person = " + person);

        Student student = new Student("Andrey", "Bro", 33, true, 99.9);
        student.whatIsYourName();
        System.out.println("student = " + student);
        System.out.println("student.getAge() = " + student.getAge());
    }
}
