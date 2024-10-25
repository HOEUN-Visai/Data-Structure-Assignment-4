// (a) Implement a method that take an input n and return the sum of all non-negative integers up to n.
// b) Implement a method that take an input n and return the multiplication of all non-negative integers up to n
public class IterativeSolution {
    public static int sum(int n) {
        // check if n is negative
        if (n < 0) {
            return -1;
        }

        // sum of all non-negative integers up to n
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static int multiply(int n) {
        // check if n is negative
        if (n < 0) {
            return -1;
        }

        // multiplication of all non-negative integers up to n
        int num = 1;
        for (int i = 1; i <= n; i++) {
            num *= i;
        }
        return num;
    }

//   (g) mplement a method that takes two inputs n and m and returns the number of unique paths
// from the top left corner to the bottom right corner of a n ∗ m grid. Constraints: the path can
// only move down or right by one unit at a time   (iterative)

    public static int uniquePaths(int n, int m) {
        // check if n or m is negative
        if (n < 0 || m < 0) {
            return -1;
        }

        // number of unique paths from the top left corner to the bottom right corner of a n * m grid
        int[][] dp = new int[n][m];
        for (int i = 0; i < n; i++) {
            dp[i][0] = 1;
        }
        for (int j = 0; j < m; j++) {
            dp[0][j] = 1;
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }
        return dp[n - 1][m - 1];
    }

}
