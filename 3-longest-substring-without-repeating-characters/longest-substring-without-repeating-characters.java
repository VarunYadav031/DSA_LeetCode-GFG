class Solution {
    public int lengthOfLongestSubstring(String s) {
        int sw=0;
        int ew=0;
        int n=s.length();
        HashMap<Character,Integer>map=new HashMap<>();
        int maxlen=Integer.MIN_VALUE;
        while(ew<n){
            char ch=s.charAt(ew);
            if(map.containsKey(ch) && map.get(ch)>=sw){
                sw=map.get(ch)+1;
            }
            map.put(ch,ew);
        maxlen=Math.max(maxlen,ew-sw+1);
        ew++;
        }
        return (maxlen==Integer.MIN_VALUE)?0:maxlen;
    }
}