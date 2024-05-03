import java.util.Scanner;

public class ex18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите четырехзначное число: ");
        int number = scanner.nextInt();

        if (number < 1000 || number > 9999) {
            System.out.println("Неверный Ввод. Пожалуйста, введите четырехзначный номер.");
            return;
        }

        int firstTwoDigits = number / 100;
        int lastTwoDigits = number % 100;

        if (firstTwoDigits < lastTwoDigits) {
            System.out.println(firstTwoDigits + " < " + lastTwoDigits);
        } else if (firstTwoDigits > lastTwoDigits) {
            System.out.println(firstTwoDigits + " > " + lastTwoDigits);
        } else {
            System.out.println(firstTwoDigits + " = " + lastTwoDigits);
        }
    }
}