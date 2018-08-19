import main.sorting.QuickSort;

class Runner {
    
    public static void main(String[] args) {
        int[] ret = QuickSort.sort(new int[]{8,4,5,7,6,2,3,4,1});
        for (int i:ret) {
            System.out.println(i);
        }
    }
}
