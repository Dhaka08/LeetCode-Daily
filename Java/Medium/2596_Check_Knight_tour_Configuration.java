class Solution {
    public boolean helper(int[][] grid,int row, int col, int num){
        int n = grid.length;
        //base case
        if(grid[row][col]==n*n-1) return true;
        int i,j;
        //2 UP 1 RIGHT
        i = row -2;
        j = col +1;
        if(i>=0 && j<n && grid[i][j] == num +1) return helper(grid,i,j,num+1);
        //2 UP 1 LEFT
        i = row -2;
        j = col -1;
        if(i>=0 && j>=0 && grid[i][j] == num+1) return helper(grid,i,j,num+1);
        //2 DOWN 1 RIGHT
        i = row +2;
        j = col +1;
        if(i<n && j<n && grid[i][j] == num+1) return helper(grid,i,j,num+1);
        //2 DOWN 1 LEFT
        i = row +2;
        j = col -1;
        if(i<n && j>=0 && grid[i][j] == num+1) return helper(grid,i,j,num+1);
        //2 RIGHT 1 UP
        i = row -1;
        j = col +2;
        if(i>=0 && j<n && grid[i][j] == num+1) return helper(grid,i,j,num+1);
        //2 RIGHT 1 DOWN
        i = row +1;
        j = col +2;
        if(i<n && j<n && grid[i][j] == num+1) return helper(grid,i,j,num+1);
        //2 LEFT 1 UP
        i = row -1;
        j = col -2;
        if(i>=0 && j>=0 && grid[i][j] == num+1) return helper(grid,i,j,num+1);
        //2 LEFT 1 DOWN
        i = row +1;
        j = col -2;
        if(i<n && j>=0 && grid[i][j] == num+1) return helper(grid,i,j,num+1);

        return false;
    }
    public boolean checkValidGrid(int[][] grid) {
        if(grid[0][0]!=0) return false;
        return helper(grid,0,0,0);
    }
}