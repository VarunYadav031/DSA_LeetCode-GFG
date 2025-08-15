class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int[] pos=new int[n/2];
        int[] neg=new int[n/2];
        int p=0;
        int q=0;
        for(int num:nums){
            if(num>0){
                pos[p]=num;
                p++;
            }else{
                neg[q]=num;
                q++;
            }
        }
        int []ans=new int[n];
         p=0;
         q=0;
        for(int i=0;i<n;i++){
            if(i%2==0){
                ans[i]=pos[p];
                p++;
            }else{
                ans[i]=neg[q];
                q++;
            }
        }
        return ans;
    }
}