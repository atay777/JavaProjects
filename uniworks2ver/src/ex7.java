import java.util.Scanner;

/*Напишите класс, который принимает с клавиатуры целое число любой длины
и строит из него число с обратным порядком цифр. Новое значение следует
вывести в консоль.
*/

public class ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое число любой длины: ");
        long number = scanner.nextLong();

        long reversedNumber = reverseDigits(number);
        System.out.println("Число с обратным порядком цифр: " + reversedNumber);

        scanner.close();
    }

    public static long reverseDigits(long number) {
        long reversedNumber = 0;
        while (number != 0) {
            long digit = number % 10; // Получаем последнюю цифру числа
            reversedNumber = reversedNumber * 10 + digit; // Добавляем цифру к обратному числу
            number /= 10; // Убираем последнюю цифру из исходного числа
        }
        return reversedNumber;
    }
}
