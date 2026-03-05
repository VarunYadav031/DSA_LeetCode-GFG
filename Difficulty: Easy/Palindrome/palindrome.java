class Solution {
    public boolean isPalindrome(int n) {
        int original=n;
        int reverse=0;
        while(n!=0){
            int digit=n%10;
            reverse=reverse*10+digit;
            n=n/10;
        }
        if(reverse==original){
            return true;
        }
        return false;
    }
}