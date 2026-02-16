class Solution {
    int findFrequency(int arr[], int x) {
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(x==arr[i]){
                count++;
            }
        }
        return count;
    }
}