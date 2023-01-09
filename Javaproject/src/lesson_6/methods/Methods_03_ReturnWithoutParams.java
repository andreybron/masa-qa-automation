package lesson_6.methods;
import java.util.Date;
public class Methods_03_ReturnWithoutParams {
    public static void main(String[] args) {

        long randomNumber = getRandomNumber();
        System.out.println(randomNumber);
        System.out.println(getRandomNumber());
    }
    public static long getRandomNumber() {
        Date date = new Date();

        return date.getTime();
    }
}
