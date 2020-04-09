package ProgrammingCreek;

public class RemoveDuplicateFromSortedArrayII {
    public int removeDuplicates(int[] nums) {
        int j = 0;
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[j]) {
                j++;
                count = 1;
            }else if(nums[i] == nums[j] && count < 2){
                count ++;
                j++;
            }
            nums[j] = nums[i];
        }
        return j + 1;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{0, 0, 1, 1, 1, 1, 2, 3, 3};
        RemoveDuplicateFromSortedArrayII duplicate = new RemoveDuplicateFromSortedArrayII();
        System.out.println(duplicate.removeDuplicates(nums));
    }
}
