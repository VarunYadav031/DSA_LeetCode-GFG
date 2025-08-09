class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int largest=Integer.MIN_VALUE;
        int sl=Integer.MIN_VALUE;//sl-->secondlargest
        for(int val:arr){
            if(val>largest){
                
                sl=largest;
                largest=val;
            }
                else if(val<largest && val>sl){
                     sl=val;;
                
            }
        }
        return (sl==Integer.MIN_VALUE)? -1:sl;
    }
}