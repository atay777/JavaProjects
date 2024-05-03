/*Напишите не возвращающий метод который получает в качестве параметра не заполненный
массив с размером 15. Нужно массив заполнить положительными случайными двузначными
четными числами. И вывести элементы массива в консоль в одну строку через пробел.*/

import java.util.Random;

public class ex20 {
    public static void main(String[] args) {
        int[] array = new int[15];
        fillArrayWithEvenNumbers(array);
        printArray(array);
    }

    public static void fillArrayWithEvenNumbers(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            int randomNumber;
            do {
                randomNumber = random.nextInt(90) + 10; // Генерируем случайное двузначное число
            } while (randomNumber % 2 != 0); // Проверяем, что число четное
            array[i] = randomNumber;
        }
    }

    public static void printArray(int[] array) {
        for (int number : array) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}

