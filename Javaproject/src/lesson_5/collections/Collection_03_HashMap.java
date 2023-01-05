package lesson_5.collections;

import java.util.HashMap;
import java.util.Map;

public class Collection_03_HashMap {
    public static void main(String[] args) {

        HashMap<Integer, String> hashMap = new HashMap<>();

        hashMap.put(1111, "Alex");
        hashMap.put(2222, "Andrey");
        hashMap.put(3333, "Shura");
        hashMap.put(4444, "Irina");

        System.out.println(hashMap);
        System.out.println(hashMap.get(1111));
        System.out.println(hashMap.get(11111)); //value out of list = null
        System.out.println(hashMap.containsKey(2222));
        System.out.println(hashMap.containsValue("Andrey"));
        System.out.println("--------");

        for (Map.Entry<Integer, String> pairOfValues : hashMap.entrySet()) {
            System.out.println(pairOfValues.getKey() + " - " + pairOfValues.getValue());
//            Integer key = pairOfValues.getKey();
//            String value = pairOfValues.getValue();

        }

        System.out.println("--------");
        hashMap.put(5555, "Pavel");
        hashMap.forEach((id, name) -> System.out.println(id + " - " + name));


    }
}



//        HashMap<Integer, String> passportAndNames = new HashMap<>();
//
//        passportAndNames.put(1109675700, "Andrey Bro");
//
//        System.out.println("passportAndNames = " + passportAndNames);
