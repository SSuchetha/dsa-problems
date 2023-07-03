/*
Given an array , sort only the odd elements keeping the even numbers in the original position

Example : 
Input : [5,2,1,3,4]
Output : [1,2,3,5,4]
*/

import java.util.*;
public class sort 
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of elements");
		int n=sc.nextInt();
		int [] arr=new int[n];
		List<Integer> list=new ArrayList<>();
		System.out.println("Enter array elements");
		for(int i=0; i<n; i++)
			arr[i]=sc.nextInt();
		for(int i=0; i<n; i++)
			if(arr[i]%2!=0)
				list.add(arr[i]);
		Collections.sort(list);
		for(int i=0; i<n; i++)
			if(arr[i]%2==0)
				list.add(i, arr[i]);
		System.out.println(list);
	}
}
