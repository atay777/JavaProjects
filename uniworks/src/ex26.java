import java.util.Scanner;

public class ex26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое имя: ");
        String firstName = scanner.nextLine();

        System.out.print("Введите второе имя: ");
        String secondName = scanner.nextLine();

        boolean areNamesSame = firstName.equalsIgnoreCase(secondName);

        if (areNamesSame) {
            System.out.println("Введенные имена являются тезками");
        } else {
            System.out.println("Введенные имена не являются тезками");
        }
    }
}