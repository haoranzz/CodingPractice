package main.binarysearch;

/**
 * Created by zhaohaoran on 8/15/18.
 *
 */
public class FirstOccurrence {

    public static int firstOccurrence(int[] nums, int target) {
        int leftIdx = 0, rightIdx = nums.length-1;
        while (leftIdx < rightIdx-1) {
            int middleIdx = leftIdx + (rightIdx - leftIdx)/2;
            if (nums[middleIdx] < target) {
                leftIdx = middleIdx;
            } else {
                rightIdx = middleIdx;
            }
        }
        if (nums[leftIdx] == target) {
            return leftIdx;
        } else if (nums[rightIdx] == target) {
            return rightIdx;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] testArr = new int[]{1,2,5,5,5,5,5,5,5,5,5,5,5,5,5,5};
        int res = firstOccurrence(testArr, 5);
        System.out.println(res);
    }
}
