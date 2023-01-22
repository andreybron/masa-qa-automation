package lesson_10.classwork;

public abstract class Shape {

    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public abstract double calculateArea();

    public abstract double calculatePerimeter();
}
