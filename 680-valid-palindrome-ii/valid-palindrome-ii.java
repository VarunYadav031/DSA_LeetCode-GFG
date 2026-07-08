class Solution {
    public boolean validPalindrome(String s) {
    // if(ispalindrome(s)){
    //     return true;
    // }
    // for(int i=0;i<s.length();i++){
    //     String newstr=s.substring(0,i)+s.substring(i+1);
    //     if(ispalindrome(newstr)){
    //         return true;
    //     }
    // }
    // return false;
    int i=0;
    int j=s.length()-1;
    while(i<j){
        if(s.charAt(i)==s.charAt(j)){
            i++;
            j--;

        }else{
          return ispalindrome(s,i+1,j) ||
            ispalindrome(s,i,j-1);
        }
    }
    return true;

        
    }
    public static boolean ispalindrome(String s,int left,int right){
        
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;


        }
        return true;
    }
}