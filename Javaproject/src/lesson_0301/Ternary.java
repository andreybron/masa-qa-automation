package lesson_0301;

public class Ternary {
    public static void main(String[] args) {

        int a = 5;
        int b = 5;
        int c = 6;
        String result;

        if (a == b) {
            result = "a and b are equal";
        }
        else {
            result = "a and b are not equal";
        }
        System.out.println(result);

        result = (a == c) ? "a and c are equal" : "a and c are not equal";
        System.out.println(result);
    }
}
