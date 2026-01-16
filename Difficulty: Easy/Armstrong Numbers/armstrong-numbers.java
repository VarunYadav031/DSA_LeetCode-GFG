// User function Template for Java
class Solution {
    static boolean armstrongNumber(int n) {
        int digit;
        int original=n;
        int sum=0;
        while(n>0){
            digit=n%10;
            sum+=digit*digit*digit;
            n=n/10;
        }
        return original==sum;
    }
}