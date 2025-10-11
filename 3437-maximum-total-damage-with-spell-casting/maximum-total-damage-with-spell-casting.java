import java.util.*;

class Solution {
    public long maximumTotalDamage(int[] power) {
        Map<Integer, Long> sumMap = new HashMap<>();
        for (int p : power) sumMap.put(p, sumMap.getOrDefault(p, 0L) + p);

        int n = sumMap.size();
        int[] unique = sumMap.keySet().stream().mapToInt(x -> x).toArray();
        Arrays.sort(unique);

        long[] dp = new long[n];

        for (int i = 0; i < n; i++) {
            long take = sumMap.get(unique[i]);
            // Binary search for last compatible spell
            int lo = 0, hi = i - 1, last = -1;
            while (lo <= hi) {
                int mid = lo + (hi - lo) / 2;
                if (unique[i] - unique[mid] > 2) {
                    last = mid;
                    lo = mid + 1;
                } else {
                    hi = mid - 1;
                }
            }
            if (last != -1) take += dp[last];
            dp[i] = i > 0 ? Math.max(dp[i - 1], take) : take;
        }

        return dp[n - 1];
    }
}
