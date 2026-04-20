class Solution {
    public int fib(int n) {
        return helper(n, 0, 1);
    }

    int helper(int n, int a, int b) {
        if (n == 0) return a;
        return helper(n - 1, b, a + b);
    }
}