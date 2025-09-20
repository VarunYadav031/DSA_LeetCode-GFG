import java.util.*;

class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int[] nsr = new int[n];  // next smaller to right
        int[] nsl = new int[n];  // next smaller to left
        Stack<Integer> s = new Stack<>();

        // Next Smaller Right
        for (int i = n - 1; i >= 0; i--) {
            while (!s.isEmpty() && heights[s.peek()] >= heights[i]) {
                s.pop();
            }
            nsr[i] = s.isEmpty() ? n : s.peek();
            s.push(i);
        }

        // Clear stack
        s = new Stack<>();

        // Next Smaller Left
        for (int i = 0; i < n; i++) {
            while (!s.isEmpty() && heights[s.peek()] >= heights[i]) {
                s.pop();
            }
            nsl[i] = s.isEmpty() ? -1 : s.peek();
            s.push(i);
        }

        // Find max area
        int maxArea = 0;
        for (int i = 0; i < n; i++) {
            int height = heights[i];
            int width = nsr[i] - nsl[i] - 1;
            int currArea = height * width;
            maxArea = Math.max(maxArea, currArea);
        }

        return maxArea;
    }
}
