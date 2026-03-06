// User function Template for Java

class Solution {
    ArrayList<Integer> primeRange(int M, int N) {
       ArrayList<Integer>ans=new ArrayList<>();
       for(int i=M;i<=N;i++){
           if(isPrime(i)){
               ans.add(i);
           }
       }
       return ans;
        
    }
    public   boolean isPrime(int n){
        if(n<=1)return false;
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    
}