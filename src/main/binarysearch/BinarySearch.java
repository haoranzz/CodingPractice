package main.binarysearch;

/**
 * Created by zhaohaoran on 8/14/18.
 *
 */
public class BinarySearch {
    public static int binarySearch(int[] nums, int target) {
        int leftIdx =0, rightIdx=nums.length-1;
        while (leftIdx <= rightIdx) {
            int middleIdx = leftIdx + (rightIdx - leftIdx)/2;
            if(nums[middleIdx] < target) {
                leftIdx = middleIdx+1;
            } else if (nums[middleIdx] > target) {
                rightIdx = middleIdx-1;
            } else {
                return middleIdx;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] testArr = new int[]{1};
        int res = binarySearch(testArr, 4);
        System.out.println(res);
    }
}
