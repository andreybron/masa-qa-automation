package lesson_4.homework;

import java.util.Locale;
import java.util.Scanner;

public class UserPass {
    public static void main(String[] args) {

        String username;
        String password;
        String defUsername = "username";
        String defPassword = "password";
        int i = 1;
        boolean correct = false;

        System.out.println();
        System.out.println("*** User authentication ***");
        System.out.println();

        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);


        while (!correct && i <= 5) {
            System.out.print("Please enter your username: ");
            username = input.nextLine();
            System.out.print("Please enter your password: ");
            password = input.nextLine();
            System.out.println("---------------------------");

            if (username.equals(defUsername) && password.equals(defPassword)) {
                correct = true;
                System.out.println("Welcome!");
            } else if (i < 5) {
                System.out.println("Incorrect username or password. Try again. Attempts left: " + (5 - i));
                i++;
            } else {
                i++;
            }
        }

        if (!correct) {
            System.out.println("Incorrect username or password. No attempts left. Program terminated.");
        }
        input.close();
    }
}
