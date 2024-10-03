class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        int[][] copy_matrix=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                copy_matrix[i][j]=matrix[i][j];
            }
        }
        for(int i=n-1;i>=0;i--){
            for(int j=0;j<n;j++){
                matrix[j][i]=copy_matrix[n-i-1][j];
            }
        }
    }
}
