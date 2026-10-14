package app;

import vehicles.Car;
import vehicles.ElectricCar;
import vehicles.Vehicle;

public class TestCar {
    public static void main(String[] args) {
        Vehicle car = new Car();

        car.setModel("Toyota Camry");
        car.setLicense("A123BC");
        car.setColor("White");
        car.setYear(2020);
        car.setOwnerName("Sergey");
        car.setInsuranceNumber("INS-001");
        car.setEngineType("Petrol");

        Vehicle electricCar = new ElectricCar();

        electricCar.setModel("Tesla Model 3");
        electricCar.setLicense("E777EE");
        electricCar.setColor("Black");
        electricCar.setYear(2024);
        electricCar.setOwnerName("Alex");
        electricCar.setInsuranceNumber("INS-002");

        ((ElectricCar) electricCar).setBatteryCapacity(82.5);

        System.out.println("First vehicle:");
        System.out.println(car);

        System.out.println();

        System.out.println("Second vehicle:");
        System.out.println(electricCar);
    }
}
