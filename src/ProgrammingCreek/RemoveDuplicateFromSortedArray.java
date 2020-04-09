package ProgrammingCreek;

public class RemoveDuplicateFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int j = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[j]) {
                j++;
            }
            nums[j] = nums[i];
        }
        return j + 1;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{0, 0, 1, 1, 1, 1, 2, 3, 3};
        RemoveDuplicateFromSortedArray duplicate = new RemoveDuplicateFromSortedArray();
        System.out.println(duplicate.removeDuplicates(nums));
    }
}
