package lesson_4.homework;

import java.util.Locale;
import java.util.Scanner;

public class WorkersBonus {
    public static void main(String[] args) {

        double salary;
        double experience;
        double bonus = 0;
        double salaryNew = 0;

        System.out.println();
        System.out.println("*** Workers Bonus Calc ***");
        System.out.println();

        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        System.out.println("Please enter your salary: ");
        salary = input.nextDouble();

        if (salary >= 0) {

            System.out.println("Please enter your experience: ");
            experience = input.nextDouble();
            System.out.println("------------------");

            if (experience >= 0) {
                if (experience < 5) {
                    bonus = 0.1;
                } else if (experience >= 5 && experience < 10) {
                    bonus = 0.15;
                } else if (experience >= 10 && experience < 15) {
                    bonus = 0.25;
                } else if (experience >= 15 && experience < 20) {
                    bonus = 0.35;
                } else if (experience >= 20 && experience < 25) {
                    bonus = 0.45;
                } else if (experience >= 25) {
                    bonus = 0.5;
                }
                System.out.println("Your bonus = " + (bonus * 100) + "%");
                System.out.println("Yor new salary = " + (salaryNew = salary + (salary * bonus)));
            } else {
                System.out.println("ERROR! Try again, using NON-NEGATIVE values!");
            }
        } else {
            System.out.println("------------------");
            System.out.println("ERROR! Try again, using NON-NEGATIVE values!");
        }
        input.close();
    }

}

//    Создайте класс WorkersBonus.
//        Мы принимает от пользователя два параметра:
//        - Зарплата
//        - Опыт работы.
//        Напишите программу расчета начисления премий сотрудникам.
//        Премии рассчитываются согласно выслуге лет.
//        Если выслуга до 5 лет, премия составляет 10% от заработной платы.
//        Если выслуга от 5 лет (включительно) до 10 лет, премия составляет 15% от заработной платы.
//        Если выслуга от 10 лет (включительно) до 15 лет, премия составляет 25% от заработной платы.
//        Если выслуга от 15 лет (включительно) до 20 лет, премия составляет 35% от заработной платы.
//        Если выслуга от 20 лет (включительно) до 25 лет, премия составляет 45% от заработной платы.
//        Если выслуга от 25 лет (включительно) и более, премия составляет 50% от заработной платы.
//        Результаты расчета, выведите на экран:
//        - Размер бонуса
//        - Новая зарплата
