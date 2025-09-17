import java.util.*;
class Solution {
    public String reverse(String S) {
        // code here
        Stack <Character>s=new Stack<>();
        int indx=0;
        while(indx<S.length()){
            s.push(S.charAt(indx));
            indx++;
        }
        StringBuilder result=new StringBuilder(" ");
        while(!s.isEmpty()){
            char curr=s.pop();
            result.append(curr);
            
        }
        return result.toString();
    }
}