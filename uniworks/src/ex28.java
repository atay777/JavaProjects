import java.util.Random;

public class ex28 {
    public static void main(String[] args) {
        Random random = new Random();

        int randomNumber = random.nextInt(90) + 10;

        System.out.println("Случайное двузначное число: " + randomNumber);

        int number1 = random.nextInt(randomNumber - 10) + 1;
        int number2 = random.nextInt(randomNumber - 10) + 1;
        int number3 = random.nextInt(randomNumber - 10) + 1;

        System.out.println("Три числа, меньших первого: " + number1 + ", " + number2 + ", " + number3);
    }
}