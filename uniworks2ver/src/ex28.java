/*Напишите возвращающий метод типа boolean, который в качестве параметров
принимает массив целых чисел. Верните значение true, если последовательность
чисел 1, 2, 3 где-то появляется в массиве. */

public class ex28 {
    public static boolean contains123(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == 1 && nums[i + 1] == 2 && nums[i + 2] == 3) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4, 5};
        System.out.println(contains123(nums1)); // Выведет true

        int[] nums2 = {1, 2, 4, 5, 3};
        System.out.println(contains123(nums2)); // Выведет false

        int[] nums3 = {3, 2, 1};
        System.out.println(contains123(nums3)); // Выведет false
    }
}

