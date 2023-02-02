package lesson_10.classwork;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyShapes {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        List<Shape> collectionOfShapes = new ArrayList<>();

        Messages.printMainMenu();
        int option = input.nextInt();

        while (option > 0 && option < 8) {
            System.out.println("You have chosen " + option);
            switch (option) {
                case 1:
                    Messages.printShapesMenu();
                    int subOption = input.nextInt();
                    System.out.println("Input color of your shape");
                    String color = input.next();
                    switch (subOption) {
                        case 1:
                            System.out.println("Input square side size");
                            double side = input.nextDouble();
                            collectionOfShapes.add(new Square(color, side));
                            break;
                        case 2:

                            break;
                        case 3:

                            break;
                        case 4:

                            break;
                    }

                    break;
                case 2:
                    Messages.printCollectionOfShapes(collectionOfShapes);
                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:

                    break;
                case 7:
                    System.out.println("Programme terminated, see You!");
                    return;
            }
            Messages.printMainMenu();
            option = input.nextInt();
        }
        System.out.println("Wrong input");
    }
}
