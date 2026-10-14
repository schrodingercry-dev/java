import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        final double ROUBLES_PER_YUAN = 11.91;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите сумму денег в китайских юанях: ");
        int yuan = scanner.nextInt();

        double roubles = ROUBLES_PER_YUAN * yuan;

        int digit = yuan % 10;
        String yuanEnding = getYuanEnding(yuan, digit);

        int rublesDigit = (int) roubles % 10;
        String rublesEnding = getRublesEnding((int) roubles, rublesDigit);

        System.out.println(yuan + " " + yuanEnding + " = " + (int) roubles + " " + rublesEnding);
    }

    public static String getYuanEnding(int yuan, int digit) {
        if (yuan % 100 >= 11 && yuan % 100 <= 14) {
            return "китайских юаней";
        } else if (digit == 1) {
            return "китайский юань";
        } else if (digit >= 2 && digit <= 4) {
            return "китайских юаня";
        } else {
            return "китайских юаней";
        }
    }

    public static String getRublesEnding(int roubles, int digit) {
        if (roubles % 100 >= 11 && roubles % 100 <= 14) {
            return "рублей";
        } else if (digit == 1) {
            return "рубль";
        } else if (digit >= 2 && digit <= 4) {
            return "рубля";
        } else {
            return "рублей";
        }
    }
}
