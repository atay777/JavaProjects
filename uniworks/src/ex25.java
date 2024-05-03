import java.util.Scanner;

public class ex25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите символ: ");
        char symbol = scanner.next().charAt(0);

        // Проверка на букву латинского алфавита
        boolean isLatinLetter = (symbol >= 'a' && symbol <= 'z') || (symbol >= 'A' && symbol <= 'Z');

        // Вывод результата
        if (isLatinLetter) {
            System.out.println("Введенный символ является буквой латинского алфавита");
        } else {
            System.out.println("Введенный символ не является буквой латинского алфавита");
        }
    }
}