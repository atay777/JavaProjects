import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите трехзначное число: ");
        int number = scanner.nextInt();

        int digit1 = number / 100;
        int digit2 = (number / 10) % 10;
        int digit3 = number % 10;

        if (digit1 % 2 == 0 && digit2 % 2 == 0 && digit3 % 2 == 0) {
            System.out.println("Число является четнокрасивым.");
        } else {
            System.out.println("Число не является четнокрасивым.");
        }
    }
}