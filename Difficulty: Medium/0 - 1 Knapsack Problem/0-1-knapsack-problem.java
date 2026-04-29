import java.util.Arrays;

class Solution {
    public int knapsack(int W, int val[], int wt[]) {
        int n = val.length;
        int dp[][] = new int[n + 1][W + 1];

        for(int i = 0; i <= n; i++){
            Arrays.fill(dp[i], -1);
        }

        return knapsacktest(W, wt, val, n, dp);
    }

    public static int knapsacktest(int W, int wt[], int val[], int n, int dp[][]) {
        if(n == 0 || W == 0){
            return 0;
        }

        if(dp[n][W] != -1){
            return dp[n][W];
        }

        if(wt[n-1] <= W){
            int ans1 = val[n-1] + knapsacktest(W - wt[n-1], wt, val, n-1, dp);
            int ans2 = knapsacktest(W, wt, val, n-1, dp);
            dp[n][W] = Math.max(ans1, ans2);
        } else {
            dp[n][W] = knapsacktest(W, wt, val, n-1, dp);
        }

        return dp[n][W];
    }
}