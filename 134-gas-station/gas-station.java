class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGas = 0, tank = 0, start = 0;

        for (int i = 0; i < gas.length; i++) {
            int diff = gas[i] - cost[i];
            totalGas += diff;
            tank += diff;

            if (tank < 0) {
                // Can't start from previous station, reset start
                start = i + 1;
                tank = 0;
            }
        }

        return totalGas >= 0 ? start : -1;
    }
}
