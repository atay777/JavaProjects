/*Напишите класс, который заполняет случайными двузначными числами массив,
размер которого вводится с клавиатуры. После заполнения класс должен вывести
на экран значения массива следующим образом: ● в первой строке - первую половину
массива ● во второй строке - вторую половину массива */

import java.util.Scanner;
import java.util.Random;

public class ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива (четное число): ");
        int size = scanner.nextInt();

        if (size % 2 != 0) {
            System.out.println("Размер массива должен быть четным числом.");
            return;
        }

        int[] array = generateRandomArray(size);

        System.out.println("Первая половина массива:");
        printArrayHalf(array, 0, size / 2);

        System.out.println("Вторая половина массива:");
        printArrayHalf(array, size / 2, size);

        scanner.close();
    }

    public static int[] generateRandomArray(int size) {
        int[] array = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            array[i] = 10 + random.nextInt(90); // Генерируем случайное двузначное число
        }

        return array;
    }

    public static void printArrayHalf(int[] array, int start, int end) {
        for (int i = start; i < end; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
