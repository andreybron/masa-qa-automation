package lesson_7.car;

public class MyCars {
    public static void main(String[] args) {

        Car bmw = new Car("black");
        bmw.carIsReady();
        System.out.println("bmw.color = " + bmw.color);
        bmw.color = "BLACK";
        System.out.println("bmw.color = " + bmw.color);
        System.out.println("bmw.isElectrical = " + bmw.isElectrical);
        System.out.println("bmw.year = " + bmw.year);

        //Create a car
        bmw.color = "white";
        bmw.year = 2023;
        bmw.isElectrical = true;
        bmw.model = "x7";
        bmw.manufacturer = "BMW";

        //Create another car
        Car tesla = new Car();
        System.out.println("tesla.color = " + tesla.color);
        tesla.color = "white";
        tesla.year = 2022;
        System.out.println("tesla.manufacturer = " + tesla.manufacturer);
        System.out.println("tesla.color = " + tesla.color);

        //Create one more
        Car toyota = new Car("toyota", "Rav4", 2008, "silver", false);

        Car newCar = new Car();
        toyota.printCarInfo();
        System.out.println(/*" .toString() = " + */toyota.toString());
        System.out.println(toyota);
        System.out.println("Car.wasCreated = " + Car.wasCreated);
        newCar.printCarInfo();
        Car.classOccurrences();
    }
}
