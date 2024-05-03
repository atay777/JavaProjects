/*Напишите не возвращающий метод, который берет массив из рандомных чисел от 1 до 50
и еще одно целое число n. Нужно вывести в консоль сколько раз число n повторялось в
массиве.*/

import java.util.Random;

public class ex15 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = generateRandomArray(10, random);
        int n = 25; // Пример числа n
        countOccurrences(array, n);
    }

    public static void countOccurrences(int[] array, int n) {
        int count = 0;
        for (int number : array) {
            if (number == n) {
                count++;
            }
        }
        System.out.println("Число " + n + " повторяется в массиве " + count + " раз(а).");
    }

    public static int[] generateRandomArray(int size, Random random) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(50) + 1; // Генерируем случайное число от 1 до 50
        }
        return array;
    }
}
