package lesson_8.computer;

public class MyComputers {
    public static void main(String[] args) {
        Computer myPC = new Computer(
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
        );
        System.out.println("myPC = " + myPC);
        System.out.println("myPC.getGpu() = " + myPC.getGpu());
    }
}
