import java.util.Scanner;
import java.util.Random;

public class ex29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Введите нижний диапазон: ");
        int lowerRange = scanner.nextInt();

        System.out.print("Введите верхний диапазон: ");
        int upperRange = scanner.nextInt();

        int randomNumber = random.nextInt(upperRange - lowerRange + 1) + lowerRange;

        System.out.print("Введите число: ");
        int userInput = scanner.nextInt();

        if (userInput == randomNumber) {
            System.out.println("Ученик найден!");
        } else {
            System.out.println("Ученик не найден.");
        }
    }
}