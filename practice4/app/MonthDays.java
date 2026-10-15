package app;

import java.util.Scanner;

public class MonthDays {
    public static void main(String[] args) {
        String[] months = {
                "январь", "февраль", "март", "апрель", "май", "июнь",
                "июль", "август", "сентябрь", "октябрь", "ноябрь", "декабрь"
        };
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите номер месяца от 1 до 12: ");
            int monthNumber = readInteger(scanner);
            int monthIndex = monthNumber - 1;

            try {
                String month = months[monthIndex];
                int numberOfDays = daysInMonth[monthIndex];

                if (monthNumber == 2) {
                    System.out.print("Введите год: ");
                    int year = readInteger(scanner);

                    if (isLeapYear(year)) {
                        numberOfDays = 29;
                    }
                }

                System.out.println("Месяц: " + month);
                System.out.println("Количество дней: " + numberOfDays);
            } catch (ArrayIndexOutOfBoundsException exception) {
                System.out.println("Недопустимое число");
            }
        }
    }

    private static int readInteger(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.print("Нужно ввести целое число. Повторите ввод: ");
            scanner.next();
        }

        return scanner.nextInt();
    }

    private static boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }
}
