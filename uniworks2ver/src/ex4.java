import java.util.Scanner;

/*Напишите класс, который принимает с клавиатуры две переменный
это два числа, пока не будет введено две одинаковых чисел. Класс
должен выводить на экран сумму всех первых чисел и сумму всех вторых
чисел (не считая чисел, введенных одинаковыми).*/

public class ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstSum = 0;
        int secondSum = 0;
        int firstNumber, secondNumber;

        System.out.println("Введите два числа ↓");

        do {
            System.out.print("Первое число: ");
            firstNumber = scanner.nextInt();
            firstSum += firstNumber;

            System.out.print("Второе число: ");
            secondNumber = scanner.nextInt();
            secondSum += secondNumber;

            if (firstNumber != secondNumber) {
                int sumOfNumbers = firstNumber + secondNumber;
                System.out.println("Сумма чисел: " + sumOfNumbers);
            }

        } while (firstNumber != secondNumber);

        System.out.println("Оба числа равны. Программа завершена.");

        scanner.close();
    }
}
