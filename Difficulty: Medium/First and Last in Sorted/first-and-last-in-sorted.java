class Solution {
    ArrayList<Integer> find(int arr[], int x) {
        ArrayList<Integer>ans=new ArrayList<>();
        int low=0;
        int high=arr.length-1;
        int first_occ=-1;
        int last_occ=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==x ){
               first_occ=mid;
               high=mid-1;
            }
            else if(arr[mid]>x){
                high=mid-1;
            }else{
                low=mid+1;
            }
            
        }
        low=0;
        high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==x){
                last_occ=mid;
                low=mid+1;
            }
            else if(arr[mid]>x){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        ans.add(first_occ);
        ans.add(last_occ);
        return ans;
    }
}
