/*Напишите не возвращающий метод который в параметры берет массив из рандомных чисел от 1 до 50 и
выводит в консоль только те числа что больше 20. */

import java.util.Random;

public class ex14 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = generateRandomArray(10, random);
        printNumbersGreaterThan20(array);
    }

    public static void printNumbersGreaterThan20(int[] array) {
        System.out.println("Числа больше 20:");
        for (int number : array) {
            if (number > 20) {
                System.out.print(number + " ");
            }
        }
        System.out.println();
    }

    public static int[] generateRandomArray(int size, Random random) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(50) + 1; // Генерируем случайное число от 1 до 50
        }
        return array;
    }
}
