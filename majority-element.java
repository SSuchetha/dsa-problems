import java.util.*;
public class Solution 
{
    public int majorityElement(int[] nums) 
    {
        Arrays.sort(nums);
        int f=0,ff=0,element=0,j;
	for(int i=0; i<nums.length; i=i+f)
	{
		f=1;
		for(j=i+1; j<nums.length; j++)
		{
			if(nums[i]==nums[j])
				f++;
		}	
            	if(f>ff)
            	{
                	ff=f;
                	element=nums[i];
            	}
	}
        return element;
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
