/*Напишите метод, который принимает в качестве параметра массив целых чисел
и число К, число К это индекс в массиве. Нам нужно вывести сумму всех чисел
до индекса K массива. */

public class ex17 {
    public static void main(String[] args) {
        int[] array = {3, 7, 2, 8, 5};
        int k = 3; // Пример индекса K
        int sum = sumBeforeIndex(array, k);
        System.out.println("Сумма всех чисел до индекса " + k + " равна " + sum);
    }

    public static int sumBeforeIndex(int[] array, int k) {
        if (k < 0 || k >= array.length) {
            throw new IllegalArgumentException("Индекс K находится за пределами границ массива.");
        }

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += array[i];
        }
        return sum;
    }
}
