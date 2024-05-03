import java.util.Scanner;

/* Напишите класс, который принимает с консоли для переменной X
целое положительное число, а затем дополнительно будет спрашивать
ещё числа, эти числа будут должны вычитаться из переменной x, вы
будете вводить числа до тех пор пока X не будет отрицательным или
равен 0. - используйте while loop*/

public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите значение переменной X: ");
        int x = scanner.nextInt();

        while (x > 0) {
            System.out.print("Введите число для вычитания: ");
            int num = scanner.nextInt();
            x -= num;

            if (x <= 0) {
                break; // Если x стало неположительным, выходим из цикла
            }

            System.out.println("Текущее значение X: " + x);
        }

        if (x <= 0) {
            System.out.println("Значение X стало неположительным или равно 0. Конец программы.");
        }

        scanner.close();
    }
}
