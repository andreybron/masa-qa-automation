package lesson_5.classwork;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandomValues {
    public static void main(String[] args) {
//  Random
        Random random = new Random();
        ThreadLocalRandom threadLocalRandom = ThreadLocalRandom.current();

        int randomInteger = random.nextInt();
        int randomIntegerWithBound = random.nextInt(100);
        double randomDouble = random.nextDouble();

        System.out.println("randomInteger = " + randomInteger);
        System.out.println("randomIntegerWithBound = " + randomIntegerWithBound);
        System.out.println("randomDouble = " + randomDouble);

        int randomIntegerWithBounds = threadLocalRandom.nextInt(10, 20);
        System.out.println("randomIntegerWithBounds = " + randomIntegerWithBounds);
    }
}
