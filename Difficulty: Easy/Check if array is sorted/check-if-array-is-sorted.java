class Solution {
    public boolean isSorted(int[] arr) {
        int start=0;
        int next=start+1;
        while(next<arr.length){
            if(arr[start]>arr[next]){
                return false;
            }
            next++;
            start++;
            
        }
        return true;
    }
}