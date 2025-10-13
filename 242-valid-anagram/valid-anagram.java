import java.util.*;

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int len=s.length();
        int freq[]=new int[26];
      for(char c:s.toCharArray()){
        freq[c-'a']++;
      }
      for(char c:t.toCharArray()){
        if(freq[c-'a']>0){
          freq[c-'a']--;
        }
       
      }
     for(int i=0;i<26;i++){
        if(freq[i]!=0){
            return false;
        }
     }
     return true;
          
    }

   
}
