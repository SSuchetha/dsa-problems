/*200. Number of Islands

Given an m x n 2D binary grid grid which represents a map of '1's (land) and '0's (water), return the number of islands.

An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.

Example 1:

Input: grid = [
  ["1","1","1","1","0"],
  ["1","1","0","1","0"],
  ["1","1","0","0","0"],
  ["0","0","0","0","0"]
]
Output: 1*/

class Solution 
{
    
    public void visited(char [][] grid, int i, int j)
    {
        if(i<0 || j<0 || i>=grid.length || j>=grid[i].length || grid[i][j]!='1')
            return;
        grid[i][j]='2';
        visited(grid, i-1, j);
        visited(grid, i+1, j);
        visited(grid, i, j-1);
        visited(grid, i, j+1);
    }
    
    public int numIslands(char[][] grid) 
    {
        int num=0;
        for(int i=0; i<grid.length; i++)
        {
            for(int j=0; j<grid[i].length; j++)
            {
                if(grid[i][j]=='1')
                {
                    visited(grid, i, j);
                    num++;
                }
            }
        }
        return num;
    }
}
