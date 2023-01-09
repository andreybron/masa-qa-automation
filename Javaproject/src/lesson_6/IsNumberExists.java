package lesson_6;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class IsNumberExists {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        System.out.println("enter your int number: ");
        int number = input.nextInt();
        int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println(checkIn(number, values));

        input.close();
    }
    public static boolean checkIn(int myValue, int[] array) {
        for (int number : array) {
            if (myValue == number) {
                return true;
            }

        }return false;
    }
}
