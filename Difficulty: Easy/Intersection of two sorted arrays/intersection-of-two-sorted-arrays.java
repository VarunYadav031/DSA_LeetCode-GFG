

class Solution {
    public static ArrayList<Integer> intersection(int[] arr1, int[] arr2) {
        ArrayList<Integer> result = new ArrayList<>();
        
        int i = 0, j = 0;
        
        while (i < arr1.length && j < arr2.length) {
            
            if (arr1[i] == arr2[j]) {
                
                // Avoid duplicates in result
                if (result.size() == 0 || result.get(result.size() - 1) != arr1[i]) {
                    result.add(arr1[i]);
                }
                i++;
                j++;
                
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else {
                j++;
            }
        }
        return result;
    }
}

        
    