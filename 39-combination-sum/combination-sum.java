import java.util.*;

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(candidates, target, 0, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int[] candidates, int target, int index, List<Integer> current, List<List<Integer>> result) {
        // Base case: found a valid combination
        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }
        
        // Out of bounds or target < 0 → stop
        if (index >= candidates.length || target < 0) {
            return;
        }
        
        // 1. Choose current number (stay on same index → reuse allowed)
        current.add(candidates[index]);
        backtrack(candidates, target - candidates[index], index, current, result);
        current.remove(current.size() - 1); // backtrack
        
        // 2. Skip current number (move to next index)
        backtrack(candidates, target, index + 1, current, result);
    }
}
