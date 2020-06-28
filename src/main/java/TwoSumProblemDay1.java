import java.util.HashMap;
import java.util.Map;

/*

Given an array of integers, return indices of the two numbers such that they add up to a specific target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
Example:
Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
 */

public class TwoSumProblemDay1 {

    public static void main(String[] args) {
    }

    public int[] twoSum(int[] nums, int target) {

        int[] a = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if ((nums[i] + nums[j]) == target) {
                    a[0] = nums[i];
                    a[1] = nums[j];
                    return a;
                }
            }
        }
        return null;

    }

    public int[] twoSumTwoHashMap(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[] { i, map.get(complement) };
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    //Best Solution :D
    public int[] twoSumOnePassHash(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }


}
