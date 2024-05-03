import java.util.Random;

/* Напишите класс, который генерирует 20 рандомных целых чисел из
диапазона -50 до +50, и определяет наименьшее число и наибольшее число.
- Нельзя использовать массив */

public class ex2 {
    public static void main(String[] args) {
        Random random = new Random();
        int min = 51; // Инициализируем min значением, которое будет заменено
        int max = -51; // Инициализируем max значением, которое будет заменено

        System.out.println("Сгенерированные случайные числа:");

        for (int i = 0; i < 20; i++) {
            int randomNumber = random.nextInt(101) - 50; // Генерируем случайное число в диапазоне от -50 до 50
            System.out.println(randomNumber);

            // Проверяем, является ли текущее число новым минимальным или максимальным
            if (randomNumber < min) {
                min = randomNumber;
            }
            if (randomNumber > max) {
                max = randomNumber;
            }
        }

        System.out.println("Наименьшее число: " + min);
        System.out.println("Наибольшее число: " + max);
    }
}
