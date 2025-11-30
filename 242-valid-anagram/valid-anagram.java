class Solution {
    public boolean isAnagram(String s, String t) {
      
      //  if(s.length()!=t.length()){
      //   return false;
      //  }
      //  char[] ch1=s.toCharArray();
      //  char[] ch2=t.toCharArray();
      //  Arrays.sort(ch1);
      //  Arrays.sort(ch2);
      //  if(Arrays.equals(ch1,ch2)){
      //   return true;
      //  }else{
      //   return false;
      //  }
      if(s.length()!=t.length())return false;
      int[]freq=new int[26];
      for(int i=0;i<s.length();i++){
        freq[s.charAt(i)-'a']++;
        freq[t.charAt(i)-'a']--;
      }
      for(int count:freq){
        if(count!=0)return false;
      }
      return true;
    }
}