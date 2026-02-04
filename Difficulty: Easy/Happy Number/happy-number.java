// User function Template for Java

class Solution {

    static int isHappy(int N) {
        int slow = N;
        int fast = N;
        
        do {
            slow = sumOfSquares(slow);
            fast = sumOfSquares(sumOfSquares(fast));
        } while (slow != fast);
        
        return slow == 1 ? 1 : 0;
    }
    
    static int sumOfSquares(int n) {
        int sum = 0;
        while (n > 0) {
            int d = n % 10;
            sum += d * d;
            n /= 10;
        }
        return sum;
    }
}
