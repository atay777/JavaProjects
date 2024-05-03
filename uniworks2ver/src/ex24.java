/*Напишите метод возвращающий тип boolean , который принимает в качестве
параметра массив целых чисел и проверяет, являются ли все элементы массива
положительными числами. Если все элементы положительные то вернуть true,
в других случая вернуть false. */

public class ex24 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5}; // Пример массива с положительными числами
        int[] array2 = {1, -2, 3, 4, 5}; // Пример массива с отрицательным числом

        System.out.println("Результат для массива array1: " + areAllPositive(array1));
        System.out.println("Результат для массива array2: " + areAllPositive(array2));
    }

    public static boolean areAllPositive(int[] array) {
        for (int number : array) {
            if (number <= 0) {
                return false;
            }
        }
        return true;
    }
}
