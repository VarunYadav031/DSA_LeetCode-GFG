class Solution {
    ArrayList<Integer> removeDuplicates(int[] arr) {
        int j=0;
        int n=arr.length;
        for(int i=1;i<n;i++){
            if(arr[i]!=arr[j]){
                j++;
                arr[j]=arr[i];
            }
        }
        ArrayList<Integer>ans=new ArrayList<>();
        for(int i=0;i<=j;i++){
            ans.add(arr[i]);
        }
        return ans;
    }
}
