package main.binarysearch;

/**
 * Created by haoranz on 8/16/18.
 *
 */
public class LastOccurrence {

    public static int lastOccurrence(int[] nums, int target) {
        int leftIdx = 0, rightIdx = nums.length-1;
        while (leftIdx < rightIdx-1) {
            int midIdx = leftIdx + (rightIdx - leftIdx)/2;
            if (nums[midIdx] <= target) {
                leftIdx = midIdx;
            } else {
                rightIdx = midIdx;
            }
        }
        if (nums[rightIdx] == target) {
            return rightIdx;
        } else if (nums[leftIdx] == target) {
            return leftIdx;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] testArr = new int[]{1,2,5,5,5,5,5,5,5,5,5,5,5,5,5,5};
        int res = lastOccurrence(testArr, 5);
        System.out.println(res);
    }
}
