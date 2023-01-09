package lesson_6;

import java.util.Arrays;
import java.util.Random;

public class MaxMinArray {
    public static void main(String[] args) {

        Random random = new Random();

        double[] values = new double[10];
        for (int i = 0; i < values.length; i++) {
            values[i] = random.nextDouble() * 100;
        }

        double min = findMin(values);
        double max = findMax(values);
        double avg = findAvg(values);
        double avg2 =findAvgWithStreams(values);

        System.out.println("min: " + min);
        System.out.println("max: " + max);
        System.out.println("avg: " + avg);
        System.out.println("avg: " + avg2);
    }

    public static double findMin(double[] values) {
        Arrays.sort(values);
        return values[0];
    }

    public static double findMax(double[] values) {
        Arrays.sort(values);
        return values[values.length - 1];
    }

    public static double findAvg(double[] values) {
        double sum = 0;
        for (double value : values) {
            sum += value;
        }
        return sum / values.length;
    }
    public static double findAvgWithStreams(double[] values){
        return Arrays.stream(values).average().getAsDouble();

    }
}


//Создайте новый класс MaxMinArray. Создайте точку входа (static main method).
//Создайте 3 метода. Каждый метод получит массив из 10 значений и возвратит:
//Первый метод - самое маленькое значение.
//Второй метод - самое большое значение .
//Третий метод - среднее арифметическое.