import java.util.*;

class Solution {
    public ArrayList<Integer> calculateSpan(int[] arr) {
        ArrayList<Integer> span = new ArrayList<>();
        Stack<Integer> s = new Stack<>();
        
        // First element ka span = 1
        span.add(1);
        s.push(0);

        for (int i = 1; i < arr.length; i++) {
            int currPrice = arr[i];

            while (!s.isEmpty() && arr[s.peek()] <= currPrice) {
                s.pop();
            }

            if (s.isEmpty()) {
                span.add(i + 1);
            } else {
                int prevHigh = s.peek();
                span.add(i - prevHigh);
            }

            s.push(i);
        }

        return span;
    }

   
}
