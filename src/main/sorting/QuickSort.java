package main.sorting;

/**
 * Created by haoranz on 8/13/18.
 *
 */
public class QuickSort {

    public static int[] sort(int[] nums) {
        return sort(nums, 0, nums.length-1);
    }

    private static int[] sort(int[] nums, int start, int end) {
        if (start >= end) {
            return nums;
        }

        int pivot = nums[end];
        int leftRunner = start;
        int rightRunner = end-1;
        while (leftRunner <= rightRunner) {
            if (nums[leftRunner] <= pivot) {
                leftRunner++;
            } else if (nums[rightRunner] >= pivot) {
                rightRunner--;
            } else {
                swap(nums, leftRunner++, rightRunner--);
            }
        }
        swap(nums, leftRunner, end);

        sort(nums, start, leftRunner-1);
        sort(nums, leftRunner+1, end);
        return nums;
    }

    private static void swap(int[] nums, int idx1, int idx2) {
        int temp = nums[idx1];
        nums[idx1] = nums[idx2];
        nums[idx2] = temp;
    }


}

