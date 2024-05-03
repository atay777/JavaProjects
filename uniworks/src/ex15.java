import java.util.Scanner;

public class ex15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число ");
        int number1 = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int number2 = scanner.nextInt();

        System.out.print("Введите третье число: ");
        int number3 = scanner.nextInt();

        if (number1 <= number2 && number1 <= number3) {
            System.out.print(number1 + ", ");
            if (number2 <= number3) {
                System.out.print(number2 + ", " + number3);
            } else {
                System.out.print(number3 + ", " + number2);
            }
        } else if (number2 <= number1 && number2 <= number3) {
            System.out.print(number2 + ", ");
            if (number1 <= number3) {
                System.out.print(number1 + ", " + number3);
            } else {
                System.out.print(number3 + ", " + number1);
            }
        } else {
            System.out.print(number3 + ", ");
            if (number1 <= number2) {
                System.out.print(number1 + ", " + number2);
            } else {
                System.out.print(number2 + ", " + number1);
            }
        }
    }
}