package main.binarysearch;

public class LargestInCamelArray {

    /**
     * can't handle duplicate cases
     * @param nums
     * @return
     */
    public static int largestInCamelArray(int[] nums) {
        int leftIdx = 0, rightIdx = nums.length-1;

        while (leftIdx < rightIdx-1) {
            int midIdx = leftIdx + (rightIdx - leftIdx)/2;
            if (nums[midIdx] >= nums[midIdx-1] && nums[midIdx] >= nums[midIdx+1]) {
                return midIdx;
            } else if (nums[midIdx] >= nums[midIdx-1] && nums[midIdx] <= nums[midIdx+1]) {
                leftIdx = midIdx;
            } else if (nums[midIdx] <= nums[midIdx-1] && nums[midIdx] >= nums[midIdx+1]) {
                rightIdx = midIdx;
            }
        }

        return nums[leftIdx] > nums[rightIdx]? leftIdx : rightIdx;
    }

    public static void main(String[] args) {
        int[] testArr = new int[]{1,2,3,4,5};
        int res = largestInCamelArray(testArr);
        System.out.println(res);
    }
}
