package lesson_13.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Date;

public class ControlledTryCatch {

    public static void main(String[] args) {

        File ourFile = new File("D://file.txt");
        Date date = new Date();

        try {
            FileReader reader = new FileReader(ourFile);
        } catch (FileNotFoundException e) {
            System.out.println("WTF? " + date.getTime());
//            System.out.println(exception.getMessage());
        }
    }
}
