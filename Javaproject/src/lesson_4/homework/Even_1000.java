package lesson_4.homework;

public class Even_1000 {
    public static void main(String[] args) {

        int i = 0; //counter for formatting

        System.out.println("Even numbers from 1000 to 0:");

        //parity check
        for (int j = 1000; j >= 0; j--, i++) {
            if (j % 2 == 0) {
                System.out.print(" " + j);
            }
            //print out formatting
            if (i == 50) {
                System.out.println();
                i = 0;
            }
        }
    }
}