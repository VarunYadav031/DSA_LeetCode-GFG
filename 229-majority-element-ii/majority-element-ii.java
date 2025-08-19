class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        List<Integer>ans=new ArrayList<>();
        int freq1=0,freq2=0;
        int candidate1=0,candidate2=0;
        for(int i=0;i<n;i++){
            int num=nums[i];
          if(num==candidate1){
            freq1++;
          }else if(num==candidate2){
            freq2++;
          }else if(freq1==0){
            candidate1=num;
            freq1++;
          }else if(freq2==0){
            candidate2=num;
            freq2++;
          }else{
            freq1--;
            freq2--;
          }
           
        }
        int count1=0;
        int count2=0;
        for(int val:nums){
            if(val==candidate1){
                count1++;
            }else if(val==candidate2){
                count2++;
            }
        }
        if(count1>n/3){
            ans.add(candidate1);
        }
         if(count2>n/3){
            ans.add(candidate2);
        }
        return ans;
    }
}