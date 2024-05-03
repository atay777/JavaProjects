import java.util.Scanner;

public class ex14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        System.out.print("Enter the number of seats: ");
        int numberOfSeats = scanner.nextInt();

        if (numberOfStudents <= numberOfSeats) {
            System.out.println("There is enough space for all the students.");
        } else {
            System.out.println("There is not enough space for all the students.");
        }
    }
}