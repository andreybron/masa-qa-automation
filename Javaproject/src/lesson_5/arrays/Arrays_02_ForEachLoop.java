package lesson_5.arrays;

public class Arrays_02_ForEachLoop {
    public static void main(String[] args) {

        int arrayOfNumbers[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    //itar
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            System.out.print(arrayOfNumbers[i] + " ");
        }
        System.out.println();

        int array[] = new int[10];
    //iter
        for (int number : array) {
            System.out.print(number + " ");
        }
    }
}
