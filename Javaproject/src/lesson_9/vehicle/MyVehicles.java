package lesson_9.vehicle;

import java.util.ArrayList;
import java.util.List;

public class MyVehicles {
    public static void main(String[] args) {

        List<Vehicle> vehicleList = new ArrayList<>();
        Car car = new Car("toyota",2008, false, "silver");
        vehicleList.add(car);
        vehicleList.add(new Bus("MAN", 2020, 66, "red"));
        vehicleList.add(new Truck("volvo", 2023, "diesel", "white"));

        vehicleList.forEach(item -> item.whoAreYou());
        System.out.println("vehicleList = " + vehicleList);
    }

}
