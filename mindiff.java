import java.io.*;
import java.util.*;
import java.lang.*;

public class Solution {

    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] k=new int[n];
        int [] d=new int[n];
        for(int i=0; i<n; i++)
            k[i]=sc.nextInt();
        for(int i=0; i<n; i++)
            d[i]=sc.nextInt();
        int diff=0;
        int final_diff=Integer.MAX_VALUE;
        Arrays.sort(k);
        Arrays.sort(d);
        int i=0,j=0;
        while(i<n && j<n)
        {
            diff=Math.abs(k[i]-d[j]);
            final_diff=Math.min(diff,final_diff);
            if(k[i]<d[j])
                i++;
            else
                j++;
        }
        System.out.println(final_diff);
    }
}
