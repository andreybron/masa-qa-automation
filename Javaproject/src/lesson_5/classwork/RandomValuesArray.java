package lesson_5.classwork;

import java.util.Random;

public class RandomValuesArray {
    public static void main(String[] args) {

        Random random = new Random();

        int array[] = new int[100];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(50);
            System.out.println("array[" + i + "] = " + array[i]);
        }
        System.out.println("***");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");

        }
 //       System.out.println();
    }
}
