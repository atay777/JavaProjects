import java.util.Random;

public class ex27 {
    public static void main(String[] args) {
        Random random = new Random();

        int randomNumber = random.nextInt(90) + 10;

        System.out.println("Случайное двузначное число: " + randomNumber);
    }
}