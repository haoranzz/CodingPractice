package main.twopointers;

import main.util.ArrayUtil;
import main.util.PrintingUtil;

public class MoveAllZeroToRight {

    public static void moveAllZeroToRight(int nums[]) {

        int leftIdx = 0, rightIdx = nums.length-1;

        while (leftIdx < rightIdx) {
            if (nums[rightIdx] == 0) {
                rightIdx--;
            } else if (nums[leftIdx] != 0) {
                leftIdx++;
            } else {
                ArrayUtil.swap(nums, leftIdx, rightIdx);
            }
        }
    }

    public static void main(String[] args) {
        int[] testArr = new int[]{0,0,1,0,0,0};
        moveAllZeroToRight(testArr);
        PrintingUtil.printIntArray(testArr);
    }
}
