package lesson_7.homework;

import java.util.ArrayList;
public class MCat {
    public static void main(String[] args) {

        ArrayList<Cat> catsList = new ArrayList<>();
        catsList.add(new Cat("mr.Black", "black", 4));
        catsList.add(new Cat("mrs.White", "white", 5));
        catsList.add(new Cat("FOX", "orange", 3));
        catsList.add(new Cat("Brita", "grey", 1));
        catsList.add(new Cat("Submarine", "yellow", -5));

        catsList.forEach(cat -> System.out.println(cat));
    }
}

//Создайте класс MCats и создайте метод main.
//Создайте список из 5 котов.
//Создайте цикл который пройдется по списку и напечатает информацию о каждом котенке.