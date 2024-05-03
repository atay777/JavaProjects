/*Напишите возвращающий метод типа boolean, который в качестве
параметра принимает наполненный положительными числами массив.
Верните значение true, если один из первых 4 элементов в массиве
равен 9. Длина массива может быть меньше 4. */

public class ex29 {
    public static boolean contains9(int[] nums) {
        int len = Math.min(nums.length, 4);

        for (int i = 0; i < len; i++) {
            if (nums[i] == 9) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 9, 5};
        System.out.println(contains9(nums1)); // Выведет true

        int[] nums2 = {1, 2, 3, 4};
        System.out.println(contains9(nums2)); // Выведет false

        int[] nums3 = {9, 2};
        System.out.println(contains9(nums3)); // Выведет true

        int[] nums4 = {5, 6, 7, 8};
        System.out.println(contains9(nums4)); // Выведет false
    }
}

