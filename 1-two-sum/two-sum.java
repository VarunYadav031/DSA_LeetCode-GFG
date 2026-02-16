class Solution {
    public int[] twoSum(int[] nums, int target) {
       HashMap<Integer,Integer>ans=new HashMap<>();
       for(int i=0;i<nums.length;i++){
        int remaining=target-nums[i];
        if(ans.containsKey(remaining)){
            int []result=new int[2];
            result[0]=ans.get(remaining);
            result[1]=i;
            return result;
        }else{
            ans.put(nums[i],i);
        }
       } 
       return new int[]{};
    }
}