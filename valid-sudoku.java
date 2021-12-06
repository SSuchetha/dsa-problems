/*Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:

Each row must contain the digits 1-9 without repetition.
Each column must contain the digits 1-9 without repetition.
Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.
Note:

A Sudoku board (partially filled) could be valid but is not necessarily solvable.
Only the filled cells need to be validated according to the mentioned rules.*/

class Solution 
{
    public boolean isValidSudoku(char[][] board) 
    {
        HashSet check=new HashSet();
        for(int i=0; i<9; i++)
        {
            for(int j=0; j<9; j++)
            {
                if(board[i][j]!='.')
                {
                    if(!check.add("row"+i+board[i][j]) || !check.add("column"+j+board[i][j]))
                        return false;
                    if(!check.add("box"+(i/3)*3+j/3+board[i][j]))
                        return false;
                }
            }
        }
        return true;
    }
}
