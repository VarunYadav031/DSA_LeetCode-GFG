class Solution {
    public void sortStack(Stack<Integer> st) {
        if(!st.isEmpty()){
            int top=st.pop();
            sortStack(st);
            insertSorted(st,top);
        }
    }
    public static void insertSorted(Stack<Integer>st,int val){
        if(st.isEmpty() || st.peek()<=val){
            st.push(val);
            return;
        }
        int top=st.pop();
        insertSorted(st,val);
        st.push(top);
    }
}