class Solution {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        // code here
      Set<Integer>result=new TreeSet<>();
       int n1=a.length;
       int n2=b.length;
       for(int val:a){
           result.add(val);
       }
       for(int val:b){
           result.add(val);
       }
       return new ArrayList<>(result);
    }
}


//this code for unsorted or arraylist return type
// for array return type
/*
int []result=new int[set.size()];
int i=0;
f0r(int val:set){
    result[i]=val;
    i++;
}



*/