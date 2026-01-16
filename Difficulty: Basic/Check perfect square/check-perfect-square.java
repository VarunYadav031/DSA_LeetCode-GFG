// User function Template for Java
class Solution {
    static int checkPerfectSquare(int N) {
      int root=(int) Math.sqrt(N);
      if(root*root==N){
          return 1;
      }else {
          return 0;
      }
        
    }
}