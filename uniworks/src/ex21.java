import java.util.Scanner;

public class ex21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите положительное целое число: ");
        int number = scanner.nextInt();

        int lowerCoolNumber = (number / 10) * 10;
        int upperCoolNumber = lowerCoolNumber + 10;

        int nearestCoolNumber;
        if (number - lowerCoolNumber < upperCoolNumber - number) {
            nearestCoolNumber = lowerCoolNumber;
        } else {
            nearestCoolNumber = upperCoolNumber;
        }

        System.out.println("Ближайшее крутое число: " + nearestCoolNumber);
    }
}