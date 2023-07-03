class Solution 
{
    public int[][] matrixReshape(int[][] mat, int r, int c) 
    {
        int [][] temp=new int[r][c];
        int index=0;
        if(mat.length == 0 || r * c != mat.length * mat[0].length)
            return mat;
        int i=0;
        for(int [] row:mat)
        {
            for(int num:row)
            {
                temp[i/c][i%c]=num;
                i++;   
            }
        }    
        return temp;
    }
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int [] mat=new int[m][n];
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
                mat[i][j]=sc.nextInt();
        }
        int r=sc.nextInt();
        int c=sc.nextInt();
        int res[][]=new int[r][c];
        res=matrixReshape(mat,r,c);
        for(int i=0; i<r; i++)
        {
            for(int j=0; j<c; j++)
                System.out.print(res[i][j]);
            System.out.println();
        }
    }
}
