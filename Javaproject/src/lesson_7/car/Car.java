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
    public void carIsReady() {
        System.out.println("I'm ready!");
    }
}
