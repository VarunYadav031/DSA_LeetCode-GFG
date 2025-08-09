class Solution {
    public static int largest(int[] arr) {
        // code here
        int n=arr.length;
        int max=Integer.MIN_VALUE;
        for(int val:arr){
            if(val>max){
                max=val;
            }
        }
        return max;
    }
}
