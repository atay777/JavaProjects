/*Напишите возвращающий метод типа массива int[] который берет в параметр число n,
мы внутри метода создадим массив int[] размером n. Нам нужно сгенерировать рандомные
числа массиву так чтобы каждое следующее число было больше предыдущей. */

import java.util.Random;

public class ex23 {
    public static void main(String[] args) {
        int n = 5; // Пример числа n
        int[] result = generateIncreasingRandomArray(n);
        System.out.println("Сгенерированный массив:");
        for (int number : result) {
            System.out.print(number + " ");
        }
    }

    public static int[] generateIncreasingRandomArray(int n) {
        int[] array = new int[n];
        Random random = new Random();
        array[0] = random.nextInt(100); // Генерируем первое число случайным образом
        for (int i = 1; i < n; i++) {
            array[i] = array[i - 1] + random.nextInt(10) + 1; // Следующее число больше предыдущего на случайное значение от 1 до 10
        }
        return array;
    }
}

