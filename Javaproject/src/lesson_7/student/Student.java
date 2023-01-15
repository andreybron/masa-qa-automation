package lesson_7.student;

import java.util.Scanner;

public class Student {

    private String name;
    private int age;
    private Scanner input;

    public Student(String name, int age) {
        while (age < 18 || age > 150) {
            System.out.println("Error! For student " + name + " age out of range! Input manual:");
            input = new Scanner(System.in);
            age = input.nextInt();
        }
//        input.close();
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        while (age < 18 || age > 150) {
            System.out.println("Error! For student " + name + " age out of range! Input manual:");
            input = new Scanner(System.in);
            age = input.nextInt();
        }
//        input.close();
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
