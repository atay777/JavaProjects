import java.util.Scanner;

/*Напишите класс, который принимает с клавиатуры целое положительное число любой длины,
а затем выводит его первую цифру. Например, для числа 7659 на экран будет выведено 7*/

public class ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое положительное число любой длины: ");
        long number = scanner.nextLong();

        int firstDigit = findFirstDigit(number);
        System.out.println("Первая цифра числа: " + firstDigit);

        scanner.close();
    }

    public static int findFirstDigit(long number) {
        // Продолжаем делить число на 10, пока не достигнем первой цифры
        while (number >= 10) {
            number /= 10;
        }
        return (int) number; // Первая цифра числа
    }
}
