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
}