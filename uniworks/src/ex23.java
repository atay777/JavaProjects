import java.util.Scanner;

public class ex23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите порядковый номер месяца: ");
        int monthNumber = scanner.nextInt();

        String season;
        if (monthNumber >= 1 && monthNumber <= 12) {
            if (monthNumber >= 3 && monthNumber <= 5) {
                season = "весна";
            } else if (monthNumber >= 6 && monthNumber <= 8) {
                season = "лето";
            } else if (monthNumber >= 9 && monthNumber <= 11) {
                season = "осень";
            } else {
                season = "зима";
            }

            System.out.println("Сезон: " + season);
        } else {
            System.out.println("Введенное значение не является порядковым номером месяца");
        }
    }
}