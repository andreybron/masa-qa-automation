package lesson_7.student;

public class StudentMain {
    public static void main(String[] args) {

        Student student = new Student("Andrey", 33);
        System.out.println("student.getName() = " + student.getName());
        System.out.println("student.getAge() = " + student.getAge());

        student.setAge(-3);
        student.setName("Bro");
        System.out.println(student);
    }
}
