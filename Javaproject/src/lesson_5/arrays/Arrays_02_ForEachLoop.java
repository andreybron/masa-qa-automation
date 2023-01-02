package lesson_5.arrays;

public class Arrays_02_ForEachLoop {
    public static void main(String[] args) {

        int arrayOfNumbers[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < arrayOfNumbers.length; i++) {
            System.out.print(arrayOfNumbers[i] + " ");
        }
        System.out.println();

        for (int number : arrayOfNumbers) {
            System.out.print(number + " ");
        }
    }
}
