import java.util.Scanner;

public class ex22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите шестизначный номер билета: ");
        int ticketNumber = scanner.nextInt();

        int firstHalfSum = (ticketNumber / 100000) + ((ticketNumber / 10000) % 10) + ((ticketNumber / 1000) % 10);
        int secondHalfSum = ((ticketNumber / 100) % 10) + ((ticketNumber / 10) % 10) + (ticketNumber % 10);
        boolean isLucky = (firstHalfSum == secondHalfSum) && (firstHalfSum % 2 == 0);

        if (isLucky) {
            System.out.println("Билет является счастливым");
        } else {
            System.out.println("Билет не является счастливым");
        }
    }
}