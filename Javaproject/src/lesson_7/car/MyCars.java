package lesson_7.car;

public class MyCars {
    public static void main(String[] args) {

        Car bmw = new Car();
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
        tesla.color = "white";
        tesla.year = 2022;

        System.out.println("tesla.manufacturer = " + tesla.manufacturer);
    }
}
