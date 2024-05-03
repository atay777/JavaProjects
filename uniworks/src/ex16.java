import java.util.Scanner;

public class ex16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое число: ");
        int number = scanner.nextInt();

        if (number < 0) {
            int square = number * number;
            System.out.println("Квадрат числа: " + square);
        } else {
            System.out.println("Ошибка");
        }
    }
}