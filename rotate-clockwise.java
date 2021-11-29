class Solution 
{
    public void rotate(int[][] matrix) 
    {
        int n=matrix.length;
        int temp[][]=new int[n][n];
        int index=n;
        for(int i=0; i<n; i++)
        {
            index--;
            for(int j=n-1; j>=0; j--)
            {
                temp[j][index]=matrix[i][j];
            }
        }
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
                matrix[i][j]=temp[i][j];
        }
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
                System.out.print(matrix[i][j]+" ");
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [][]matrix=new int[n][n];
        for(int i=0; i<n; i++)
          for(int j=0; j<n; j++)
             matrix[i][j]=sc.nextInt();
        rotate(matrix);
    }
}
