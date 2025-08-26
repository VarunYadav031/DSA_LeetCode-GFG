class Solution {
    static final long MOD = 1000000007;

    public int countGoodNumbers(long n) {
        long evenCount = (n + 1) / 2; // positions at even indices
        long oddCount = n / 2;        // positions at odd indices

        long result = (modPow(5, evenCount, MOD) * modPow(4, oddCount, MOD)) % MOD;
        return (int) result;
    }

    // Fast exponentiation
    private long modPow(long base, long exp, long mod) {
        long res = 1;
        base %= mod;

        while (exp > 0) {
            if ((exp & 1) == 1) {
                res = (res * base) % mod;
            }
            base = (base * base) % mod;
            exp >>= 1;
        }
        return res;
    }
}
