import java.util.Scanner;

public class ex24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите положительное трехзначное число: ");
        int number = scanner.nextInt();

        if (number < 100 || number > 999) {
            System.out.println("Введенное число не является трехзначным.");
        } else {
            int digit1 = number % 10;
            int digit2 = (number / 10) % 10;
            int digit3 = number / 100;

            int count = 0;

            if (digit1 != digit2 && digit1 != digit3) {
                count++;
            }

            if (digit2 != digit1 && digit2 != digit3) {
                count++;
            }

            if (digit3 != digit1 && digit3 != digit2) {
                count++;
            }

            System.out.println("Количество разных цифр: " + count);
        }
    }
}