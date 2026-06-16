class Solution {
    public String reverse(String S) {
        Stack<Character>s=new Stack<>();
        int i=0;
        while(i<S.length()){
            s.push(S.charAt(i));
            i++;
        }
        StringBuilder sb=new StringBuilder();
        
        while(!s.isEmpty()){
            char top=s.pop();
            sb.append(top);
        }
        return sb.toString();
        
    }
}