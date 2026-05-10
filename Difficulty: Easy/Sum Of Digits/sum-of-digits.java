class Solution {
    static int sumOfDigits(int n) {
        int digit=0;
        int sum=0;
        while(n!=0){
            digit=n%10;
            sum +=digit;
            n=n/10;
        }
        return sum;
    }
}
