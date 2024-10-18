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

}
