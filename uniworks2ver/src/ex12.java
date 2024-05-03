/*Напишите класс, который заполняет случайными двузначными числами
массив, размер которого вводится с клавиатуры. После заполнения класс
должен вывести на экран значения массива следующим образом: ● в первой
строке – четные значения, содержащиеся в массиве ● во второй строке –
нечетные значения, содержащиеся в массиве*/

import java.util.Scanner;
import java.util.Random;

public class ex12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        int[] array = generateRandomArray(size);

        System.out.println("Четные значения массива:");
        printEvenNumbers(array);

        System.out.println("Нечетные значения массива:");
        printOddNumbers(array);

        scanner.close();
    }

    public static int[] generateRandomArray(int size) {
        int[] array = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(90) + 10; // Генерируем случайное двузначное число
        }

        return array;
    }

    public static void printEvenNumbers(int[] array) {
        for (int number : array) {
            if (number % 2 == 0) {
                System.out.print(number + " ");
            }
        }
        System.out.println();
    }

    public static void printOddNumbers(int[] array) {
        for (int number : array) {
            if (number % 2 != 0) {
                System.out.print(number + " ");
            }
        }
        System.out.println();
    }
}
