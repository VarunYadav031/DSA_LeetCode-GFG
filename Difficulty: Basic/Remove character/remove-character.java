// User function Template for Java
class Solution {
    static String removeChars(String str1, String str2) {
        int []remove=new int[26];
        for(int i=0;i<str2.length();i++){
            char ch=str2.charAt(i);
            remove[ch-'a']=1;
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str1.length();i++){
            char ch=str1.charAt(i);
            if(remove[ch-'a']==0){
                sb.append(ch);
            }
        }
        return sb.toString();
        
    }
}