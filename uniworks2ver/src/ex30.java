/*. Напишите возвращающий метод типа boolean, который в качестве параметра
принимает наполненный положительными числами массив. Верните значение true,
если в массиве встречаются 3 одинаковых числа подряд, в ином случае false. */

public class ex30 {
    public static boolean hasThreeConsecutive(int[] nums) {
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] == nums[i - 1] && nums[i] == nums[i - 2]) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 2, 5};
        System.out.println(hasThreeConsecutive(nums1)); // Выведет false

        int[] nums2 = {1, 2, 2, 2, 2};
        System.out.println(hasThreeConsecutive(nums2)); // Выведет true

        int[] nums3 = {1, 2, 3, 4, 5};
        System.out.println(hasThreeConsecutive(nums3)); // Выведет false

        int[] nums4 = {1, 2, 3, 3, 3};
        System.out.println(hasThreeConsecutive(nums4)); // Выведет true
    }
}
