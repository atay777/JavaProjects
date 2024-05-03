import java.util.Scanner;

public class ex17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество учеников в классе: ");
        int numberOfStudents = scanner.nextInt();

        System.out.print("Введите количество стульев в классной комнате: ");
        int numberOfSeats = scanner.nextInt();

        if (numberOfStudents > numberOfSeats) {
            int extraSeats = numberOfStudents - numberOfSeats;
            System.out.println("Лишних стульев: " + extraSeats);
        } else if (numberOfStudents < numberOfSeats) {
            int missingSeats = numberOfSeats - numberOfStudents;
            System.out.println("Недостающих стульев: " + missingSeats);
        } else {
            System.out.println("Количество учеников и стульев соответствует");
        }
    }
}