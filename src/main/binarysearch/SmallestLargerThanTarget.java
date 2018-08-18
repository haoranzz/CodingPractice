package main.binarysearch;

public class SmallestLargerThanTarget {

    public static int smallestLargerThanTarget(int[] nums, int target) {
        int leftIdx = 0, rightIdx = nums.length-1;

        while(leftIdx < rightIdx-1) {
            int midIdx = leftIdx + (rightIdx - leftIdx)/2;
            if (nums[midIdx] > target) {
                rightIdx = midIdx;
            } else if (nums[midIdx] < target) {
                leftIdx = midIdx;
            } else {
                return midIdx+1 < nums.length? midIdx+1 : -1;
            }
        }

        if (nums[leftIdx] > target) {
            return leftIdx;
        } else if (nums[rightIdx] > target) {
            return rightIdx;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] testArr = new int[]{1,2,3,5};
        int res = smallestLargerThanTarget(testArr, 4);
        System.out.println(res);
    }

}
