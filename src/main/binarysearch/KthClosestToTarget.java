package main.binarysearch;

/**
 * Created by haoranz on 8/16/18.
 *
 */
public class KthClosestToTarget {

    public static int kthClosestToTarget(int[] nums, int target, int k) {
        int leftIdx = 0, rightIdx = nums.length-1;
        while (leftIdx < rightIdx-1) {
            int midIdx = leftIdx + (rightIdx - leftIdx)/2;
            if (nums[midIdx] < target) {
                leftIdx = midIdx;
            } else if (nums[midIdx] > target) {
                rightIdx = midIdx;
            } else {
                leftIdx = rightIdx = midIdx;
                break;
            }
        }

        int step = 0;
        int closestIdx = -1;
        while (step < k && (leftIdx >= 0 || rightIdx < nums.length)) {
            int leftDiff = leftIdx >= 0? Math.abs(nums[leftIdx] - target) : Integer.MAX_VALUE;
            int rightDiff = rightIdx < nums.length? Math.abs(nums[rightIdx] - target) : Integer.MAX_VALUE;
            if (leftDiff <= rightDiff) {
                closestIdx = leftIdx;
                leftIdx -= 1;
            } else {
                closestIdx = rightIdx;
                rightIdx +=1;
            }
            step += 1;
        }

        if (step == k) {
            return closestIdx;
        }
        return -1;
    }



    public static void main(String[] args) {
        int[] testArr = new int[]{1,2,4,7,8,9,70,89,90};
        int res = kthClosestToTarget(testArr, 80, 7);
        System.out.println(testArr[res]);
    }
}
