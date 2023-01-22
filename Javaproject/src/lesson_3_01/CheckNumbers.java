package lesson_3_01;

import java.util.Scanner;

public class CheckNumbers {
    public static void main(String[] args) {

        int number;

        Scanner input = new Scanner(System.in);

        System.out.println("введите число...");
        number = input.nextInt();

        if (number % 2 == 0){
            System.out.println("число " + number + " четное");
        }
        else {
            System.out.println("число " + number + " не четное");

        }
    }
}
