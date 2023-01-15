package lesson_5.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class NumbersAndNames {
    public static void main(String[] args) {

        System.out.println("---Numbers and names---");

        //1.create collection with 10 numbers
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }

        //2.create collection with 10 names
        ArrayList<String> names = new ArrayList<>();

        names.add("Andrey");
        names.add("Nikita");
        names.add("Olga");
        names.add("Marina");
        names.add("Pavel");
        names.add("Alex");
        names.add("Egor");
        names.add("Irina");
        names.add("Karina");
        names.add("Lisa");

        //3.create set with names and numbers
        System.out.println("---Set:");

        Set<String> finalCollection = new HashSet<>();
        for (int i = 0; i < numbers.size(); i++) {
            finalCollection.add(numbers.get(i) + "-" + names.get(i));
        }
        finalCollection.forEach(name -> System.out.println(name));

        //3.1 create HashMap with names and numbers
        System.out.println("---HashMap:");

        HashMap<Integer, String> finalHashMap = new HashMap<>();
        for (int i = 0; i < numbers.size(); i++) {
            finalHashMap.put(numbers.get(i), names.get(i));
        }

        finalHashMap.forEach((id, name) -> System.out.println(id + " - " + name));

        //print debug info
        System.out.println("---debug---");
        //also can be used, but takes too much code only to show debug info,
        // so I don't like it, and will use " System.out.println("numbers : " + numbers);"
//        System.out.print("numbers : ");
//        numbers.forEach(number -> System.out.print(number + " "));
//        System.out.println();
        System.out.println("numbers : " + numbers);
        System.out.println("numbers.size() = " + numbers.size());
        System.out.println("names : " + names);
        System.out.println("names.size() = " + names.size());
    }
}

//Создать 3 коллекции:
//В первой 10 чисел
//Во второй 10 имен (заполните их произвольными значениями)
//Третья коллекция должна автоматически заполняться строками, которые содержат
//число из первой , коллекции, потом знак тире и строку из второй коллекции.
//Вывести все значения третьей коллекции в цикле for-each.
