package main.binarysearch;

/**
 * Created by zhaohaoran on 8/14/18.
 *
 */
public class ClosestToTarget {

    public static int closestToTarget(int[] nums, int target) {
        int leftIdx = 0, rightIdx = nums.length-1;

        while (leftIdx < rightIdx - 1) {
            int middleIdx = leftIdx + (rightIdx - leftIdx)/2;
            if (nums[middleIdx] < target) {
                leftIdx = middleIdx;
            } else if (nums[middleIdx] > target) {
                rightIdx = middleIdx;
            } else {
                return middleIdx;
            }
        }

        if (Math.abs(nums[leftIdx] - target) <= Math.abs(nums[rightIdx] - target)) {
            return leftIdx;
        } else {
            return rightIdx;
        }
    }

    public static void main(String[] args) {
        int[] testArr = new int[]{1,2,5,6};
        int res = closestToTarget(testArr, 5);
        System.out.println(res);
    }
}
