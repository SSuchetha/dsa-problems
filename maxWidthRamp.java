package maxWidthRamp;
import java.util.*;
public class ramp 
{
	public static int maxWidthRamp(int[] A) 
	{
	    int ans = 0;
	    Stack<Integer> stack = new Stack<>();
	    for (int i = 0; i < A.length; ++i)
	      if (stack.isEmpty() || A[i] < A[stack.peek()])
	        stack.push(i);
	    for (int i = A.length - 1; i > ans; --i)
	      while (!stack.isEmpty() && A[i] >= A[stack.peek()])
	        ans = Math.max(ans, i - stack.pop());
	    return ans;
	}
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] A=new int[n];
		for(int i=0; i<n; i++)
			A[i]=sc.nextInt();
		int ans=maxWidthRamp(A);
		System.out.println(ans);
	}
}
