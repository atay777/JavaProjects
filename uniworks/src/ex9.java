import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int number = scanner.nextInt();
        if (number > 0) {
            System.out.println("Введено положительное число.");        }
        else if (number < 0) {
            System.out.println("Введено отрицательное число.");        }
        else {
            System.out.println("Введен ноль.");        }
    }
}