/*Complete the function below*/
class Solution {
    public static int convertFive(int n) {
       int result=0;
       int place=1;
       if(n==0)return 5;
       while(n!=0){
           int digit=n%10;
           if(digit==0)
           digit=5;
           result +=digit*place;
           place *=10;
           n=n/10;
       }
       return result;
    }
}