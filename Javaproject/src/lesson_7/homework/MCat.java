package lesson_7.homework;

public class MCat {
    public static void main(String[] args) {

        Cat firstCat = new Cat("mr.Black", "black", 7);
        System.out.println("firstCat = " + firstCat);
        firstCat.setAge(-1);
        System.out.println("firstCat.getAge() = " + firstCat.getAge());
    }
}

//Создайте класс MCats и создайте метод main.
//Создайте список из 5 котов.
//Создайте цикл который пройдется по списку и напечатает информацию о каждом котенке.