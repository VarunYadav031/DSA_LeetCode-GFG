class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int n=nums.length;
        map.put(0,1);
        int sum=0;
        int count=0;
        for(int j=0;j<n;j++){
            sum +=nums[j];
            if(map.containsKey(sum-k)){
                count +=map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
    }
}