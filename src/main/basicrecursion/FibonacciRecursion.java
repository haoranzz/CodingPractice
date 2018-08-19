package main.basicrecursion;

public class FibonacciRecursion {

    public static int fibonacci(int k) {
        if (k == 0) {
            return 0;
        } else if (k == 1) {
            return 1;
        }
        return fibonacci(k-1) + fibonacci(k-2);
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(9));
    }

}
