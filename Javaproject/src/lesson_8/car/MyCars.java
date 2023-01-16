package lesson_8.car;

public class MyCars {

    public static void main(String[] args) {

        Car car = new Car(
                "Tesla",
                "model X",
                2023,
                new Engine(500, "electrical", true),
                new Wheel[]
                        {
                                new Wheel(18, 2.5),
                                new Wheel(18, 2.5),
                                new Wheel(18, 2.5),
                                new Wheel(18, 2.5),
                                new Wheel(18, 2.5)
                        }
        );
        System.out.println("car = " + car);
    }
}
