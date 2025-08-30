class Solution {
    public double myPow(double x, int n) {
        long N = n;   // convert to long
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }

        return fastPow(x, N);
    }

    private double fastPow(double x, long n) {
        if (n == 0) return 1.0;

        double half = fastPow(x, n / 2);
        double hpsquare = half * half;

        if (n % 2 != 0) {
            hpsquare = x * hpsquare;
        }
        return hpsquare;
    }
}
