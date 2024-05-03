/*Напишите возвращающий метод типа String, который в качества параметра прнинимает число,
и возвращает день недели как слово String. (Можно использовать switch or if else) */

public class ex19 {
    public static void main(String[] args) {
        int day = 3; // Пример числа (1 - понедельник, 2 - вторник, и т.д.)
        String dayOfWeek = getDayOfWeek(day);
        System.out.println("День недели для числа " + day + ": " + dayOfWeek);
    }

    public static String getDayOfWeek(int day) {
        String dayOfWeek;
        switch (day) {
            case 1:
                dayOfWeek = "понедельник";
                break;
            case 2:
                dayOfWeek = "вторник";
                break;
            case 3:
                dayOfWeek = "среда";
                break;
            case 4:
                dayOfWeek = "четверг";
                break;
            case 5:
                dayOfWeek = "пятница";
                break;
            case 6:
                dayOfWeek = "суббота";
                break;
            case 7:
                dayOfWeek = "воскресенье";
                break;
            default:
                dayOfWeek = "недопустимое значение";
                break;
        }
        return dayOfWeek;
    }
}
