import java.util.Random;

/* Напишите класс, который создает 20 случайных чисел диапазона 1 - 99.
Следует вывести в консоль только те числа которые делятся на 1-ое рандомное
число без остатка. - Нельзя использовать массив. */

public class ex1 {
    public static void main(String[] args) {
        Random random = new Random();
        int firstRandomNumber = random.nextInt(99) + 1; // Генерируем первое случайное число

        System.out.println("Первое случайное число: " + firstRandomNumber);
        System.out.println("Числа, которые делятся на первое случайное число без остатка:");

        int count = 0;
        for (int i = 0; i < 20; i++) {
            int randomNumber = random.nextInt(99) + 1;
            // Генерируем следующее случайное число
            if (randomNumber % firstRandomNumber == 0) {
                // Проверяем деление на первое случайное число без остатка
                System.out.println(randomNumber);
                count++;
            }
        }

        if (count == 0) {
            System.out.println("Нет чисел, делящихся на первое случайное число без остатка.");
        }
    }
}
