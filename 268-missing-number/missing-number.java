class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        long totalsum=(long)n*(n+1)/2;
        long actualsum=0; 
        for(int val:nums){
            actualsum +=val;
        }
        return (int)(totalsum-actualsum);
    }
}