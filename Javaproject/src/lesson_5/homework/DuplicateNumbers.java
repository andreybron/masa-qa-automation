package lesson_5.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class DuplicateNumbers {
    public static void main(String[] args) {

        //fill the ArrayList with 100 random values (0-50)
        Random random = new Random();
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            numbers.add(random.nextInt(50));
            System.out.print(" " + numbers.get(i));
        }
        System.out.println();

        //count duplicate elements with HashMap
        HashMap<Integer, Integer> collection = new HashMap<>();
        for (int num : numbers) {
            if (collection.containsKey(num)) {
                // if the integer is already in the HashMap, increment its count
                collection.put(num, collection.get(num) + 1);
            } else {
                // if the integer is not in the HashMap, add it with a count of 1
                collection.put(num, 1);
            }
        }

        //TODO: filter hashmap not to contain values less than 2
//        for (int i = 0; i < collection.size(); i++) {
//            if (collection.containsValue(1)) {
//                collection.remove();
//            }
//        }

        //print number of occurrences
        System.out.println("number of occurrences:");
        collection.forEach((num, sum) -> System.out.println("'" + num + "': " + sum + " times"));
        System.out.println("number of unique numbers = " + collection.size());

        //TODO: filter hashmap not to contain values less than 2 //by Alex
        ArrayList<Integer> list = new ArrayList<>();
        collection.forEach((key, value) -> {
            if (value == 1) {
                list.add(key);
            }
        });
        for (Integer key : list) {
            collection.remove(key);
        }
        System.out.println("number of duplicate numbers = " + collection.size());
    }
}

//Используя IntelliJ IDEA, создайте класс DuplicateNumbers.
//Создайте ArrayList на 100 чисел типа Integer.
//Требуется:
//Решить задачу подсчета повторяющихся элементов в массиве с помощью HashMap.
//Используем Random -> nextInt(50)