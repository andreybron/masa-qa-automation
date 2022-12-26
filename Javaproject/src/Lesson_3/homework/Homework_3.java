package Lesson_3.homework;

public class Homework_3 {
    public static void main(String[] args) {

        //Task 1.1
        System.out.println("---Task_1.1---");
        int i1 = 5;
        int i2 = 11;
        double d1 = 5.5;
        double d2 = 1.3;
        long l = 20l;
        double result = 0;
        result = i2 / d1 + d2 % i1 - l;
        System.out.println("result = " + result);
        System.out.println();

        //Task 1.2
        System.out.println("---Task_1.2---");
        byte a = 5;
        byte b = 8;
        int result_a = 0;
        int result_b = 0;
        result_a = a-- - --a + ++a + a++ + a;
        result_b = ++b - b++ + ++b - --b;
        System.out.println("result_a = " + result_a);
        System.out.println("result_b = " + result_b);
        System.out.println();

        //Task 2
        System.out.println("---Task_2---");
        int x = 10;
        int y = 12;
        int z = 3;

        x += y - x++ * z;
        System.out.println("x = " + x);
        x = 10; //Back to initial value

        z = --x - y * 5;
        System.out.println("z = " + z);
        z = 3; //Back to initial value

        y /= x + 5 % z;
        System.out.println("y = " + y);
        y = 12; //Back to initial value

        z = x++ + y * 5;
        System.out.println("z = " + z);
        z = 3; //Back to initial value

        x = y - x++ * z;
        System.out.println("x = " + x);
        System.out.println();

        //Not sure about putting values to initial, so there is another option:
        System.out.println("***Task_2[optional solution]***");
        x = 10;
        y = 12;
        z = 3;
        x += y - x++ * z;
        z = --x - y * 5;
        y /= x + 5 % z;
        z = x++ + y * 5;
        x = y - x++ * z;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);

    }

}
