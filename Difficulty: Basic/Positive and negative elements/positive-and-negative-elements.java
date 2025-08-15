// User function Template for Java
import java.util.*;
class Solution {
    ArrayList<Integer> arranged(ArrayList<Integer> arr) {
        // code here
        int n=arr.size();
        ArrayList<Integer> ans=new ArrayList<>(Collections.nCopies(n, 0));
        int posIndx=0;
        int negIndx=1;
        for(int i=0;i<n;i++){
            if(arr.get(i)>0){
                ans.set(posIndx,arr.get(i));
                posIndx +=2;
        
            }else{
                ans.set(negIndx,arr.get(i));
                negIndx +=2;
            }
        }
        return ans;
    }
}
