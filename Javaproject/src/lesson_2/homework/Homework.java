package lesson_2.homework;

public class Homework {
    public static void main(String[] args) {
//1. Create variables of all integer data types:
// • 2 byte variables
        byte myByte1 = 127;
        byte myByte2 = -99;
//• 2 short variables
        short myShort1 = 28000;
        short myShort2 = -32768;
//• 2 int variables
        int myInt1 = 0;
        int myInt2 = 2147483647; //Maximum value for a variable of type int
//• 2 long variables
        long myLong1 = 2147483648L;
        long myLong2 = -9223372036854775808L; //Minimum value for a variable of type long

//Display them on the screen
        System.out.println("1)");
        System.out.println("myByte1 = " + myByte1);
        System.out.println("myByte2 = " + myByte2);
        System.out.println("myShort1 = " + myShort1);
        System.out.println("myShort2 = " + myShort2);
        System.out.println("myInt1 = " + myInt1);
        System.out.println("myInt2 =  " + myInt2);
        System.out.println("myLong1 = " + myLong1);
        System.out.println("myLong2 = " + myLong2);

//2. Create variables of float, double and boolean
//   data types and display them on the screen:
        System.out.println("2)");

        float myFloat1 = 36.6F; //Normal human temperature in Celsius
        float myFloat2 = 3.1415926535897932384626433832795F; //Pi
        System.out.println("myFloat1 = " + myFloat1);
        System.out.println("myFloat2 =  " + myFloat2); //The value is displayed only up to 7 decimal places

        double myDouble1 = 3.1415926535897932384626433832795D; //Pi again
        double myDouble2 = 179769313486231570814527423731704356798070567525844996598917476803157260780028538760589558632766878171540458953514382464234321326889464182768467546703537516986049910576551282076245490090389328944075868508455133942304583236903222948165808559332123348274797826204144723168738177180919299881250404026184124858368D;
        System.out.println("myDouble1 = " + myDouble1); //The value is displayed up to 15 decimal places
        System.out.println("myDouble2 = " + myDouble2);

        boolean myBoolean1 = true;
        boolean myBoolean2 = false;
        System.out.println("myBoolean1 = " + myBoolean1);
        System.out.println("myBoolean2 = " + myBoolean2);

//3.Create n-th number of char variables in all possible ways and display them on the screen:
        char myChar1 = '\u05d0';
        char myChar2 = '\0';
        char myChar3 = 0;
        char myChar4 = 'B';
        char myChar5 = 0x52;
        char myChar6 = 0x004F;
        System.out.println("3)");
        System.out.println("myChar1 = " + myChar1);
        System.out.println("myChar2 = " + myChar2);
        System.out.println("myChar3 = " + myChar3);
        System.out.println("myChar4 = " + myChar4);
        System.out.println("myChar5 = " + myChar5);
        System.out.println("myChar6 = " + myChar6);
    }
}
