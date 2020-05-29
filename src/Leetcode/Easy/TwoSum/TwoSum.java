package Leetcode.Easy.TwoSum;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        if (nums.length <= 1) {
            return nums;
        }
        int firstIndex = 0;
        int secondIndex = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int otherNumber = target - nums[i];
            if (map.containsKey(nums[i])) {
                firstIndex = i;
                secondIndex = map.get(nums[i]);
            } else {
                map.put(otherNumber, i);
            }
        }
        int[] returningArray = new int[2];
        returningArray[0] = firstIndex;
        returningArray[1] = secondIndex;
        return returningArray;
    }

    public static void main(String[] args) {
        int[] input = {2, 2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(TwoSum.twoSum(input, target)));
    }
}
