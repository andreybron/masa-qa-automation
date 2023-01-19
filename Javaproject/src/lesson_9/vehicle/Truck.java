package lesson_9.vehicle;

public class Truck extends Vehicle{
    private String type;
    private String color;

    public Truck(String manufacturer, int year, String type, String color) {
        super(manufacturer, year);
        this.type = type;
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void sayHello() {
        super.sayHello();
    }

    @Override
    public void whoAreYou() {
        System.out.println("I'm a truck");
    }
}
