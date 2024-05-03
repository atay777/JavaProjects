/*Напишите класс, который заполняет случайными четырехзначными числами
массив, размер которого вводится с клавиатуры. После заполнения класс
должен вывести на экран значения массива в одной строке, начиная с конца
массива ( с последнего индекса). */

import java.util.Scanner;
import java.util.Random;

public class ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        int[] array = generateRandomArray(size);

        System.out.println("Сгенерированный массив (начиная с конца):");
        printArrayReversed(array);

        scanner.close();
    }

    public static int[] generateRandomArray(int size) {
        int[] array = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            array[i] = 1000 + random.nextInt(9000); // Генерируем случайное четырехзначное число
        }

        return array;
    }

    public static void printArrayReversed(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}