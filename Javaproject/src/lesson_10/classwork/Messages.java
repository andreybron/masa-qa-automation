package lesson_10.classwork;

import java.util.List;

public class Messages {

    public static void printMainMenu() {
        System.out.println("\n Please choose");
        System.out.println("1. Add new shape");
        System.out.println("2. List all shapes");
        System.out.println("3. Sum all circumferences");
        System.out.println("4. Sum all areas");
        System.out.println("5. Find biggest circumference");
        System.out.println("6. Find biggest area");
        System.out.println("7. Exit");
    }

    public static void printShapesMenu() {
        System.out.println("Please choose from the next Shapes:");
        System.out.println("1. Square");
        System.out.println("2. Rectangle");
        System.out.println("3. Circle");
        System.out.println("4. Right triangle");
    }

    public static void printCollectionOfShapes(List<Shape> list) {
        if (list.size() == 0) {
            System.out.println("There are no shapes in the list");
            return;
        }
        list.forEach(shape -> System.out.println(shape));
    }
}
//Add new shape
//List all shapes
//Sum all circumferences
//Sum all areas
//Find biggest circumference
//Find biggest area
//Exit