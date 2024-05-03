import java.util.Scanner;
import java.util.Random;

public class ex30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Введите число (1 - камень, 2 - ножницы, 3 - бумага): ");
        int userInput = scanner.nextInt();

        int computerChoice = random.nextInt(3) + 1;

        System.out.println("Компьютер выбрал: " + getChoiceName(computerChoice));

        if (userInput == computerChoice) {
            System.out.println("Ничья!");
        } else if ((userInput == 1 && computerChoice == 2) ||
                (userInput == 2 && computerChoice == 3) ||
                (userInput == 3 && computerChoice == 1)) {
            System.out.println("Вы победили!");
        } else {
            System.out.println("Компьютер победил!");
        }
    }

    private static String getChoiceName(int choice) {
        switch (choice) {
            case 1:
                return "камень";
            case 2:
                return "ножницы";
            case 3:
                return "бумага";
            default:
                return "";
        }
    }
}