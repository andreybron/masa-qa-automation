package lesson_5.collections;

import java.util.HashSet;

public class Collection_02_HashSet {
    public static void main(String[] args) {

        HashSet<String> names = new HashSet<>();
        System.out.println("names.isEmpty() = " + names.isEmpty());

        names.add("Andrey");
        names.add("Nikita");
        names.add("Olga");
        names.add("Marina");
        names.add("Andrey");

        System.out.println("names.isEmpty() = " +names.isEmpty());
        System.out.println("names.size() = " + names.size());

        names.forEach(name -> System.out.println(name));

    }

}
