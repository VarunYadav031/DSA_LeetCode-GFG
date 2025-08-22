class Solution {
    static boolean isPerfect(int n) {
        if (n <= 1) return false;  // 1 and below are not perfect

        int sum = 1; // 1 is always a divisor
        int sqrt = (int)Math.sqrt(n);

        for (int i = 2; i <= sqrt; i++) {
            if (n % i == 0) {
                sum += i;
                if (i != n / i) {  // avoid double count when i == sqrt
                    sum += n / i;
                }
            }
        }

        return sum == n;
    }
}
