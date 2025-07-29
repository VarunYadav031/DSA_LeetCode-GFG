// User function Template for Java

class Solution {
    static int evenlyDivides(int n) {
      int count=0;
      int OriginalNum=n;
    while(n>0){
        int d=n%10;
        if(d==0){
            
        }else{
            if(OriginalNum%d==0){
                count++;
            }
        }
        n=n/10;
    }
       return count; 
    }
}