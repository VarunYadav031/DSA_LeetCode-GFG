class Solution {
    public static int gcd(int a, int b) {
        // int min=Math.min(a,b);
        // int result=1;       // incase of(7,8)
        // for(int i=1;i<=min;i++){
        //     if(a%i==0 && b%i==0){
        //         result=i;
        //     }
        // }
        // return result;
        
        
        while(b!=0){
           int temp=b;
           b=a%b;
           a=temp;
        }
        return a;
    }
}
