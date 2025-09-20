import java.util.*;

class StockSpanner {
    Stack<Integer> stack;         // stack stores indices
    ArrayList<Integer> prices;    // stores all stock prices

    public StockSpanner() {
        stack = new Stack<>();
        prices = new ArrayList<>();
    }
    
    public int next(int price) {
        // add current price into list
        prices.add(price);
        int i = prices.size() - 1;  // current index

        // remove all previous indices where price <= current price
    while (!stack.isEmpty() && prices.get(stack.peek()) <= price) {
            stack.pop();
        }

        int span;
        if (stack.isEmpty()) {
            span = i + 1;  // pura prefix span
        } else {
      span = i - stack.peek(); // distance from prev greater element
        }

        stack.push(i); // current index ko stack me daal do
        return span;
    }

   
}
