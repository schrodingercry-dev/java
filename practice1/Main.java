public class Main {
    public static void main(String[] args) {
        System.out.println("=== конструктор по умолчанию ===");
        Car c1 = new Car();
        c1.To_String();

        System.out.println("\n=== Экземпляр 2: конструктор со всеми полями ===");
        Car c2 = new Car("Toyota Camry", "A123BC", "White", 2020);
        c2.To_String();

        System.out.println("\n=== Экземпляр 3: конструктор с моделью и годом ===");
        Car c3 = new Car("Lada Vesta", 2019);
        c3.To_String();

        System.out.println("\n=== Использование сеттеров для изменения полей ===");
        c1.setModel("BMW 7");
        c1.setLicense("A001MP97");
        c1.setColor("Black");
        c1.setYear(2024);
        c1.To_String();

        System.out.println("\n=== Использование геттеров ===");
        System.out.println("Модель c2: " + c2.getModel());
        System.out.println("Лицензия c2: " + c2.getLicense());
        System.out.println("Возраст c2: " + c2.getAge() + " лет");

        System.out.println("\n=== Использование toString() ===");
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }
}
