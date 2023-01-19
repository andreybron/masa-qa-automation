package lesson_9.person;

import java.util.ArrayList;
import java.util.List;

public class MyPersons {
    public static void main(String[] args) {

//        Person person = new Person();
//        Person person;
//        person.whoAreYou();
//        System.out.println("person = " + person);

        Student student = new Student("Andrey", "Bro", 33, true, 99.9);
        student.whatIsYourName();
        System.out.println("student = " + student);
        System.out.println("student.getAge() = " + student.getAge());
        Child child = new Child("Alex", "Komanov", 34, true);
        Person childPerson = new Child("person", "child", 45, false);
        child.whoAreYou();
        childPerson.whoAreYou();

        System.out.println("***");
        List<Person> list = new ArrayList<>();
        list.add(student);
        list.add(child);
        list.add(childPerson);

        list.forEach(who -> who.whoAreYou());
    }
}
