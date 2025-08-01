class Solution {
    public static boolean areAnagrams(String s1, String s2) {
        // code here
        if(s1.length()!=s2.length()) return false;
        HashMap<Character,Integer> count=new HashMap<>();
        for(char c:s1.toCharArray()){
            count.put(c,count.getOrDefault(c,0)+1);
        }
        for(char c:s2.toCharArray()){
            count.put(c,count.getOrDefault(c,0)-1);
        }
        for(int val:count.values()){
            if(val!=0){
                return false;
            }
           
        }
         return true;
    }
}