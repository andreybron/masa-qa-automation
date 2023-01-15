package lesson_7.homework;

import java.util.Scanner;

public class Cat {
    private String name;
    private String color;
    private int age;
    private Scanner input;

    public Cat(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        while (age < 0 || age > 50) {
            System.out.println("Error! For cat \' " + name + " \' age out of range! Input manual:");
            input = new Scanner(System.in);
            age = input.nextInt();
        }
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
}

//Создайте класс Cat.
//У класса будут 3 поля: name, color, age.
//Создайте конструктор.
//Создайте getters, setters.
//Создайте toString()