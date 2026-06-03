class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n=numbers.length;
        int []ans=new int[2];
        if(n<2)return null;
        int left=0;
        int right=numbers.length-1;
        while(left<right){
            int sum =numbers[left]+numbers[right];
            if(sum==target){
                ans[0]=left+1;
                ans[1]=right+1;
                break;

            }else if(sum<target){
                left++;
            }else{
                right--;
            }
        }
        return ans;
    }
}