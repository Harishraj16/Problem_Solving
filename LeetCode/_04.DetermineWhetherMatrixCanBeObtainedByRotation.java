//1886. Determine Whether Matrix Can Be Obtained By Rotation

class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        int n = mat.length;
        boolean[] res = new boolean[]{true,true,true,true};
        //if(n!=target.length) return false;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]!=target[n-j-1][i]) res[0]=false;
                if(mat[i][j]!=target[n-1-i][n-j-1]) res[1]=false;
                if(mat[i][j]!=target[j][n-1-i]) res[2]=false;
                if(mat[i][j]!=target[i][j]) res[3]=false;
            }
        }
        return res[0]||res[1]||res[2]||res[3];
    }
}
