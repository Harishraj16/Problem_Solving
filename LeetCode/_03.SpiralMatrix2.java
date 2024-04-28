//59. Spiral Matrix II

class Solution {
    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        int num = 1;
        int left=0,right=n-1,bottom=n-1,top=0;
        while(left<=right && top<=bottom){
            for(int i=left;i<=right;i++){
                res[top][i] = num++;
            }
            top++;
            for(int i=top;i<=bottom;i++){
                res[i][right] = num++;
            }
            right--;
            if(left<=right){ 
                for(int i=right;i>=left;i--){
                    res[bottom][i] = num++;
                }
                bottom--;
            }
            if(top<=bottom){
                for(int i=bottom;i>=top;i--){
                    res[i][left] = num++;
                }
                left++;
            }
        }
        return res;
    }
}
