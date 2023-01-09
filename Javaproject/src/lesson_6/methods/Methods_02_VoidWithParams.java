package lesson_6.methods;

public class Methods_02_VoidWithParams {
    public static void main(String[] args) {
        sayHello("Bro", 33);
        String studentName = "Alex";
        sayHello(studentName, 34);
    }

    public static void sayHello(String name, int age) {
        System.out.println("Hello " + name + "!");
        System.out.println("You are " + age + " years old");
    }
}
