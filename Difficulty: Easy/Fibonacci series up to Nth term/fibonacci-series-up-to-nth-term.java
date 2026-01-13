class Solution {

    static final int MOD = 1000000007;

    int[] Series(int n) {
        int[] res = new int[n + 1];

        if (n >= 0) res[0] = 0;
        if (n >= 1) res[1] = 1;

        fib(n, res);
        return res;
    }

    void fib(int i, int[] res) {
        if (i <= 1) return;

        fib(i - 1, res);
        res[i] = (res[i - 1] + res[i - 2]) % MOD;
    }
}
