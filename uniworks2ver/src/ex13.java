/*Напишите не возвращающий метод, который берет в параметры массив из boolean типа,
и выводит в консоль количество true элементов массива. */

public class ex13 {
    public static void main(String[] args) {
        boolean[] array = {true, false, true, true, false, false, true};
        countTrueElements(array);
    }

    public static void countTrueElements(boolean[] array) {
        int count = 0;
        for (boolean element : array) {
            if (element) {
                count++;
            }
        }
        System.out.println("Количество элементов true в массиве: " + count);
    }
}
