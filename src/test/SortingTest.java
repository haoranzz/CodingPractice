package test;

import main.sorting.MergeSort;
import main.sorting.QuickSort;
import main.sorting.SelectionSort;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by haoranz on 8/7/18.
 *
 */
public class SortingTest {


    @Test
    public void testSelectionSort() {
        for (int i=0; i<testInputs.length; i++) {
            Assert.assertArrayEquals(SelectionSort.sort(testInputs[i]),expectOutputs[i]);
        }
    }

    @Test
    public void testMergeSort() {
        for (int i=0; i<testInputs.length; i++) {
            Assert.assertArrayEquals(MergeSort.sort(testInputs[i]),expectOutputs[i]);
        }
    }

    @Test
    public void testQuickSort() {
        for (int i=0; i<testInputs.length; i++) {
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
            System.out.println("origin: " + Arrays.toString(testInputs[i]));
            System.out.println("expect: " + Arrays.toString(expectOutputs[i]));
            int[] res = QuickSort.sort(testInputs[i]);
            System.out.println("result: " + Arrays.toString(res));
            Assert.assertArrayEquals(res,expectOutputs[i]);
        }
    }


    //test arrays
    private int[][] testInputs = {
            {1,2,3,4,5,6},
            {6,5,4,3,2,1},
            {2,1,4,3,6,5},
            {3,2,1,6,5,4},
            {4,3,2,1,5,6},
            {2,2,2,2,2,2},
            {1,1,1,2,2,2},
            {2,2,2,1,1,1},
            {2,1,2,1,2,1}
    };
    private int[][] expectOutputs = {
            {1,2,3,4,5,6},
            {1,2,3,4,5,6},
            {1,2,3,4,5,6},
            {1,2,3,4,5,6},
            {1,2,3,4,5,6},
            {2,2,2,2,2,2},
            {1,1,1,2,2,2},
            {1,1,1,2,2,2},
            {1,1,1,2,2,2}
    };
}
