class Solution {
    public ArrayList<int[]> mergeOverlap(int[][] arr) {
        // Code here
        
   
    
        // Step 1: Sort the intervals by their start time
        Arrays.sort(arr, (a, b) -> a[0] - b[0]);

        // Step 2: Create a list to store merged intervals
        List<int[]> res = new ArrayList<>();

        // Step 3: Add the first interval to result list
        int[] curr_interval = arr[0];
        res.add(curr_interval);

        // Step 4: Traverse the rest of the intervals
        for (int i = 1; i < arr.length; i++) {
            // agar current interval ka start, previous ke end se chhota ya barabar hai
            if (arr[i][0] <= curr_interval[1]) {
                // to dono intervals ko merge karo
                curr_interval[1] = Math.max(curr_interval[1], arr[i][1]);
            } else {
                // agar overlap nahi ho raha to naya interval add karo
                curr_interval = arr[i];
                res.add(curr_interval);
            }
        }

        // Step 5: Convert list back to 2D array
        return new ArrayList<>(res);
        //res.toArray(new int[res.size()][]);
    }
}

