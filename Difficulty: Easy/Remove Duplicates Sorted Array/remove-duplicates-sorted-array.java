class Solution {
    // Function to remove duplicates from the given array.
    ArrayList<Integer> removeDuplicates(int[] arr) {
       ArrayList<Integer> ans=new ArrayList<>();
       LinkedHashSet<Integer> map=new LinkedHashSet<>();
       for(int num:arr){
           map.add(num);
       }
       ans.addAll(map);
       return ans;
        
    }
}
