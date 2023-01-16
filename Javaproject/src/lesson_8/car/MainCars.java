package lesson_8.car;

public class MainCars {
    public static void main(String[] args) {

        Engine engine = new Engine(250, "v6", false);

        Wheel[] wheels = new Wheel[5];
        for (int i = 0; i < wheels.length; i++) {
            wheels[i] = new Wheel(19, 2.5);
        }
        Car car = new Car("BMW", "m3", 2023, engine, wheels);

        System.out.println("car = " + car);

        car.wheels[1].radius = -5;

        System.out.println("car = " + car);
    }
}
