// User function Template for Java

class Solution {

    static ArrayList<Integer> removeDuplicate(int arr[]) {
      Set<Integer> set = new LinkedHashSet<>();
       for(int num:arr){
           set.add(num);
       }
       return new ArrayList<>(set);

    }
}