package lesson_6.homework;

import java.util.Arrays;

public class AreArraysEqual {
    public static void main(String[] args) {

        int[] array1 = {1, 2, 3, 4, 5, 6, 7};
        int[] array2 = {1, 2, 3, 4, 5, 6, 7};
        int[] array3 = {7, 6, 5, 4, 3, 2, 1};
        int[] array4 = {1, 2, 3, 4, 5};

        System.out.println("(array1) = " + Arrays.toString(array1));
        System.out.println("(array2) = " + Arrays.toString(array2));
        System.out.println("(array3) = " + Arrays.toString(array3));
        System.out.println("(array4) = " + Arrays.toString(array4));

        System.out.println("---array1 and array2---");
        System.out.println("massiveCompare1: " + massiveCompare1(array1, array2));
        System.out.println("massiveCompare2: " + massiveCompare2(array1, array2));
        System.out.println("---array1 and array3---");
        System.out.println("massiveCompare1: " + massiveCompare1(array1, array3));
        System.out.println("massiveCompare2: " + massiveCompare2(array1, array3));
        System.out.println("---array1 and array4---");
        System.out.println("massiveCompare1: " + massiveCompare1(array1, array4));
        System.out.println("massiveCompare2: " + massiveCompare2(array1, array4));

    }

    public static boolean massiveCompare1(int[] a, int[] b) {
        return Arrays.equals(a, b);
    }

    public static boolean massiveCompare2(int[] a, int[] b) {
        if (a.length != b.length) {
            return false;
        } else {
            for (int i = 0; i < a.length; i++) {
                if (a[i] != b[i]) {
                    return false;
                }
            }
            return true;
        }
    }
    
}

//Создайте новый класс AreArraysEqual. Создайте точку входа (static main method).
//Создайте метод который получит два параметра : два массива int.
//Метод проверит массивы. Если они равны (длина и значения) вернет true.
//Если нет тo false.
//Делаем через два способа:
//- Своя реализация
//*Arrays
