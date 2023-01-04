package lesson_4.homework;

import java.util.Locale;
import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {

        double number = 0;
        String interval = "Value is not included in any interval!";

        System.out.println();
        System.out.println("*** Interval Detector ***");
        System.out.println();

        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);


        System.out.println("Please enter your number: ");
        number = input.nextDouble();
        System.out.println("------------------");

        if (number >= 0 && number <= 100) {
            if (number >= 0 && number <= 14) {
                interval = "[0-14]";
            } else if (number >= 15 && number <= 35) {
                interval = "[15-35]";
            } else if (number >= 36 && number < 50) {
                interval = "[36-50]";
            } else if (number > 50 && number <= 100) {
                interval = "[50-100]";
            } else if (number == 50) {
                interval = "[36-50][50-100]";
            }
            System.out.println("Your interval: " + interval);
        } else {
            System.out.println(interval);
        }
        input.close();
    }
}

