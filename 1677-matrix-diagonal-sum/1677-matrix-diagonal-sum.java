class Solution {
    public int diagonalSum(int[][] mat) {
        int row = mat.length;
        int sum = 0;
        for(int rows=0;rows<row;rows++){
                sum+=mat[rows][rows];
                sum+=mat[rows][row-1-rows];
        }
        if(row%2!=0){
            sum -= mat[row/2][row/2];
        }
        return sum;
    }
}