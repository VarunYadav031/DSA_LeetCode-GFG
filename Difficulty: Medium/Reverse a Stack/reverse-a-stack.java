class Solution {
    public static void reverseStack(Stack<Integer> st) {
        if(st.isEmpty()){
            return;
        }
       int top=st.pop();
       reverseStack(st);
       pushAtButtom(st,top);
        
    }
    public static void pushAtButtom(Stack<Integer>st,int x){
       
        if(st.isEmpty()){
            st.push(x);
            return;
        }
        
        
        int top=st.pop();
        pushAtButtom(st,x);
        st.push(top);
           
        
    }
    
}
