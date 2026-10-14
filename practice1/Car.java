public class Car {
    private String model;
    private String license;
    private String color;
    private int year;
    
    private static final int CURRENT_YEAR = 2026;

    public Car() {
        this.model = "Unknown";
        this.license = "Unknown";
        this.color = "Unknown";
        this.year = 0;
    }

    public Car(String model, String license, String color, int year) {
        this.model = model;
        this.license = license;
        this.color = color;
        this.year = year;
    }

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
        this.license = "Unknown";
        this.color = "Unknown";
    }

    public String getModel() {
        return model;
    }

    public String getLicense() {
        return license;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getAge() {
        if (year == 0) {
            return 0;
        }
        return CURRENT_YEAR - year;
    }

    public void To_String() {
        System.out.println("Model: " + model);
        System.out.println("License: " + license);
        System.out.println("Color: " + color);
        System.out.println("Year: " + year);
        System.out.println("Age: " + getAge() + " years");
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", license='" + license + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                '}';
    }
}
