package lesson_13.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ControlledTryCatch {

    public static void main(String[] args) {

        File ourFile = new File("D://file.txt");
        try {
            FileReader reader = new FileReader(ourFile);
        } catch (FileNotFoundException e) {
            System.out.println("WTF?");
        }
    }
}
