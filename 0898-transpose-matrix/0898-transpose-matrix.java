class Solution {
    public int[][] transpose(int[][] matrix) {
        
        int row = matrix.length;  //Row
        int col = matrix[0].length;  //Column
        int[][] res_matrix = new int[col][row];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                res_matrix[j][i] = matrix[i][j];

            }
        }
        return res_matrix;
    }
}