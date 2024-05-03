import java.util.Scanner;

public class ex4 {    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Введите трехзначное число: ");
    int number = scanner.nextInt();

    int hundreds = number / 100;
    int tens = (number / 10) % 10;
    int ones = number % 10;
    System.out.println("Output: " + hundreds * 100 + "+" + tens * 10 + "+" + ones);
}}