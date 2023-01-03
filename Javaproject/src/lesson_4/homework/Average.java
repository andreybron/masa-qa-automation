package lesson_4.homework;

// Calculate the arithmetic mean of all numbers from 0 to 100
public class Average {
    public static void main(String[] args) {

        int sum = 0;
        int count = 0;
        double mean;

        for (int i = 0; i <= 100; i++) {
            sum += i; //sum increases by i
            count++; //counter increases by 1
        }

        mean = (double) sum / count;

        System.out.println("***");
        System.out.println("The arithmetic mean of all numbers from 0 to 100 is: " + mean);
        System.out.println("***");
        System.out.println("numbers: " + count);
        System.out.println("sum: " + sum);
        System.out.println("***");
    }
}