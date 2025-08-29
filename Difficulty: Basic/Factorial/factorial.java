class Solution {
    // Function to calculate factorial of a number.
    int factorial(int n) {
        // code here
        if(n==0){
            return 1;
        }
        int fnm1=factorial(n-1);
        int fn=n*factorial(n-1);
        return fn;
    }
}
