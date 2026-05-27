class Solution {
    public ArrayList<Integer> intersection(int arr1[], int arr2[]) {
    ArrayList<Integer>ans=new ArrayList<>();
    int i=0;
    int j=0;
    int n=arr1.length;
    int m=arr2.length;
    while(i<n && j<m){
        if(arr1[i]==arr2[j]){
            if(ans.size()==0 || ans.get(ans.size()-1)!=arr1[i]){
                ans.add(arr1[i]);
            }
            i++;
            j++;
        }
        else if(arr1[i]<arr2[j]){
            i++;
        }else{
            j++;
        }
    }
    return ans;
        
    }
}
