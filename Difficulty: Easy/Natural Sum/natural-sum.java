// User function Template for Java

class Solution {
    public int find(int n) {
        // code here
        int sum=0;
        int i=1;
        while(sum<n){
            sum +=i;
            if(sum==n){
                return i;
            }
            i++;
           
        }
         return -1;
    }
}