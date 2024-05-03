import java.util.Scanner;

public class ex20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите трехзначное положительное число: ");
        int number = scanner.nextInt();

        int countZeros = 0;
        if (number % 10 == 0) {
            countZeros++;
        }
        if ((number / 10) % 10 == 0) {
            countZeros++;
        }
        if (number / 100 == 0) {
            countZeros++;
        }

        System.out.println("Количество нулей в числе: " + countZeros);
    }
}