class Solution {
    public static int findMean(int[] arr) {
        int sum=0;
        
        int n=arr.length;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            
        }
        int avg=sum/n;
        return avg;
        
    }
};