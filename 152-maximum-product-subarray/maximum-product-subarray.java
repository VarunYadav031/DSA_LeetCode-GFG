class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
       int max=Integer.MIN_VALUE;
    //    for(int i=0;i<nums.length;i++){
    //      int product=1;
    //     for(int j=i;j<nums.length;j++){
           
            
    //             product *=nums[j];
    //             max=Math.max(product,max);
            
    //     }
    //    }
    int prefix=1;
    int suffix=1;
    for(int i=0;i<nums.length;i++){
        if(prefix==0){
            prefix=1;
        } 
        if(suffix==0) {
            suffix=1;
        }
        prefix=nums[i]*prefix;
        suffix=nums[n-i-1]*suffix;
        max=Math.max(max,Math.max(prefix,suffix));
    }
        return max;
    }
}