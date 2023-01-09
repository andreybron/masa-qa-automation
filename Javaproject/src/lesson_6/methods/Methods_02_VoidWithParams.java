package lesson_6.methods;

import java.util.ArrayList;

public class Methods_02_VoidWithParams {
    public static void main(String[] args) {
        sayHello("Bro", 33);
        String studentName = "Alex";
        sayHello(studentName, 34);

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(7);

        printArrayList(arrayList);
    }

    public static void sayHello(String name, int age) {
        System.out.println("Hello " + name + "!");
        System.out.println("You are " + age + " years old");
        System.out.println();
    }

    public static void printArrayList(ArrayList<Integer> list) {
        System.out.println("list.size() = " + list.size());
        System.out.println();
        list.forEach((number) -> System.out.print(number + " "));
    }
}
