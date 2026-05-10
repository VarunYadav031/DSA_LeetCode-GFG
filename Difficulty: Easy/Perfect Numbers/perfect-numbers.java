class Solution {
    static boolean isPerfect(int n) {
        int original=n;
        int sum=1;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                sum+=i;
                if(i!=n/i){
                    sum+=n/i;
                }
            }
            
        }
        return sum==original;
        
    }
};
// Sum of all proper divisors = number itself (isum me khud number add nahi hoga)