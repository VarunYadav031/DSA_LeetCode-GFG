// User function Template for Java

class Solution {
    int getSingle(int arr[]) {
        // code here
        int n=arr.length;
        int result=0;
        for(int val:arr ){
            result=result^val;
        }
        return result;
    }
}