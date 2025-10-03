class Solution {
    // Function to calculate factorial of a number.
    int factorial(int n) {
        // code here
    //     int fact=1;
    //   for(int i=1;i<=n;i++){
    //       fact *=i;
    //   }
    //   return fact;
    if(n==0)return 1;
    int fnm1=factorial(n-1);
    int fn=n*fnm1;
    return fn;
    
    }
}
