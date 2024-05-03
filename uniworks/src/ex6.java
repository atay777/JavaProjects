import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите трехзначное целое число: ");
        int number = scanner.nextInt();

        if (number >= 100 && number <= 999) {
            int reversedNumber = (number % 10) * 100 + ((number / 10) % 10) * 10 + (number / 100);
            System.out.println("Число, обратное введенному: " + reversedNumber);

            int decreasedNumber = reversedNumber - 20;
            System.out.println("Число, уменьшенное на 20: " + decreasedNumber);
        } else {
            System.out.println("Ошибка! Введите трехзначное число.");
        }
    }
}