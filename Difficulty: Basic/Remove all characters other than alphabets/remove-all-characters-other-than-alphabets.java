// User function Template for Java

class Solution {
    String removeSpecialCharacter(String s) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isLetter(ch)){
                sb.append(ch);
            }
        }
        if(sb.length()==0)return "-1";
        return sb.toString();
    }
}