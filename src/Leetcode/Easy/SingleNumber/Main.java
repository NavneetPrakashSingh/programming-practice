package Leetcode.Easy.SingleNumber;

import java.util.HashMap;

//Given a non-empty array of integers, every element appears twice except for one. Find that single one.
public class Main {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])){
                int value = map.get(nums[i]);
                map.put(nums[i],value+1);
            }else{
                map.put(nums[i],1);
            }
        }

        for(int key: map.keySet()){
            if(map.get(key)==1){
                return key;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Main mainObj = new Main();
        int[] arr = {4,1,2,1,2};
        System.out.println(mainObj.singleNumber(arr));
    }
}
