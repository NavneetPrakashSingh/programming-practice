package ProgrammingCreek;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class ContainsDuplicateIII {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k,int t) {
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])){
                List<Integer> currentList = map.get(nums[i]);
                currentList.add(i);
                map.put(nums[i],currentList);
            }else{
                List<Integer> newList = new LinkedList<>();
                newList.add(i);
                map.put(nums[i],newList);
            }
        }

        for(Integer key:map.keySet()){
            List<Integer> currentList = map.get(key);
            if(currentList.size()>=2){
                for (int j = 0; j < currentList.size()-1; j++) {
                    if(Math.abs(currentList.get(j)-currentList.get(j+1))<=k){
                        return true;
                    }
                }
            }
        }

        return false;
    }
    public static void main(String[] args){
        int[] nums = new int[]{1,2,3,1,2,3};
        int indexDifference = 2;
        int absoluteDifference = 0;

        ContainsDuplicateIII obj = new ContainsDuplicateIII();
        System.out.println(obj.containsNearbyAlmostDuplicate(nums,indexDifference,absoluteDifference));
    }
}
