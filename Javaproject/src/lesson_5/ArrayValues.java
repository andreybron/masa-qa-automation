package lesson_5;

import java.util.Random;

public class ArrayValues {
    public static void main(String[] args) {

        Random random = new Random();

        int array[] = new int[20];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(30);

        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.println(array[i]);
            }
        }
    }
}
