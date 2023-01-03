// Print all numbers from 0 to 1000 inclusive that are divisible by 5. Use a WHILE Loop
package lesson_4.homework;

public class WHILE_1000_Divisible_5 {
    public static void main(String[] args) {

        int i = 0; //counter for formatting
        int j = 0; //counter for numbers

        System.out.println("Numbers from 0 to 1000 divisible by 5:");

        while (j <= 1000) {
            i++;
            j++;

            //divisibility check
            if (j % 5 == 0) {
                System.out.print(" " + j);
            }

            //print out formatting
            if (i == 100) {
                System.out.println();
                i = 0;
            }
        }
    }
}


