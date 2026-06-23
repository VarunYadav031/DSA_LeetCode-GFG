class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        TreeSet<Integer> set = new TreeSet<>();
        ArrayList<Integer>ans=new ArrayList<>();
	    for(int i=0;i<a.length;i++){
	        set.add(a[i]);
	       
	    }
	    for(int i=0;i<b.length;i++){
	       set.add(b[i]); 
	    }
	    for(int val:set){
	        ans.add(val);
	    }
	   return  ans; 
        
    }
    
}
