package main.twopointers;

import main.util.ArrayUtil;
import main.util.PrintingUtil;

/**
 *
 Given an array of n objects with k different colors (numbered from 1 to k), sort them so that objects of the same color are adjacent, with the colors in the order 1, 2, ... k.

 Notice

 You are not suppose to use the library's sort function for this problem.

 k <= n

 Example Given colors=[3, 2, 2, 1, 4], k=4, your code should sort colors in-place to [1, 2, 2, 3, 4].
 */
public class RainbowSort {

    public static int[] sort(int[] nums, int k) {

        int start = 0;
        int curr = 1;
        while (curr <= k) {
            int leftIdx = start;
            int rightIdx = nums.length-1;
            while (leftIdx <= rightIdx) {
                if (nums[leftIdx] == curr) {
                    leftIdx++;
                } else if (nums[rightIdx] != curr) {
                    rightIdx--;
                } else {
                    ArrayUtil.swap(nums, leftIdx++, rightIdx--);
                }
            }
            start = leftIdx;
            curr++;
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] testArr = new int[]{2,1,3,4,4,4,6,3,5,4,4,4,2};
        sort(testArr,6);
        PrintingUtil.printIntArray(testArr);
    }


}
