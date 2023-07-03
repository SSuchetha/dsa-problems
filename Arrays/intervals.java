import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        HashSet <Integer> set1=new HashSet<>();
        for(int i=a; i<=b; i++)
            set1.add(i);
        HashSet<Integer> set2=new HashSet<>();
        for(int i=c; i<=d; i++)
            set2.add(i);
        boolean index=false;
        for(int i : set1)
        {
            if(set2.contains(i))
            {
                index=true;
                break;
            }
        }
        if(index==true)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
