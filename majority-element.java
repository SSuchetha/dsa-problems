import java.util.*;
public class Solution 
{
    public int majorityElement(final int[] A) 
    {
        int n=A.length;
        for (int i = 0; i<=n/2; i++)
        {
            int count = 1;
            for (int j = i + 1; j < n; j++)
            {
                if (A[j] == A[i]) 
                    count++;
            }
            if (count > n/2) 
                return A[i];
        }
    return -1;  
    }
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int A[]=new int[n];
        for(int i=0; i<n; i++)
          A[i]=sc.nextInt();
        int res=majorityElement(A);
        System.out.println(res);
    }
}
