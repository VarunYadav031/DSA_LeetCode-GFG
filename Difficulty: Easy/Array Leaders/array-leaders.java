class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
      int n=arr.length;
      ArrayList<Integer> ans=new ArrayList<>();
      int max=Integer.MIN_VALUE;
      for(int i=n-1;i>=0;i--){
          if(arr[i]>=max){
              ans.add(arr[i]);
              max=arr[i];
              
          }
          
      }
      int i=0,j=ans.size()-1;
      while(i<j){
          int temp=ans.get(i);
          ans.set(i,ans.get(j));
          ans.set(j,temp);
          i++;
          j--;
      }
     
      return ans;
    }
}
