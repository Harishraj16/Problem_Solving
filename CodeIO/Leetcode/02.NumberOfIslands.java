class Solution {
    public void make0(char[][] grid,int i,int j){
        int n = grid.length;
        int m = grid[0].length;
        if(i<0 || j<0) return;
        if(i>=n || j>=m) return;
        if(grid[i][j]=='0') return;
        grid[i][j] = '0';
        make0(grid,i-1,j);
        make0(grid,i+1,j);
        make0(grid,i,j-1);
        make0(grid,i,j+1);
    }

    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int count = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]=='1'){
                    count++;
                    make0(grid,i,j);
                }
            }
        }
        return count;
    }
}
