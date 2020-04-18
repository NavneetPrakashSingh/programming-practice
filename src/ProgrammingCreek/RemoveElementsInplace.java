package ProgrammingCreek;

public class RemoveElementsInplace {
    public int removeElement(int[] nums, int val) {
        int pointer = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[pointer] = nums[i];
                pointer ++;
            }
        }
        return pointer;
    }

    public static void main(String[] args) {
        RemoveElementsInplace inplace = new RemoveElementsInplace();
        int[] nums = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
        System.out.println(inplace.removeElement(nums, 2));
    }
}
