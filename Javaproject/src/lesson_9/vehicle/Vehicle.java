package lesson_9.vehicle;

public abstract class Vehicle {

    private String manufacturer;
    private int year;

    public void sayHello(){
        System.out.println("Hello!");
    }
    public abstract void whoAreYou();

    public Vehicle(String manufacturer, int year) {
        this.manufacturer = manufacturer;
        this.year = year;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "manufacturer='" + manufacturer + '\'' +
                ", year=" + year +
                '}';
    }
}
