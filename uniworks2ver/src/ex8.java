/*На спектакль в кассу театра было выделено определенное количество билетов,
и продажа осуществлялась до тех пор, пока не были проданы все билеты. Напишите
класс, который сначала принимает с клавиатуры количество билетов, переданных
в кассу. Затем класс принимает с клавиатуры серию чисел, каждое из которых
указывает на число билетов, которое желает приобрести покупатель. Если нет
возможности продать очередному покупателю требуемое им число билетов, принимается
заказ от следующего покупателя. Класс должен вывести в консоль: ● Какое число
покупателей приобрели билеты ● Какому числу покупателей было отказано в продаже
билетов */

import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите общее количество билетов, выделенных в кассу: ");
        int totalTickets = scanner.nextInt();

        int soldTickets = 0;
        int refusedCustomers = 0;

        while (totalTickets > 0) {
            System.out.print("Введите количество билетов, которые желает приобрести покупатель (или 0 для завершения): ");
            int requestedTickets = scanner.nextInt();

            if (requestedTickets == 0) {
                break; // Завершаем цикл, если покупатель ввел 0
            }

            if (requestedTickets <= totalTickets) {
                soldTickets += requestedTickets;
                totalTickets -= requestedTickets;
            } else {
                System.out.println("Извините, невозможно продать требуемое количество билетов.");
                refusedCustomers++;
            }
        }

        System.out.println("Число покупателей, приобретших билеты: " + soldTickets);
        System.out.println("Число покупателей, которым было отказано в продаже билетов: " + refusedCustomers);

        scanner.close();
    }
}
