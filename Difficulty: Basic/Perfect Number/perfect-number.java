class Solution {
    
    // Function to calculate factorial
    int factorial(int n){
        int fact = 1;
        for(int i = 1; i <= n; i++){
            fact *= i;
        }
        return fact;
    }

    int isPerfect(int N) {
        int original = N;
        int sum = 0;

        while(N > 0){
            int digit = N % 10;
            sum += factorial(digit);
            N /= 10;
        }

        if(sum == original)
            return 1;
        else
            return 0;
    }
}