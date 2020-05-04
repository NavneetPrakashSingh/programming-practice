package Leetcode.Easy.ContainsDuplicate;

import java.util.HashMap;

//Given an array of integers, find if the array contains any duplicates.
public class Main {
    public boolean containsDuplicate(int[] nums) {
        if (nums.length <= 1) {
            return false;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                int value = map.get(nums[i]);
                map.put(nums[i], value + 1);
            } else {
                map.put(nums[i], 1);
            }
        }


        for(int values: map.values()){
            if(values>1){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Main mainObj = new Main();
        int[] input = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println(mainObj.containsDuplicate(input));
    }
}
