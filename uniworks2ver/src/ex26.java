/*Напишите возвращающий метод типа boolean, который в качестве
параметра берет массив из положительных чисел. Если в массиве
всего 5 чисел равных 2, то вывести true, а в остальных случая false. */

public class ex26 {
    public static boolean checkArray(int[] nums) {
        int count = 0;

        for (int num : nums) {
            if (num == 2) {
                count++;
            }
        }

        return count == 5;
    }

    public static void main(String[] args) {
        int[] nums1 = {2, 2, 2, 2, 2};
        System.out.println(checkArray(nums1)); // Выведет true

        int[] nums2 = {2, 2, 2, 2, 3};
        System.out.println(checkArray(nums2)); // Выведет false

        int[] nums3 = {1, 2, 3, 4, 5};
        System.out.println(checkArray(nums3)); // Выведет false
    }
}

