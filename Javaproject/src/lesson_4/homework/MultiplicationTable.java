package lesson_4.homework;

//Create multiplication table from 1 to 10 via nested cycle
public class MultiplicationTable {
    public static void main(String[] args) {

        int n = 0; //Variable to store result of multiplication

        System.out.println();
        System.out.println("*** Multiplication table ***");

        for (int i = 1; i <= 10; i++) {
            System.out.println();
            for (int j = 1; j <= 10; j++) {
                n = i * j;
                if (n / 10 < 1) {
                    System.out.print("  " + n + " ");
                } else if (n / 10 < 10) {
                    System.out.print(" " + n + " ");
                }
                else {
                    System.out.print(n + " ");
                }
            }

        }

    }
}
