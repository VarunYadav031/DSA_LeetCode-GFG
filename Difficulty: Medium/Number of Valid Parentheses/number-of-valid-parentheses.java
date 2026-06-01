class Solution {
    public int findWays(int n) {
        if ((n & 1) == 1) return 0;

        int k = n / 2;
        long catalan = 1;

        // Compute C(2k, k)
        for (int i = 0; i < k; i++) {
            catalan = catalan * (2L * k - i) / (i + 1);
        }

        // Catalan number
        catalan /= (k + 1);

        return (int) catalan;
    }
}