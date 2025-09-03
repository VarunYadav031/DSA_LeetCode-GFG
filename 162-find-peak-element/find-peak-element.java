class Solution {
    public int findPeakElement(int[] nums) {
        int n=nums.length;
    int si=1,ei=nums.length-2;
   if( n == 1 || nums[0]>nums[1]){
    return 0;
   }
   if(nums[n-1]>nums[n-2]){
    return n-1;
   }
    
    while(si<=ei){
        int mid=si+(ei-si)/2;
        if(nums[mid-1]<nums[mid] && nums[mid]>nums[mid+1])
        {
          return mid;
        }else if(nums[mid-1]<nums[mid]){
            si=mid+1;
        }else{
            ei=mid-1;
        }
   
    }
     return -1;
    }
}
