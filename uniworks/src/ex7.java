import java.util.Scanner;

public class ex7 {    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Введите трехзначное число: ");
    int number = scanner.nextInt();

    if (number >= 100 && number <= 999) {
        int digit1 = number / 100;
        int digit2 = (number / 10) % 10;
        int digit3 = number % 10;

        int sum = digit1 + digit2 + digit3;

        System.out.println("Сумма цифр трехзначного числа " + number + " равна: " + sum);        } else {
        System.out.println("Ошибка! Введите трехзначное число.");        }
}}