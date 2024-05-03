import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите двузначное число: ");
        int number = scanner.nextInt();

        int firstDigit = number / 10;
        int secondDigit = number % 10;
        int product = firstDigit * secondDigit;

        if (product >= 10 && product <= 99) {
            System.out.println(number + " > " + product);
        } else if (product == number) {
            System.out.println(number + " равно " + product);
        } else {
            System.out.println("Произведение не является двузначным числом.");
        }
    }
}