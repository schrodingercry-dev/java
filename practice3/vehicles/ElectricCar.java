package vehicles;

public class ElectricCar extends Car implements ElectricVehicle {
    private double batteryCapacity;

    public ElectricCar() {
        super();
        engineType = "Electric";
    }

    public ElectricCar(
            String model,
            String license,
            String color,
            int year,
            String ownerName,
            String insuranceNumber,
            double batteryCapacity
    ) {
        super(model, license, color, year, ownerName, insuranceNumber);
        engineType = "Electric";
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    @Override
    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public String vehicleType() {
        return "Electric Car";
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nBattery capacity: "
                + batteryCapacity
                + " kWh";
    }
}
