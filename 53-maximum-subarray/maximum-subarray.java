class Solution {
    public static int maxSubArray(int[] nums) {
        int sum=nums[0];
        int max_sum=nums[0];
       
        for (int i = 1; i < nums.length; i++) {
            sum = Math.max(nums[i], sum + nums[i]); // subarray continue ya restart
            max_sum = Math.max(max_sum, sum);       // max update
        }
        return max_sum;
    

    }
}