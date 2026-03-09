class Solution {
    public ArrayList<Integer> minAnd2ndMin(int[] arr) {
        ArrayList<Integer>ans=new ArrayList<>();
        int first=Integer.MAX_VALUE;
        int second=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<first){
                second=first;
                first=arr[i];
            }else if(arr[i]<second && first!=arr[i]){
                second=arr[i];
            }
            
        }
        if(second==Integer.MAX_VALUE){
            ans.add(-1);
        }else{
            ans.add(first);
            ans.add(second);
        }
        return ans;
    }
}
