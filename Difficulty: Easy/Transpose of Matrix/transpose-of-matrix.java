class Solution {
    public ArrayList<ArrayList<Integer>> transpose(int[][] mat) {
        ArrayList<Integer> ans=new ArrayList<>();
        int n=mat.length;
        int m=mat[0].length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<m;j++){
               int temp=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
                
            }
        }
        
        ArrayList<ArrayList<Integer>> matrix=new ArrayList<>();
        for(int i=0;i<m;i++){
            ArrayList<Integer> row=new ArrayList<>();
            for(int j=0;j<n;j++){
                row.add(mat[i][j]);
            }
            matrix.add(row);
        }
        return  matrix;
    
    }
}