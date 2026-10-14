package app;

import vehicles.Car;
import vehicles.ElectricCar;
import vehicles.ElectricVehicle;
import vehicles.Vehicle;

public class TestCar {
    public static void main(String[] args) {
        Vehicle car = new Car(
                "Toyota Camry",
                "A123BC",
                "White",
                2020,
                "Sergey",
                "INS-001"
        );

        ElectricCar electricCar = new ElectricCar(
                "Tesla Model 3",
                "E777EE",
                "Black",
                2024,
                "Alex",
                "INS-002",
                82.5
        );

        car.setYear(2021);
        car.setOwnerName("Ivan");
        car.setInsuranceNumber("INS-101");

        electricCar.setYear(2025);
        electricCar.setOwnerName("Maria");
        electricCar.setInsuranceNumber("INS-202");

        ElectricVehicle electricVehicle = electricCar;
        System.out.println("Battery capacity: "
                + electricVehicle.getBatteryCapacity()
                + " kWh");

        System.out.println();
        System.out.println(car);

        System.out.println();
        System.out.println(electricCar);
    }
}
