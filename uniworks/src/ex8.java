import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое число: ");
        int number = scanner.nextInt();

        if (number > 0) {

            number *= 2;
            System.out.println("Положительное число. Удваиваем его: " + number);
        } else {
            System.out.println("Отрицательное или нулевое число. Оставляем без изменений: " + number);
        }
    }
}