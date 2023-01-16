package lesson_8.computer;

import java.util.ArrayList;
import java.util.Arrays;

public class MyComputers {
    public static void main(String[] args) {

        ArrayList<Computer> computers = new ArrayList<>();
        computers.add(new Computer(
                new GraphicCard(4500, "asus"),
                new Chip("intel", 4800, 9),
                new Memory[]{
                        new Memory(16000, "AMD"),
                        new Memory(16000, "AMD"),
                        new Memory(16000, "AMD"),
                        new Memory(16000, "AMD"),
                },
                new SolidDrive("AMD", 1024),
                100000
        ));
        computers.add(new Computer(
                new GraphicCard(3000, "acer"),
                new Chip("intel", 4800, 9),
                new Memory[]{
                        new Memory(16000, "AMD"),
                        new Memory(16000, "AMD"),
                        new Memory(8000, "Intel"),
                        new Memory(8000, "Intel"),
                },
                new SolidDrive("AMD", 1024),
                100000
        ));
        computers.add(new Computer(
                new GraphicCard(4500, "asus"),
                new Chip("intel", 4800, 9),
                new Memory[]{
                        new Memory(16000, "AMD"),
                        new Memory(16000, "AMD"),
                        new Memory(16000, "AMD"),
                        new Memory(16000, "AMD"),
                },
                new SolidDrive("AMD", 1024),
                100000
        ));
        computers.add(new Computer(
                new GraphicCard(4500, "apple"),
                new Chip("apple", 4000, 2),
                new Memory[]{
                        new Memory(16000, "AMD"),
                        new Memory(16000, "AMD"),
                        new Memory(16000, "AMD"),
                        new Memory(16000, "AMD"),
                },
                new SolidDrive("AMD", 1024),
                500000
        ));

        computers.forEach(System.out::println);
        System.out.println("computers.get(3).getRam() = " + Arrays.toString(computers.get(3).getRam()));
    }
}