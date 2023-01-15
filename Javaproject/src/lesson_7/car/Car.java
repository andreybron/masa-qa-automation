package lesson_7.car;

public class Car {

    String manufacturer;
    String model;
    int year;
    String color;
    boolean isElectrical;

    int created = 0;
    static int wasCreated = 0;

    public Car() {
        created++;
        wasCreated++;
        System.out.println("created = " + created);
        System.out.println("wasCreated = " + wasCreated);

    }
    public Car(String color) {
        this.color = color;
        created++;
        wasCreated++;
        System.out.println("created = " + created);
        System.out.println("wasCreated = " + wasCreated);
    }
    public Car(String manufacturer, int year) {
        this.manufacturer = manufacturer;
        this.year = year;
        created++;
        wasCreated++;
        System.out.println("created = " + created);
        System.out.println("wasCreated = " + wasCreated);
    }

    public Car(String manufacturer, String model, int year, String color, boolean isElectrical) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.year = year;
        this.color = color;
        this.isElectrical = isElectrical;
        created++;
        wasCreated++;
        System.out.println("created = " + created);
        System.out.println("wasCreated = " + wasCreated);
    }

    public void carIsReady() {
        System.out.println("I'm ready!");
    }
    public static void classOccurrences() {
        System.out.println("classOccurrences = " + wasCreated);
    }
    public void printCarInfo() {
        System.out.println(this);
    }
    @Override
    public String toString() {
        return "Car{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", isElectrical=" + isElectrical +
                '}';
    }
}
