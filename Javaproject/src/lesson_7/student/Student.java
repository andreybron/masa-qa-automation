package lesson_7.student;

import java.util.Scanner;

public class Student {

    String name;
    int age;
    public Scanner input;

    public Student(String name, int age) {
        while (age < 18 || age > 150) {
            System.out.println("Error! For student " + name + " age out of range! Input manual:");
            input = new Scanner(System.in);
            age = input.nextInt();
        }
        input.close();
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
