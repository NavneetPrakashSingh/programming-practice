package ProgrammingCreek;
import java.util.*;
public class SumOfTwoNumbers {
    //return indexs of two numbers in the array which adds up to the target value
    public int[] twoSum(int[] nums, int target){
        int[] twoNumbers = new int[2];
        if(nums.length == 0 || target<0){
            return twoNumbers;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])){
                return new int[]{map.get(nums[i]),i};
            }else{
                map.put(target-nums[i],i);
            }
        }
        return twoNumbers;
    }
    public static void main(String[] args){
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        SumOfTwoNumbers hwObj = new SumOfTwoNumbers();
        int[] resultArray = hwObj.twoSum(nums, target);
        System.out.println("Index: "+resultArray[0]+","+resultArray[1]);
    }
}
