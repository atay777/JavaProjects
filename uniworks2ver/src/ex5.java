import java.util.Scanner;


/* Напишите класс, который принимает с клавиатуры целое число любой длины и
выводит на экран: ● в первой строке - все четные цифры этого числа, через
пробел ● во второй строке - все нечетные цифры этого числа, через пробел
Например, для числа 765873 в первой строке будет выведены числа 6 8, а во
второй строке 7 5 7 3 - Нельзя использовать массив */

public class ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое число любой длины: ");
        long number = scanner.nextLong();

        System.out.println("Четные цифры числа:");
        printEvenDigits(number);

        System.out.println("Нечетные цифры числа:");
        printOddDigits(number);

        scanner.close();
    }

    public static void printEvenDigits(long number) {
        while (number != 0) {
            long digit = number % 10;
            if (digit % 2 == 0) {
                System.out.print(digit + " ");
            }
            number /= 10;
        }
        System.out.println();
    }

    public static void printOddDigits(long number) {
        while (number != 0) {
            long digit = number % 10;
            if (digit % 2 != 0) {
                System.out.print(digit + " ");
            }
            number /= 10;
        }
        System.out.println();
    }
}
