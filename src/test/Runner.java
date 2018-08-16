package test;

import main.sorting.MergeSort;

class Runner {
    
    public static void main(String[] args) {
        int[] ret = MergeSort.sort(new int[]{8,4,5,7,6,2,3,4,1});
        for (int i:ret) {
            System.out.println(i);
        }
    }
}
