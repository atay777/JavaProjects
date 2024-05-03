/*Напишите возвращающий метод типа String, который в качестве параметра берет
String word и целое положительное число n. Нужно создать такой String в котором
word будет повторяться n раз, и в конце надо этот String вернуть. Пример: “Hi”,
4 -> “HiHiHiHi”*/

import java.util.Scanner;

public class ex27 {
    public static String repeatWord(String word, int n) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < n; i++) {
            result.append(word);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println("Введите слово: ");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        System.out.println("Введите количество: ");
        int n = scanner.nextInt();
        System.out.println(repeatWord(word, n)); // Выведет "HiHiHiHi"
    }
}
