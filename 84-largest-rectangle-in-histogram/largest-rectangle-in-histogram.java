class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        int ns[]=findNextSmaller(heights);
        int ps[]=findPrevSmaller(heights);
        int max=0;
       
        for(int i=0;i<n;i++){
             int width=ns[i]-ps[i]-1;
            
             int area=width*heights[i];
             max=Math.max(max,area);
        }
        return max;
    }
    public static int[] findNextSmaller(int[] heights){
        int n = heights.length;
        int ns[] = new int[n];
        Stack<Integer>s=new Stack<>();
        
        for(int i=n-1;i>=0;i--){
            while(!s.isEmpty() && heights[s.peek()]>=heights[i]){
                s.pop();
            }
            if(s.isEmpty()){
                ns[i]=n;
            }else{
                ns[i]=s.peek();
            }
            s.push(i);
        }
        return ns;
    }
    public static int[] findPrevSmaller(int[] heights){
        int n = heights.length;
        int ps[] = new int[n];
        Stack<Integer>s=new Stack<>();
        
        for(int i=0;i<n;i++){
            while(!s.isEmpty() && heights[s.peek()]>=heights[i]){
                s.pop();
            }
            if(s.isEmpty()){
                ps[i]=-1;
            }else{
                ps[i]=s.peek();
            }
            s.push(i);
        }
        return ps;
    }
}
