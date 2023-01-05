package lesson_5.classwork;

import java.util.Random;

public class CustomerArray {
    public static void main(String[] args) {

        Random random = new Random();
        double myArray[] = new double[10];

        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;
        double summ = 0;

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (100 * random.nextDouble());
            System.out.println("myArray[i] = " + myArray[i]);
            if (myArray[i] > max) {
                max = myArray[i];
            }
            if (myArray[i] < min) {
                min = myArray[i];
            }
            summ += myArray[i];
            //       for (int i = 0; i < myArray.length; i++) {

        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("summ = " + summ);
        System.out.println("average = " + summ / myArray.length);
    }
}

//    Используя Intellij IDEA, создайте класс CustomerArray.
//        Создайте массив на 10 чисел double.
//        Требуется:
//        Вывести на экран: наибольшее значение массива, наименьшее значение массива,
//        общую сумму всех элементов, среднее арифметическое всех элементов, вывести все нечетные значения.
//        Используем forEach
//        *Double.MIN_VALUE, Double.MAX_VALUE;