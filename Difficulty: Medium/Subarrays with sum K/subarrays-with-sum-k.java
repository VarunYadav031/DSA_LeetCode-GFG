class Solution {
    public int cntSubarrays(int[] arr, int k) {
      int[]ps=new int[arr.length];
      ps[0]=arr[0];
      for(int i=1;i<arr.length;i++){
          ps[i]=ps[i-1]+arr[i];
      }
      HashMap<Integer,Integer>m=new HashMap<>();
      m.put(0,1);
      int count=0;
      for(int j=0;j<ps.length;j++){           
       int val=ps[j]-k;
       count +=m.getOrDefault(val,0);
       m.put(ps[j],m.getOrDefault(ps[j],0)+1);
      }
      return count;
    }
}