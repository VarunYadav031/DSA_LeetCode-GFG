// User function Template for Java

class Solution {
    int getSingle(int arr[]) {
         
        int result=0;
        for(int num:arr){
            result=result^num;
        }
        return result;
    }
}