/* Напишите возвращающий метод типа boolean, который в качестве параметра берет
заполненный массив именами, и String name.
Нам нужно в массиве найти 2-ой параметр name, если мы его нашли и его индекс
это четное число то вернуть true, в иных случаях вернуть false. */

import java.util.Scanner;
public class ex22 {
    public static void main(String[] args) {
        String[] names = {"Каныкей", "Айдай", "Бакыт", "Калыс", "Жаркынай"};
        System.out.println("Введите имя: ");
        Scanner scanner = new Scanner(System.in);
        String nameToFind = scanner.nextLine();
        boolean result = isEvenIndex(names, nameToFind);
        System.out.println("Результат: " + result);
    }

    public static boolean isEvenIndex(String[] names, String name) {
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals(name)) {
                return i % 2 == 0;
            }
        }
        return false;
    }
}
