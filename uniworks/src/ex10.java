import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое положительное число: ");
        int number = scanner.nextInt();

        if (number >= 100) {
            number -= 1;
            System.out.println("Уменьшенное число: " + number);
        } else {
            System.out.println("Введенное число не является как минимум трехзначным и положительным.");
        }
    }
}