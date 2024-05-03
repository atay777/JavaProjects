/*Напишите возвращающий метод типа массива int, который в параметры принимает
массив и возвращает новый массив состоящий только из четных элементов массива А. */

import java.util.Arrays;

public class ex18 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] evenArray = getEvenElements(array);
        System.out.println("Массив из четных элементов исходного массива: " + Arrays.toString(evenArray));
    }

    public static int[] getEvenElements(int[] array) {
        int count = 0;
        for (int number : array) {
            if (number % 2 == 0) {
                count++;
            }
        }

        int[] evenArray = new int[count];
        int index = 0;
        for (int number : array) {
            if (number % 2 == 0) {
                evenArray[index] = number;
                index++;
            }
        }
        return evenArray;
    }
}
