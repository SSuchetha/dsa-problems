class Solution 
{
    public List<Integer> spiralOrder(int[][] matrix) 
    {
        List<Integer> list=new ArrayList<Integer>();
        if(matrix==null || matrix.length==0)
            return list;
        int m=matrix.length,n=matrix[0].length;
        int frow=0,fcol=0,lrow=m-1,lcol=n-1;
        boolean [][] seen=new boolean[m][n];
        char dir='R';
        while(frow<=lrow && fcol<=lcol)
        {
            if(dir=='R')
            {
                for(int i=frow; i<lcol+1; i++)
                {
                    if(seen[frow][i]==false)
                    {
                        list.add(matrix[frow][i]);
                        seen[frow][i]=true;                                
                    }
                }
                frow+=1;
                dir='D';
            }
            if(dir=='D')
            {
                for(int i=frow; i<lrow+1; i++)
                {
                    if(seen[i][lcol]==false)
                    {
                        list.add(matrix[i][lcol]);
                        seen[i][lcol]=true;
                    }
                }
                lcol-=1;
                dir='L';
            }
            if(dir=='L')
            {
                for(int i=lcol; i>fcol-1; i--)
                {
                    if(seen[lrow][i]==false)
                    {
                        list.add(matrix[lrow][i]);
                        seen[lrow][i]=true;
                    }
                }
                lrow-=1;
                dir='U';
            }
            if(dir=='U')
            {
                for(int i=lrow; i>frow-1; i--)
                {
                    if(seen[i][fcol]==false)
                    {
                        list.add(matrix[i][fcol]);
                        seen[i][fcol]=true;
                    }
                }
                fcol+=1;
                dir='R';
            }
        }
        return list;
    }
}
