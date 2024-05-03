import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое целое число: ");
        int number1 = scanner.nextInt();

        System.out.print("Введите второе целое число: ");
        int number2 = scanner.nextInt();

        if (number1 > number2) {
            int sum = number1 + number2;
            System.out.println("Сумма чисел: " + sum);
        } else if (number1 < number2) {
            int product = number1 * number2;
            System.out.println("Произведение чисел: " + product);
        } else {
            System.out.println("Числа равны.");
        }
    }
}