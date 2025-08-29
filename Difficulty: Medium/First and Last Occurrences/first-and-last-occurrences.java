// User function Template for Java

class GFG {
    ArrayList<Integer> find(int arr[], int x) {
        // code here
        ArrayList<Integer> ans=new ArrayList<>();
        int n=arr.length;
        int first=-1,last=-1;
        for(int i=0;i<n;i++){
            if(x==arr[i]){
                first=i;
                break;
            }
        }
        for(int i=n-1;i>=0;i--){
            if(x==arr[i]){
               last=i;
               break;
            }
        }
        ans.add(first);
        ans.add(last);
        return ans;
    }
}
