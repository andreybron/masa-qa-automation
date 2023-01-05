package lesson_5.classwork;

import java.util.ArrayList;
import java.util.Random;

public class CustomerArrayList {
    public static void main(String[] args) {

        Random random = new Random();
        ArrayList<Double>arrayList = new ArrayList<>();

        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;
        double summ = 0;

        for (int i = 0; i < 10; i++) {
         arrayList.add(Math.random() * 100);
//            System.out.println(i + ": " + arrayList.get(i));
        }
        System.out.println("arrayList.size = " + arrayList.size());

        for (double num : arrayList) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
            summ += num;
        }


        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("summ = " + summ);
        System.out.println("average = " + summ / arrayList.size());
        System.out.println("---------");
        arrayList.forEach(num -> System.out.println("num = " + num));
    }
}

//    Используя Intellij IDEA, создайте класс CustomerArrayList.
//        Создайте ArrayList на 10 чисел.
//        Требуется:
//        Вывести на экран: наибольшее значение массива, наименьшее значение массива, общую сумму всех элементов, среднее арифметическое всех элементов, вывести все нечетные значения.
//        Используем forEach
//        *Double.MIN_VALUE, Double.MAX_VALUE;