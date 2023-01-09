package lesson_5.homework;

import java.util.ArrayList;

public class NumbersAndNames {
    public static void main(String[] args) {

        //1.create collection with 10 numbers
        ArrayList<Integer>numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }
//        System.out.println("myArrayList.size() =" + numbers.size());

        numbers.forEach(number -> System.out.print(number + " "));
        
        //2.create collection with 10 names


    }
}

//Создать 3 коллекции:
//В первой 10 чисел
//Во второй 10 имен (заполните их произвольными значениями)
//Третья коллекция должна автоматически заполняться строками, которые содержат
//число из первой , коллекции, потом знак тире и строку из второй коллекции.
//Вывести все значения третьей коллекции в цикле for-each.