class Solution {
    public void setZeroes(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        Boolean rowZero = false;
        
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
// If an element is zero, we set the first element of the corresponding row and column to 0
                if (matrix[i][j]==0){
                    matrix[0][j]=0;
                    if(i>0){
                        matrix[i][0]=0;
                    }
                    else{
                        rowZero = true;
                    }
                }
            }
        }
// Iterate over the array once again and using the first row and first column, update the elements.
        for(int i=1;i<r;i++){
            for(int j=1;j<c;j++){
                if(matrix[i][0]==0 || matrix[0][j]==0){
                    matrix[i][j]=0;
                }
            }
        }
 // See if the first row needs to be set to zero as well
        if(matrix[0][0]==0){
            for(int i=0;i<r;i++){
                matrix[i][0]=0;
            }
        }
// See if the first column needs to be set to zero as well
        if(rowZero){
            for(int j=0;j<c;j++){
                matrix[0][j]=0;
            }
        }
    }
}