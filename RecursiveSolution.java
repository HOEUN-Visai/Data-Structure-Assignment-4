// (a) Implement a method that take an input n and return the sum of all non-negative integers up to n.
// b) Implement a method that take an input n and return the multiplication of all non-negative integers up to n

public class RecursiveSolution {
    public static int sum(int n) {
        // check if n is negative
        if (n < 0) {
            return -1;
        }

        // base case
        if (n == 0) {
            return 0;
        }

        // recursive case
        return n + sum(n - 1);
    }

    public static int multiply(int n) {
        // check if n is negative
        if (n < 0) {
            return -1;
        }

        // base case
        if (n == 0) {
            return 1;
        }

        // recursive case
        return n * multiply(n - 1);
    }

    // (g) Implement a method that takes two inputs n and m and returns the number of unique paths
    // from the top left corner to the bottom right corner of a n * m grid. Constraints: the path can
    // only move down or right by one unit at a time (Recursion)
    public static int uniquePaths(int n, int m) {
        // check if n or m is negative
        if (n < 0 || m < 0) {
            return -1;
        }

        // base case
        if (n == 1 || m == 1) {
            return 1;
        }

        // recursive case
        return uniquePaths(n - 1, m) + uniquePaths(n, m - 1);
    }

    public static void main(String[] args) {
        // Test the sum method
        System.out.println(sum(5)); // 15
        System.out.println(sum(0)); // 0
        System.out.println(sum(-5)); // -1

        // Test the multiply method
        System.out.println(multiply(5)); // 120
        System.out.println(multiply(0)); // 1
        System.out.println(multiply(-5)); // -1

        // Test the uniquePaths method
        System.out.println(uniquePaths(3, 7)); // 28
        System.out.println(uniquePaths(3, 2)); // 3
        System.out.println(uniquePaths(7, 3)); // 28
        System.out.println(uniquePaths(3, 3)); // 6
        System.out.println(uniquePaths(0, 0)); // 1
        System.out.println(uniquePaths(-3, 7)); // -1
    }
}