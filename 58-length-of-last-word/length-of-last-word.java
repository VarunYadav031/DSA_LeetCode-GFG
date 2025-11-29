class Solution {
  public int lengthOfLastWord(String s) {
    
    String str=s.trim();
    int n=str.length()-1;
       int count=0;
       for(int i=n;i>=0;i--){
        
        if(str.charAt(i)!=' '){
           count++;
        }else{
          break;
        }
       } 
       return count;                    
  }
}