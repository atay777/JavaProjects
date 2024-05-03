import java.util.Scanner;


public class ex2 {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите двузначное число: ");
        int number = scanner.nextInt();

        int tens = number / 10;        int ones = number % 10;

        System.out.println("Output: " + tens * 10 + "+" + ones);    }
}