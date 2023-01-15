package lesson_7.car;

public class Car {

    String manufacturer;
    String model;
    int year;
    String color;
    boolean isElectrical;

    public Car() {

    }
    public Car(String color) {
        this.color = color;
    }
    public Car(String manufacturer, int year) {
        this.manufacturer = manufacturer;
        this.year = year;
    }

    public Car(String manufacturer, String model, int year, String color, boolean isElectrical) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.year = year;
        this.color = color;
        this.isElectrical = isElectrical;
    }

    public void carIsReady() {
        System.out.println("I'm ready!");
    }
}
