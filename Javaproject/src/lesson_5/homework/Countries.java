package lesson_5.homework;

import java.util.Set;
import java.util.HashMap;
import java.util.HashSet;

public class Countries {
    public static void main(String[] args) {

        // create HashMap
        HashMap<String, String> countries = new HashMap<>();
        countries.put("Rome", "Italy");
        countries.put("Venice", "Italy");
        countries.put("Naples", "Italy");
        countries.put("Marseilles", "France");
        countries.put("Strasbourg", "France");
        countries.put("Stuttgart", "Germany");
        countries.put("Berlin", "Germany");
        countries.put("London", "England");
        countries.put("Tel-Aviv", "Israel");
        countries.put("Jerusalem", "Israel");

        // 1.print all countries
        System.out.println("---1.print all countries---");

        // create Set to store unique countries
        Set<String> uniqueCountries = new HashSet<>();
        for (String uCountry : countries.keySet()) {
            uniqueCountries.add(countries.get(uCountry));
        }
        uniqueCountries.forEach(name -> System.out.println(name));
//        Another solution, and I like it more)
//        System.out.println("Countries: " + uniqueCountries);

        //2.print city-country pairs
        System.out.println("---2.print city-country pairs---");
        countries.forEach((city, country) -> System.out.println(city + " - " + country));
//        or:
//        System.out.println(countries);

        //Using ContainsKey, ContainsValue methods
        System.out.println("---Using ContainsKey, ContainsValue methods---");
        System.out.println(countries.containsKey("Tel-Aviv"));
        System.out.println(countries.containsKey("Tel-aviv"));
        System.out.println(countries.containsValue("Germany"));
        System.out.println(countries.containsValue("Russia"));


    }
}

//Используя IntelliJ IDEA, создайте класс Countries.
//Требуется:
//Создать HashMap заполнить его <String, String> (<City,
//Country>).
//Создайте до 10-и пар.
//1
//Вывести на экран: Каждую страну.
//2
//Вывести на экран: Город - Страна.
//3
//Попробовать методы как ContainsKey, ContainsValue