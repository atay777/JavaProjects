/* Напишите возвращающий метод типа массива char [], который в качестве
параметра берет число n и boolean b. Число n означает количество букв для
заполнения, если boolean b будет true, то нужно вернуть char[] массив
состоящий из n заглавных букв, если же false то прописными буквами (маленькими). */

public class ex21 {
    public static void main(String[] args) {
        int n = 5; // Пример числа n
        boolean b = true; // Пример значения b
        char[] generatedArray = generateCharArray(n, b);
        System.out.println("Сгенерированный массив символов: " + new String(generatedArray));
    }

    public static char[] generateCharArray(int n, boolean b) {
        char[] array = new char[n];
        char startChar = b ? 'A' : 'a';
        for (int i = 0; i < n; i++) {
            array[i] = (char) (startChar + i);
        }
        return array;
    }
}
