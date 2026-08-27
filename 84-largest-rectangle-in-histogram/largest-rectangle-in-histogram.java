class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        int[]ls=new int[n];
        int[]rs=new int[n];
        Stack<Integer>s=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!s.isEmpty() && heights[i]<=heights[s.peek()]){
                s.pop();
            }
            rs[i]=s.isEmpty()? n:s.peek();
            s.push(i);
        }
        while(!s.isEmpty()){
            s.pop();
        }
        for(int i=0;i<n;i++){
            while(!s.isEmpty() && heights[i]<heights[s.peek()]){
                s.pop();
            }
            ls[i]=s.isEmpty()? -1:s.peek();
            s.push(i);
        }
        int maxarea=0;
        
        for(int i=0;i<n;i++){
            int width=rs[i]-ls[i]-1;
            int currarea=width*heights[i];
            maxarea=Math.max(currarea,maxarea);
        }
        return maxarea;
    }
}