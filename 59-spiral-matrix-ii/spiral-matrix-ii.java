class Solution {
    public int[][] generateMatrix(int n) {
       int [][]matrix=new int[n][n];
       int srow=0;
       int scol=0;
       int erow=n-1;
       int ecol=n-1;
       int val=1;
       while(srow<=erow && scol<=ecol){
       //fill top of matrix
       for(int j=scol;j<=ecol;j++){
        matrix[srow][j]=val;
        val++;
       }
       srow++;
       //fill rightside of matrix
       for(int i=srow;i<=erow;i++){
        matrix[i][ecol]=val;
        val++;
       }
       ecol--;
       //fill buttom of matrix
      if(srow<=erow){
        for(int j=ecol;j>=scol;j--){
            matrix[erow][j]=val;
            val++;
        }
      }
        erow--;
        if(scol<=ecol){
        for(int i=erow;i>=srow;i--){
            matrix[i][scol]=val;
            val++;
        }
        scol++;

      }
    }
       
     return matrix;
      
    }
}
