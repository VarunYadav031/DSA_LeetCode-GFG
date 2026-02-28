// User function Template for Java

class Solution {
    String removeDuplicates(String s) {
        boolean []seen=new boolean[256];
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!seen[ch]){
                seen[ch]=true;
                 sb.append(ch);
            }
           
        }
        return sb.toString();
    }
}
