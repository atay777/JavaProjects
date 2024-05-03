/*Дан массив состоящий из целых положительных чисел, и целое число n.
Массив можно вручную заполнить (не сканнер), целое число n тоже можно
дать вручную. Нужно найти с помощью суммы каких двух чисел массива мы
можем получить число n, если есть такие числа нужно вернуть их индексы,
если таких нет то вывести на экран таких нету. Пример: массив -> {2, 7,
11, 15, 45}, число n -> 9 Нужно получить {0, 1} -> это индексы чисел с
помощью суммы которых можно получить число n Пример: массив -> {3, 2, 4},
число n -> 6 Нужно получить {1, 2} -> это индексы чисел с помощью суммы
которых можно получить число n Пример: массив -> {3, 3}, число n -> 6
Нужно получить {0, 1} -> это индексы чисел с помощью суммы которых можно
получить число n Пример: массив -> {2, 7, 11, 15, 45}, число n -> 14 Нужно
получить -1*/

import java.util.HashMap;
import java.util.Map;

public class ex25 {
    public static int[] findTwoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }

        return new int[] {-1, -1};
    }

    public static void main(String[] args) {
        int[] nums1 = {2, 7, 11, 15, 45};
        int target1 = 9;
        int[] result1 = findTwoSum(nums1, target1);
        if (result1[0] == -1) {
            System.out.println("Таких пар чисел нет");
        } else {
            System.out.println("{" + result1[0] + ", " + result1[1] + "}");
        }

        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        int[] result2 = findTwoSum(nums2, target2);
        if (result2[0] == -1) {
            System.out.println("Таких пар чисел нет");
        } else {
            System.out.println("{" + result2[0] + ", " + result2[1] + "}");
        }

        int[] nums3 = {3, 3};
        int target3 = 6;
        int[] result3 = findTwoSum(nums3, target3);
        if (result3[0] == -1) {
            System.out.println("Таких пар чисел нет");
        } else {
            System.out.println("{" + result3[0] + ", " + result3[1] + "}");
        }

        int[] nums4 = {2, 7, 11, 15, 45};
        int target4 = 14;
        int[] result4 = findTwoSum(nums4, target4);
        if (result4[0] == -1) {
            System.out.println("Таких пар чисел нет");
        } else {
            System.out.println("{" + result4[0] + ", " + result4[1] + "}");
        }
    }
}

