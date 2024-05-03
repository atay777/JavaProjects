import java.util.Scanner;
public class ex5 {    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Введите двузначное целое число: ");
    int number = scanner.nextInt();

    if (number >= 10 && number <= 99) {

        int reversedNumber = (number % 10) * 10 + (number / 10);
        System.out.println("Число, обратное введенному: " + reversedNumber);

        int increasedNumber = number + 8;
        System.out.println("Число, увеличенное на 8: " + increasedNumber);
    } else {
        System.out.println("Ошибка! Введите двузначное число.");
    }
}
}