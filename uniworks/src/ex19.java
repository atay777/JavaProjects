import java.util.Scanner;

public class ex19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите трехзначное положительное число: ");
        int number = scanner.nextInt();

        // Проверка условия "дважды четный"
        boolean isDoubleEven = isEven(number) && isEven(getDigitSum(number));

        // Вывод соответствующего текстового сообщения
        if (isDoubleEven) {
            System.out.println("Число является дважды четным");
        } else {
            System.out.println("Число не является дважды четным");
        }
    }

    // Метод для проверки четности числа
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    // Метод для получения суммы цифр числа
    public static int getDigitSum(int number) {
        int sum = 0;

        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }

        return sum;
    }
}