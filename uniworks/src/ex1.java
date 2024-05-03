import java.util.Scanner;

public class ex1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите трехзначное число: ");
        int number = scanner.nextInt();

        int digit1 = number / 100;
        int digit2 = (number / 10) % 10;
        int digit3 = number % 10;

        System.out.println("Число в обратном порядке: " + digit3  + " "+  digit2  + " " + digit1);
    }
}