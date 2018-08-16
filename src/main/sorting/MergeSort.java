package main.sorting;

/**
 * Created by haoranz on 8/13/18.
 *
 */
public class MergeSort {

    public static int[] sort(int[] nums) {
        if (nums == null || nums.length == 0) {
            return nums;
        }
        return sort(nums, 0, nums.length-1);
    }

    private static int[] sort(int[] nums, int leftIdx, int rightIdx) {
        if (leftIdx >= rightIdx) {
            return nums;
        }

        int middleIdx = leftIdx + (rightIdx - leftIdx)/2;
        sort(nums, leftIdx, middleIdx);
        sort(nums, middleIdx+1, rightIdx);
        merge(nums, leftIdx, middleIdx, rightIdx);
        return nums;
    }

    private static void merge(int[] nums, int startIdx, int middleIdx, int endIdx) {
        int n1 = middleIdx-startIdx+1;
        int n2 = endIdx-middleIdx;
        int[] tmp1 = new int[n1];
        int[] tmp2 = new int[n2];
        for (int i=0; i<n1; i++) {
            tmp1[i] = nums[startIdx+i];
        }
        for (int i=0; i<n2; i++) {
            tmp2[i] = nums[middleIdx+i+1];
        }

        int l = 0, r = 0, idx = startIdx;
        while (l < n1 && r < n2) {
            if (tmp1[l] < tmp2[r]) {
                nums[idx++] = tmp1[l++];
            } else {
                nums[idx++] = tmp2[r++];
            }
        }

        while (l < n1) {
            nums[idx++] = tmp1[l++];
        }

        while (r < n2) {
            nums[idx++] = tmp2[r++];
        }
    }
}
