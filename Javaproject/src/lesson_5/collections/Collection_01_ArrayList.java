package lesson_5.collections;

import java.util.ArrayList;

public class Collection_01_ArrayList {
    public static void main(String[] args) {

//        int array[] = int[3];
        ArrayList<Integer> myArrayList = new ArrayList<>();

        System.out.println("myArrayList.size() = " + myArrayList.size());
        myArrayList.add(9);
        myArrayList.add(7);
//        myArrayList.add(9,9);
        System.out.println("myArrayList.size() = " + myArrayList.size());
        System.out.println("myArrayList.indexOf(9) = " + myArrayList.indexOf(9));

        for (Integer number : myArrayList) {
            System.out.println(number);
        }
        for (int i = 0; i < 15; i++) {
            myArrayList.add(i);
        }
        System.out.println("myArrayList.size() =" + myArrayList.size());

        myArrayList.forEach(number -> System.out.print(number + " "));
    }
}
