package main.sorting;

/**
 * Created by haoranz on 8/7/18.
 *
 */
public class SelectionSort {

    public static int[] sort(int[] nums) {
        for (int i=0; i<nums.length; i++) {
            int globalMin = Integer.MAX_VALUE;
            int minIdx = i;
            for (int j=i; j<nums.length; j++) {
                if (nums[j] < globalMin) {
                    globalMin = nums[j];
                    minIdx = j;
                }
            }
            swap(nums, i, minIdx);
        }
        return nums;
    }

    private static void swap(int[] nums, int i1, int i2) {
        int tmpNum = nums[i1];
        nums[i1] = nums[i2];
        nums[i2] = tmpNum;
    }

}
