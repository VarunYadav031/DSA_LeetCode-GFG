// User function Template for Java
class Solution {
    static boolean armstrongNumber(int n) {
        int original=n;
        int sum=0;
        while(n!=0){
            int digit=n%10;
            sum +=digit*digit*digit;
            n=n/10;
        }
        if(original==sum){
            return true;
        } 
        return false;
    }
}