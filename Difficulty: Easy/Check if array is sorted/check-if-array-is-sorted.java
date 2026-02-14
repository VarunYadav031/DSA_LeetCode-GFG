class Solution {
    public boolean isSorted(int[] arr) {
        // int start=0;
        // int next=start+1;
        // while(next<arr.length){
        //     if(arr[start]>arr[next]){
        //         return false;
        //     }
        // }
        // return true;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }
}