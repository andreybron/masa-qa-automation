package lesson_5.classwork;

import java.util.Random;

public class MaxGrade {
    public static void main(String[] args) {

        Random random = new Random();
        String names[] = {"Irina", "Roman", "Gleb", "Karina", "Olga"};
        int grades[] = new int[5];

        //Fill in array with grades
        for (int i = 0; i < grades.length; i++) {
            grades[i] = random.nextInt(100);

        }

        int maxGrade = grades[0];
        int index = 0;

        //Print names and grades
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + " - " + grades[i]);

        }

        //Find max grade
        for (int i = 1; i < grades.length; i++) {
            if (grades[i] > maxGrade) {
                maxGrade = grades[i];
                index = i;
            }

        }

        System.out.println("The best student is " + names[index] + " with grade " + maxGrade);

    }
}
