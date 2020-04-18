package ProgrammingCreek;

public class RemoveZeroInplace {
    public void removeElement(int[] nums) {
        int val = 0;
        int pointer = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[pointer] = nums[i];
                pointer ++;
            }
        }
        for (int i = pointer; i < nums.length; i++) {
            nums[i] = 0;
        }
        System.out.println(pointer);
    }

    public static void main(String[] args) {
        RemoveZeroInplace inplace = new RemoveZeroInplace();
        int[] nums = new int[]{1};
        inplace.removeElement(nums);
    }
}
