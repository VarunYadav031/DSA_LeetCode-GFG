import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> findDuplicates(int[] arr) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            int x = Math.abs(arr[i]);
            int index = x - 1;

            if (arr[index] < 0) {
                result.add(x);
            } else {
                arr[index] = -arr[index];
            }
        }

        return result;
    }
}
