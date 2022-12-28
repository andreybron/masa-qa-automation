package lesson_0301;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter age..");
        int age = input.nextInt();

        if (age > 18) {
            System.out.println("U're adult");
        }
        else if (age == 18) {
            System.out.println("U're 18 years old");
        }
        else {
            System.out.println("U're young");
        }
    }
}
