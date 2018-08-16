package main.binarysearch;

/**
 * Created by zhaohaoran on 8/14/18.
 *
 */
public class BinarySearch2D {

    public static int[] binarySearcj2D(int[][] nums, int target) {
        int[] indice = new int[2];
        int height = nums.length;
        int width = nums[0].length;
        int leftIdx = 0, rightIdx = height*width-1;

        while (leftIdx <= rightIdx) {
            int middleIdx = leftIdx + (rightIdx - leftIdx)/2;
            if (nums[middleIdx/width][middleIdx%width] < target) {
                leftIdx = middleIdx + 1;
            } else if(nums[middleIdx/width][middleIdx%width] > target) {
                rightIdx = middleIdx - 1;
            } else {
                indice[0] = middleIdx/width;
                indice[1] = middleIdx%width;
                return indice;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[][] testArr = new int[][]{{1,2,3},{4,5,6}};
        int[] res = binarySearcj2D(testArr, 1);
        System.out.println(res == null? null:res[0]+":"+res[1]);
    }
}
