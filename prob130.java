/*130. Surrounded Regions

Given an m x n matrix board containing 'X' and 'O', capture all regions that are 4-directionally surrounded by 'X'.

A region is captured by flipping all 'O's into 'X's in that surrounded region.

Example 1:

XXXX
XOOX
XXOX
XOXX

Input: board = [["X","X","X","X"],["X","O","O","X"],["X","X","O","X"],["X","O","X","X"]]
Output: [["X","X","X","X"],["X","X","X","X"],["X","X","X","X"],["X","O","X","X"]]
Explanation: Notice that an 'O' should not be flipped if:
- It is on the border, or
- It is adjacent to an 'O' that should not be flipped.
The bottom 'O' is on the border, so it is not flipped.
The other three 'O' form a surrounded region, so they are flipped.*/

class Solution 
{
    public void visited(char [][] board, int i, int j)
    {
        if(i<0 || i>=board.length || j>=board[i].length || j<0 || board[i][j]!='O')
            return;
        board[i][j]='N';
        visited(board, i+1, j);
        visited(board, i-1, j);
        visited(board, i, j+1);
        visited(board, i, j-1);
    }
    
    public void solve(char[][] board) 
    {
        for(int i=0; i<board.length; i++)   
        {
            visited(board, i, 0);
            visited(board, i, board[i].length-1);
        }
        for(int j=0; j<board[0].length; j++)
        {
            visited(board, 0, j);
            visited(board, board.length-1, j);
        }
        for(int i=0; i<board.length; i++)
        {
            for(int j=0; j<board[i].length; j++)
            {
                if(board[i][j]=='O')
                    board[i][j]='X';
                else if(board[i][j]=='N')
                    board[i][j]='O';
            }
        }
    }
}
